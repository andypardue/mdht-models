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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HistoryAndPhysicalNote2Impl extends USRealmHeader2Impl implements HistoryAndPhysicalNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2Component1374(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Component1374(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentStructuredBody1375(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBody1375(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryAndPhysicalNote2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public HistoryAndPhysicalNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HistoryAndPhysicalNote2Impl
