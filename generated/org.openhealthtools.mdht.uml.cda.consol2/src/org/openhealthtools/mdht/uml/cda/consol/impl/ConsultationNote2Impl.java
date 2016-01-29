/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
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

import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConsultationNote2Impl extends USRealmHeader2Impl implements ConsultationNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONSULTATION_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2InFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2Component1214(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2Component1214(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2InFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2InFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyProblemSection21244(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyProblemSection21244(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyResultsSection21248(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyResultsSection21248(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBodyNutritionSection1264(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyNutritionSection1264(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentStructuredBody1215(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBody1215(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ConsultationNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ConsultationNote2Impl
