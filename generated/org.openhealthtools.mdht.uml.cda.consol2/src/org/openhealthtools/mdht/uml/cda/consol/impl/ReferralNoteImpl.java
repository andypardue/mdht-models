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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReferralNote;

import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReferralNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReferralNoteImpl extends USRealmHeader2Impl implements ReferralNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REFERRAL_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiver(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContact(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContact(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponent776(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponent776(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteParticipantCaregiverTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentProblemSection2789(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentProblemSection2789(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentResultsSection2793(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentResultsSection2793(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentNutritionSection807(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentNutritionSection807(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentAssessmentSection815(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAssessmentSection815(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyFamilyHistorySection2784(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyFamilyHistorySection2784(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyImmunizationsSection2786(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyImmunizationsSection2786(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyProblemSection2788(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyProblemSection2788(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyResultsSection2792(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyResultsSection2792(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodySocialHistorySection2796(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodySocialHistorySection2796(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyVitalSignsSection2798(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyVitalSignsSection2798(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyPhysicalExamSection2802(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyPhysicalExamSection2802(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyNutritionSection806(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyNutritionSection806(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyMentalStatusSection808(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyMentalStatusSection808(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyAllergiesSection2812(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAllergiesSection2812(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyAssessmentSection814(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAssessmentSection814(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyGeneralStatusSection820(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyGeneralStatusSection820(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyMedicationsSection2822(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyMedicationsSection2822(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBodyReasonForReferralSection2824(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyReasonForReferralSection2824(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralNoteComponentStructuredBody777(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteComponentStructuredBody777(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferralNote init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ReferralNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ReferralNoteImpl
