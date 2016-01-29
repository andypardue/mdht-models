/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getReferralNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2 ReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent ReferralNoteCode ReferralNoteCodeP ReferralNoteInformationRecipient ReferralNoteComponent776 ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientInformationRecipient ReferralNoteInformationRecipientIntendedRecipient ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson ReferralNoteParticipantCaregiverTypeCode ReferralNoteParticipantCaregiverAssociatedEntity ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityClassCode ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity ReferralNoteComponentStructuredBodyComponentProblemSection2789 ReferralNoteComponentStructuredBodyComponentAllergiesSection2813 ReferralNoteComponentStructuredBodyComponentMedicationsSection2823 ReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825 ReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778 ReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780 ReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782 ReferralNoteComponentStructuredBodyFamilyHistorySection2784 ReferralNoteComponentStructuredBodyImmunizationsSection2786 ReferralNoteComponentStructuredBodyProblemSection2788 ReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790 ReferralNoteComponentStructuredBodyResultsSection2792 ReferralNoteComponentStructuredBodyReviewOfSystemsSection794 ReferralNoteComponentStructuredBodySocialHistorySection2796 ReferralNoteComponentStructuredBodyVitalSignsSection2798 ReferralNoteComponentStructuredBodyFunctionalStatusSection2800 ReferralNoteComponentStructuredBodyPhysicalExamSection2802 ReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804 ReferralNoteComponentStructuredBodyNutritionSection806 ReferralNoteComponentStructuredBodyMentalStatusSection808 ReferralNoteComponentStructuredBodyMedicalEquipmentSection2810 ReferralNoteComponentStructuredBodyAllergiesSection2812 ReferralNoteComponentStructuredBodyAssessmentSection814 ReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816 ReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818 ReferralNoteComponentStructuredBodyGeneralStatusSection820 ReferralNoteComponentStructuredBodyMedicationsSection2822 ReferralNoteComponentStructuredBodyReasonForReferralSection2824 ReferralNoteComponentStructuredBody777' templateId.root='2.16.840.1.113883.10.20.22.1.14' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.ReferralNoteCode='ReferralNoteCodeP' constraints.validation.warning='ReferralNoteParticipantCaregiver ReferralNoteParticipantCallbackContact ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteParticipantCallbackContactAssociatedEntityAddr ReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779 ReferralNoteComponentStructuredBodyComponentResultsSection2793 ReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801 ReferralNoteComponentStructuredBodyComponentNutritionSection807 ReferralNoteComponentStructuredBodyComponentMentalStatusSection809' constraints.validation.query='ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteInformationRecipientIntendedRecipientInformationRecipient ReferralNoteInformationRecipientIntendedRecipient ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson ReferralNoteParticipantCaregiverTypeCode ReferralNoteParticipantCaregiverAssociatedEntity ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityAddr ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityClassCode ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity ReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779 ReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781 ReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783 ReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785 ReferralNoteComponentStructuredBodyComponentImmunizationsSection2787 ReferralNoteComponentStructuredBodyComponentProblemSection2789 ReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791 ReferralNoteComponentStructuredBodyComponentResultsSection2793 ReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795 ReferralNoteComponentStructuredBodyComponentSocialHistorySection2797 ReferralNoteComponentStructuredBodyComponentVitalSignsSection2799 ReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801 ReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803 ReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805 ReferralNoteComponentStructuredBodyComponentNutritionSection807 ReferralNoteComponentStructuredBodyComponentMentalStatusSection809 ReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811 ReferralNoteComponentStructuredBodyComponentAllergiesSection2813 ReferralNoteComponentStructuredBodyComponentAssessmentSection815 ReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817 ReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819 ReferralNoteComponentStructuredBodyComponentGeneralStatusSection821 ReferralNoteComponentStructuredBodyComponentMedicationsSection2823 ReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825 ReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778 ReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780 ReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782 ReferralNoteComponentStructuredBodyFamilyHistorySection2784 ReferralNoteComponentStructuredBodyImmunizationsSection2786 ReferralNoteComponentStructuredBodyProblemSection2788 ReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790 ReferralNoteComponentStructuredBodyResultsSection2792 ReferralNoteComponentStructuredBodyReviewOfSystemsSection794 ReferralNoteComponentStructuredBodySocialHistorySection2796 ReferralNoteComponentStructuredBodyVitalSignsSection2798 ReferralNoteComponentStructuredBodyFunctionalStatusSection2800 ReferralNoteComponentStructuredBodyPhysicalExamSection2802 ReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804 ReferralNoteComponentStructuredBodyNutritionSection806 ReferralNoteComponentStructuredBodyMentalStatusSection808 ReferralNoteComponentStructuredBodyMedicalEquipmentSection2810 ReferralNoteComponentStructuredBodyAllergiesSection2812 ReferralNoteComponentStructuredBodyAssessmentSection814 ReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816 ReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818 ReferralNoteComponentStructuredBodyGeneralStatusSection820 ReferralNoteComponentStructuredBodyMedicationsSection2822 ReferralNoteComponentStructuredBodyReasonForReferralSection2824 ReferralNoteComponentStructuredBody777' constraints.validation.dependOn.ReferralNoteParticipantCaregiverAssociatedEntityClassCode='ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP' constraints.validation.info='ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization ReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781 ReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783 ReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785 ReferralNoteComponentStructuredBodyComponentImmunizationsSection2787 ReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791 ReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795 ReferralNoteComponentStructuredBodyComponentSocialHistorySection2797 ReferralNoteComponentStructuredBodyComponentVitalSignsSection2799 ReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803 ReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805 ReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811 ReferralNoteComponentStructuredBodyComponentAssessmentSection815 ReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817 ReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819 ReferralNoteComponentStructuredBodyComponentGeneralStatusSection821'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipient constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipient constraints.validation.warning='ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom' constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientInformationRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipientPerson constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiver typeCode='IND' constraints.validation.error='ReferralNoteParticipantCaregiverTypeCode ReferralNoteParticipantCaregiverAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiverAssociatedEntity constraints.validation.error='ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson' constraints.validation.dependOn.ReferralNoteParticipantCaregiverAssociatedEntityClassCode='ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson constraints.validation.error='ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContact typeCode='CALLBCK' constraints.validation.error='ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContactAssociatedEntity constraints.validation.error='ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityClassCode ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson' constraints.validation.warning='ReferralNoteParticipantCallbackContactAssociatedEntityAddr' classCode='ASSIGNED' constraints.validation.info='ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson constraints.validation.error='ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteComponent constraints.validation.error='ReferralNoteComponentStructuredBody777 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentProblemSection2789 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAllergiesSection2813 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentMedicationsSection2823 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825 ComponentReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778 ComponentReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780 ComponentReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782 ComponentReferralNoteComponentStructuredBodyFamilyHistorySection2784 ComponentReferralNoteComponentStructuredBodyImmunizationsSection2786 ComponentReferralNoteComponentStructuredBodyProblemSection2788 ComponentReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790 ComponentReferralNoteComponentStructuredBodyResultsSection2792 ComponentReferralNoteComponentStructuredBodyReviewOfSystemsSection794 ComponentReferralNoteComponentStructuredBodySocialHistorySection2796 ComponentReferralNoteComponentStructuredBodyVitalSignsSection2798 ComponentReferralNoteComponentStructuredBodyFunctionalStatusSection2800 ComponentReferralNoteComponentStructuredBodyPhysicalExamSection2802 ComponentReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804 ComponentReferralNoteComponentStructuredBodyNutritionSection806 ComponentReferralNoteComponentStructuredBodyMentalStatusSection808 ComponentReferralNoteComponentStructuredBodyMedicalEquipmentSection2810 ComponentReferralNoteComponentStructuredBodyAllergiesSection2812 ComponentReferralNoteComponentStructuredBodyAssessmentSection814 ComponentReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816 ComponentReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818 ComponentReferralNoteComponentStructuredBodyGeneralStatusSection820 ComponentReferralNoteComponentStructuredBodyMedicationsSection2822 ComponentReferralNoteComponentStructuredBodyReasonForReferralSection2824' constraints.validation.warning='ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentResultsSection2793 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentNutritionSection807 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentMentalStatusSection809' constraints.validation.query='ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentImmunizationsSection2787 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentProblemSection2789 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentResultsSection2793 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentSocialHistorySection2797 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentVitalSignsSection2799 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentNutritionSection807 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentMentalStatusSection809 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAllergiesSection2813 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentSection815 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentGeneralStatusSection821 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentMedicationsSection2823 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825 ComponentReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778 ComponentReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780 ComponentReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782 ComponentReferralNoteComponentStructuredBodyFamilyHistorySection2784 ComponentReferralNoteComponentStructuredBodyImmunizationsSection2786 ComponentReferralNoteComponentStructuredBodyProblemSection2788 ComponentReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790 ComponentReferralNoteComponentStructuredBodyResultsSection2792 ComponentReferralNoteComponentStructuredBodyReviewOfSystemsSection794 ComponentReferralNoteComponentStructuredBodySocialHistorySection2796 ComponentReferralNoteComponentStructuredBodyVitalSignsSection2798 ComponentReferralNoteComponentStructuredBodyFunctionalStatusSection2800 ComponentReferralNoteComponentStructuredBodyPhysicalExamSection2802 ComponentReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804 ComponentReferralNoteComponentStructuredBodyNutritionSection806 ComponentReferralNoteComponentStructuredBodyMentalStatusSection808 ComponentReferralNoteComponentStructuredBodyMedicalEquipmentSection2810 ComponentReferralNoteComponentStructuredBodyAllergiesSection2812 ComponentReferralNoteComponentStructuredBodyAssessmentSection814 ComponentReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816 ComponentReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818 ComponentReferralNoteComponentStructuredBodyGeneralStatusSection820 ComponentReferralNoteComponentStructuredBodyMedicationsSection2822 ComponentReferralNoteComponentStructuredBodyReasonForReferralSection2824' constraints.validation.info='ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentImmunizationsSection2787 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentSocialHistorySection2797 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentVitalSignsSection2799 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentSection815 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819 ComponentStructuredBodyReferralNoteComponentStructuredBodyComponentGeneralStatusSection821'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteComponentStructuredBody constraints.validation.error='ReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778 ReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780 ReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782 ReferralNoteComponentStructuredBodyFamilyHistorySection2784 ReferralNoteComponentStructuredBodyImmunizationsSection2786 ReferralNoteComponentStructuredBodyProblemSection2788 ReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790 ReferralNoteComponentStructuredBodyResultsSection2792 ReferralNoteComponentStructuredBodyReviewOfSystemsSection794 ReferralNoteComponentStructuredBodySocialHistorySection2796 ReferralNoteComponentStructuredBodyVitalSignsSection2798 ReferralNoteComponentStructuredBodyFunctionalStatusSection2800 ReferralNoteComponentStructuredBodyPhysicalExamSection2802 ReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804 ReferralNoteComponentStructuredBodyNutritionSection806 ReferralNoteComponentStructuredBodyMentalStatusSection808 ReferralNoteComponentStructuredBodyMedicalEquipmentSection2810 ReferralNoteComponentStructuredBodyAllergiesSection2812 ReferralNoteComponentStructuredBodyAssessmentSection814 ReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816 ReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818 ReferralNoteComponentStructuredBodyGeneralStatusSection820 ReferralNoteComponentStructuredBodyMedicationsSection2822 ReferralNoteComponentStructuredBodyReasonForReferralSection2824 StructuredBodyReferralNoteComponentStructuredBodyComponentProblemSection2789 StructuredBodyReferralNoteComponentStructuredBodyComponentAllergiesSection2813 StructuredBodyReferralNoteComponentStructuredBodyComponentMedicationsSection2823 StructuredBodyReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825' constraints.validation.warning='StructuredBodyReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779 StructuredBodyReferralNoteComponentStructuredBodyComponentResultsSection2793 StructuredBodyReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801 StructuredBodyReferralNoteComponentStructuredBodyComponentNutritionSection807 StructuredBodyReferralNoteComponentStructuredBodyComponentMentalStatusSection809' constraints.validation.query='StructuredBodyReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779 StructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781 StructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783 StructuredBodyReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785 StructuredBodyReferralNoteComponentStructuredBodyComponentImmunizationsSection2787 StructuredBodyReferralNoteComponentStructuredBodyComponentProblemSection2789 StructuredBodyReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791 StructuredBodyReferralNoteComponentStructuredBodyComponentResultsSection2793 StructuredBodyReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795 StructuredBodyReferralNoteComponentStructuredBodyComponentSocialHistorySection2797 StructuredBodyReferralNoteComponentStructuredBodyComponentVitalSignsSection2799 StructuredBodyReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801 StructuredBodyReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803 StructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805 StructuredBodyReferralNoteComponentStructuredBodyComponentNutritionSection807 StructuredBodyReferralNoteComponentStructuredBodyComponentMentalStatusSection809 StructuredBodyReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811 StructuredBodyReferralNoteComponentStructuredBodyComponentAllergiesSection2813 StructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentSection815 StructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817 StructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819 StructuredBodyReferralNoteComponentStructuredBodyComponentGeneralStatusSection821 StructuredBodyReferralNoteComponentStructuredBodyComponentMedicationsSection2823 StructuredBodyReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825' constraints.validation.info='StructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781 StructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783 StructuredBodyReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785 StructuredBodyReferralNoteComponentStructuredBodyComponentImmunizationsSection2787 StructuredBodyReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791 StructuredBodyReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795 StructuredBodyReferralNoteComponentStructuredBodyComponentSocialHistorySection2797 StructuredBodyReferralNoteComponentStructuredBodyComponentVitalSignsSection2799 StructuredBodyReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803 StructuredBodyReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805 StructuredBodyReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811 StructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentSection815 StructuredBodyReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817 StructuredBodyReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819 StructuredBodyReferralNoteComponentStructuredBodyComponentGeneralStatusSection821'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteComponentStructuredBodyComponent constraints.validation.warning='ReferralNoteComponentStructuredBodyComponentMentalStatusSection809' constraints.validation.info='ReferralNoteComponentStructuredBodyComponentGeneralStatusSection821' constraints.validation.error='ReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825'"
 * @generated
 */
public interface ReferralNote extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReferralNoteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReferralNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->one(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::IND)->notEmpty()'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::CALLBCK)->notEmpty()'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContact(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))'"
	 * @generated
	 */
	boolean validateReferralNoteComponent776(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() >= 1))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() >= 1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and \nlet value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in \nvalue = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND)->select(typeCode=vocab::ParticipationType::IND)->reject(typeCode=vocab::ParticipationType::IND)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND)->select(typeCode=vocab::ParticipationType::IND)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() >= 1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() >= 1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::ASSIGNED)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK)->select(typeCode=vocab::ParticipationType::CALLBCK)->reject(typeCode=vocab::ParticipationType::CALLBCK)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CALLBCK)->select(typeCode=vocab::ParticipationType::CALLBCK)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentProblemSection2789(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentResultsSection2793(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentNutritionSection807(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentAssessmentSection815(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyFamilyHistorySection2784(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyImmunizationsSection2786(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyProblemSection2788(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyResultsSection2792(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodySocialHistorySection2796(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyVitalSignsSection2798(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyPhysicalExamSection2802(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyNutritionSection806(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyMentalStatusSection808(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyAllergiesSection2812(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyAssessmentSection814(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyGeneralStatusSection820(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyMedicationsSection2822(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBodyReasonForReferralSection2824(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))'"
	 * @generated
	 */
	boolean validateReferralNoteComponentStructuredBody777(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferralNote init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ReferralNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ReferralNote
