/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;

import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.TransferSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TransferSummaryImpl extends USRealmHeader2Impl implements TransferSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.TRANSFER_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupport(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupport(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContact(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContact(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponent826(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponent826(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformer1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformer1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyAllergiesSection2830(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAllergiesSection2830(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyEncountersSection2834(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyEncountersSection2834(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyMedicationsSection2846(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyMedicationsSection2846(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyPayersSection2848(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyPayersSection2848(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyProblemSection2852(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyProblemSection2852(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyProceduresSection2854(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyProceduresSection2854(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyResultsSection2856(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyResultsSection2856(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodySocialHistorySection2858(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodySocialHistorySection2858(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyMentalStatusSection862(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyMentalStatusSection862(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyNutritionSection868(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyNutritionSection868(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyAssessmentSection878(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAssessmentSection878(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryComponentStructuredBody827(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryComponentStructuredBody827(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferSummary init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public TransferSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TransferSummaryImpl
