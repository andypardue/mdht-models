/**
 */
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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

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
public class ConsultationNote2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNote2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2CodeP(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2CodeP(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2CodeP(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2CodeP(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2CodeP(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2CodeP"),
						 new Object [] { consultationNote2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2CodeP", passToken);
				}
				passToken.add(consultationNote2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2Code(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2Code(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11488-4' or value.code = '34100-8' or value.code = '34104-0' or value.code = '51845-6' or value.code = '51853-0' or value.code = '51846-4' or value.code = '34101-6' or value.code = '34749-2' or value.code = '34102-4' or value.code = '34099-2' or value.code = '34756-7' or value.code = '34758-3' or value.code = '34760-9' or value.code = '34879-7' or value.code = '34761-7' or value.code = '34764-1' or value.code = '34771-6' or value.code = '34776-5' or value.code = '34777-3' or value.code = '34779-9' or value.code = '34781-5' or value.code = '34783-1' or value.code = '34785-6' or value.code = '34795-5' or value.code = '34797-1' or value.code = '34798-9' or value.code = '34800-3' or value.code = '34803-7' or value.code = '34855-7' or value.code = '34805-2' or value.code = '34807-8' or value.code = '34810-2' or value.code = '34812-8' or value.code = '34814-4' or value.code = '34816-9' or value.code = '34820-1' or value.code = '34822-7' or value.code = '34824-3' or value.code = '34826-8' or value.code = '34828-4' or value.code = '34788-0' or value.code = '34791-4' or value.code = '34103-2' or value.code = '34831-8' or value.code = '34833-4' or value.code = '34835-9' or value.code = '34837-5' or value.code = '34839-1' or value.code = '34841-7' or value.code = '34845-8' or value.code = '34847-4' or value.code = '34849-0' or value.code = '34851-6' or value.code = '34853-2'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2Code(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2Code(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2Code(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(consultationNote2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_CODE,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2Code"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2Participant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2Participant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2Participant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2Participant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2Participant(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2Participant"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2InFulfillmentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2InFulfillmentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2InFulfillmentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2InFulfillmentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2InFulfillmentOf(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_IN_FULFILLMENT_OF,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2InFulfillmentOf"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOf(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNote2ComponentOf(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOf"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2Component1214(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component1214</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2Component1214(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2Component1214(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component1214</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2Component1214(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConsultationNote2Component1214(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT1214,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2Component1214"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityAssociatedPersonName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityClassCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityClassCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::ASSIGNED)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityClassCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityClassCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityClassCode(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityId(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityAddr(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityAddr(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityAddr(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityAddr(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityAddr(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityAddr"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityTelecom(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityTelecom(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityTelecom(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityTelecom(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityTelecom(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityTelecom"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityAssociatedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntityScopingOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantTypeCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantTypeCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::CALLBCK)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantTypeCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantTypeCode(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantTypeCode(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ParticipantAssociatedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ParticipantAssociatedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ParticipantAssociatedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ParticipantAssociatedEntity(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ParticipantAssociatedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2InFulfillmentOfOrderId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2InFulfillmentOfOrderId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2InFulfillmentOfOrderId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2InFulfillmentOfOrderId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2InFulfillmentOfOrderId(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2InFulfillmentOfOrderId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2InFulfillmentOfOrder(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2InFulfillmentOfOrder(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2InFulfillmentOfOrder(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2InFulfillmentOfOrder(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2InFulfillmentOfOrder(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2InFulfillmentOfOrder"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 8))))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 12))))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 14))))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject((not value.oclIsUndefined() and value.size() > 8 implies value.size() >= 15) and ((not low.value.oclIsUndefined() and low.value.size() > 8 implies low.value.size() >= 15) and (not high.value.oclIsUndefined() and high.value.size() > 8 implies high.value.size() >= 15)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Organization Or Both</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Organization Or Both</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Organization Or Both</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Organization Or Both</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterId(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterResponsibleParty"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->exists(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounter(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounter(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentOfEncompassingEncounter(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentOfEncompassingEncounter(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateConsultationNote2ComponentOfEncompassingEncounter(
			ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentOfEncompassingEncounter"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Assessment Section1217</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Assessment Section1217</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Assessment And Plan Section21219</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Assessment And Plan Section21219</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Plan Of Treatment Section21221</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Plan Of Treatment Section21221</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Reason For Visit Section1223</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Reason For Visit Section1223</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component History Of Present Illness Section1225</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component History Of Present Illness Section1225</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Physical Exam Section21227</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Physical Exam Section21227</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Allergies Section21229</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Allergies Section21229</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Chief Complaint Section1231</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Chief Complaint Section1231</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1233</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1233</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Family History Section21235</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Family History Section21235</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component General Status Section1237</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component General Status Section1237</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component History Of Past Illness Section21239</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component History Of Past Illness Section21239</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Immunizations Section Entries Optional21241</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Immunizations Section Entries Optional21241</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Medications Section21243</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Medications Section21243</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Problem Section21245</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Problem Section21245</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentProblemSection21245"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Procedures Section Entries Optional21247</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Procedures Section Entries Optional21247</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Results Section21249</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Results Section21249</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentResultsSection21249"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Social History Section21251</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Social History Section21251</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Vital Signs Section21253</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Vital Signs Section21253</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Advance Directives Section Entries Optional21255</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Advance Directives Section Entries Optional21255</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Functional Status Section21257</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Functional Status Section21257</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Review Of Systems Section1259</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Review Of Systems Section1259</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Medical Equipment Section21261</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Medical Equipment Section21261</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Mental Status Section1263</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Mental Status Section1263</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Nutrition Section1265</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Nutrition Section1265</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyComponentNutritionSection1265"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Assessment Section1216</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Assessment Section1216</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyAssessmentSection1216"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Assessment And Plan Section21218</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Assessment And Plan Section21218</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Plan Of Treatment Section21220</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Plan Of Treatment Section21220</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Reason For Visit Section1222</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Reason For Visit Section1222</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyReasonForVisitSection1222"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body History Of Present Illness Section1224</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body History Of Present Illness Section1224</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Physical Exam Section21226</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Physical Exam Section21226</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyPhysicalExamSection21226"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Allergies Section21228</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Allergies Section21228</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyAllergiesSection21228"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Chief Complaint Section1230</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Chief Complaint Section1230</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyChiefComplaintSection1230"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Chief Complaint And Reason For Visit Section1232</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Chief Complaint And Reason For Visit Section1232</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Family History Section21234</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Family History Section21234</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyFamilyHistorySection21234"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body General Status Section1236</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body General Status Section1236</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyGeneralStatusSection1236"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body History Of Past Illness Section21238</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body History Of Past Illness Section21238</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Immunizations Section Entries Optional21240</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Immunizations Section Entries Optional21240</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Medications Section21242</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Medications Section21242</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyMedicationsSection21242"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyProblemSection21244(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Problem Section21244</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyProblemSection21244(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyProblemSection21244(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Problem Section21244</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyProblemSection21244(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyProblemSection21244(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyProblemSection21244"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Procedures Section Entries Optional21246</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Procedures Section Entries Optional21246</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyResultsSection21248(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Results Section21248</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyResultsSection21248(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyResultsSection21248(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Results Section21248</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyResultsSection21248(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyResultsSection21248(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyResultsSection21248"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Social History Section21250</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Social History Section21250</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodySocialHistorySection21250"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Vital Signs Section21252</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Vital Signs Section21252</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyVitalSignsSection21252"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Advance Directives Section Entries Optional21254</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Advance Directives Section Entries Optional21254</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Functional Status Section21256</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Functional Status Section21256</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Review Of Systems Section1258</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Review Of Systems Section1258</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Medical Equipment Section21260</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Medical Equipment Section21260</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Mental Status Section1262</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Mental Status Section1262</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyMentalStatusSection1262"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBodyNutritionSection1264(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Nutrition Section1264</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyNutritionSection1264(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBodyNutritionSection1264(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Nutrition Section1264</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBodyNutritionSection1264(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBodyNutritionSection1264(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBodyNutritionSection1264"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNote2ComponentStructuredBody1215(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body1215</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBody1215(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNote2ComponentStructuredBody1215(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body1215</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNote2ComponentStructuredBody1215(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateConsultationNote2ComponentStructuredBody1215(ConsultationNote2 consultationNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(consultationNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2ConsultationNote2ComponentStructuredBody1215"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.4' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote2 The receiving '<em><b>Consultation Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(ConsultationNote2 consultationNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONSULTATION_NOTE2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ConsultationNote2GeneralHeaderConstraintsTemplateId"),
						 new Object [] { consultationNote2 }));
			}
			 
			return false;
		}
		return true;
	}

} // ConsultationNote2Operations
