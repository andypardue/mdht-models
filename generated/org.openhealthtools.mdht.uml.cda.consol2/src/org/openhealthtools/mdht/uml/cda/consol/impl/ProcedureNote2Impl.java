/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureNote2Impl extends USRealmHeader2Impl implements ProcedureNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2Authorization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2Authorization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2Component1452(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2Component1452(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ParticipantAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ParticipantFunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ParticipantFunctionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ParticipantFunctionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ParticipantFunctionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventProcedureCodes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2AuthorizationConsentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2AuthorizationConsentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2AuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2AuthorizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2AuthorizationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2AuthorizationConsent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNote2ComponentStructuredBody1453(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBody1453(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNote2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureNote2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProcedureNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureNote2Impl
