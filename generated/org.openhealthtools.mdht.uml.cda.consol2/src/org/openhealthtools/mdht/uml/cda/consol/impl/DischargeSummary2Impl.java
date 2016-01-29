/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
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

import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummary2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Summary2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DischargeSummary2Impl extends USRealmHeader2Impl implements DischargeSummary2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummary2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_SUMMARY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2Component1318(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2Component1318(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentStructuredBody1319(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBody1319(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeSummary2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public DischargeSummary2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // DischargeSummary2Impl
