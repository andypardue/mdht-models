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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHealthConcernAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HealthConcernActTemplateId HealthConcernActClassCode HealthConcernActMoodCode HealthConcernActId HealthConcernActCode HealthConcernActCodeP HealthConcernActStatusCode HealthConcernActStatusCodeP HealthConcernActEntryRelationship634 HealthConcernActEntryRelationship636 HealthConcernActEntryRelationship638 HealthConcernActEntryRelationship640 HealthConcernActEntryRelationship642 HealthConcernActEntryRelationship644 HealthConcernActEntryRelationship646 HealthConcernActEntryRelationship648 HealthConcernActEntryRelationship650 HealthConcernActEntryRelationship652 HealthConcernActEntryRelationship654 HealthConcernActEntryRelationship656 HealthConcernActEntryRelationship658 HealthConcernActEntryRelationship660 HealthConcernActEntryRelationship662 HealthConcernActEntryRelationship664 HealthConcernActEntryRelationship666 HealthConcernActEntryRelationship668 HealthConcernActEntryRelationship670 HealthConcernActEntryRelationship672 HealthConcernActEntryRelationship674 HealthConcernActEntryRelationship676 HealthConcernActEntryRelationship678 HealthConcernActEntryRelationship680 HealthConcernActEntryRelationship682 HealthConcernActEntryRelationship684 HealthConcernActEntryRelationship686 HealthConcernActEntryRelationship688 HealthConcernActEntryRelationship690 HealthConcernActEntryRelationship692 HealthConcernActEntryRelationship694 HealthConcernActEntryRelationship696 HealthConcernActEntryRelationship698 HealthConcernActReferenceTypeCode HealthConcernActReferenceExternalDocumentReference' templateId.root='2.16.840.1.113883.10.20.22.4.132' templateId.extension='2015-08-01' classCode='ACT' moodCode='EVN' code.code='75310-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Health Concern' constraints.validation.dependOn.HealthConcernActCode='HealthConcernActCodeP' constraints.validation.info='HealthConcernActEffectiveTime HealthConcernActReference HealthConcernActProblemObservation2EntryRelationshipProblemObservation2635 HealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637 HealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639 HealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641 HealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643 HealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645 HealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647 HealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649 HealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651 HealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653 HealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655 HealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657 HealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659 HealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661 HealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663 HealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665 HealthConcernActReactionObservation2EntryRelationshipReactionObservation2667 HealthConcernActResultObservation2EntryRelationshipResultObservation2669 HealthConcernActSensoryStatusEntryRelationshipSensoryStatus671 HealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673 HealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675 HealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677 HealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679 HealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681 HealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683 HealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685 HealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687 HealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689 HealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691 HealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693 HealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695 HealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697 HealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699' constraints.validation.warning='HealthConcernActAuthorParticipation' constraints.validation.query='HealthConcernActReferenceTypeCode HealthConcernActReferenceExternalDocumentReference HealthConcernActProblemObservation2EntryRelationshipProblemObservation2635 HealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637 HealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639 HealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641 HealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643 HealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645 HealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647 HealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649 HealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651 HealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653 HealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655 HealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657 HealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659 HealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661 HealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663 HealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665 HealthConcernActReactionObservation2EntryRelationshipReactionObservation2667 HealthConcernActResultObservation2EntryRelationshipResultObservation2669 HealthConcernActSensoryStatusEntryRelationshipSensoryStatus671 HealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673 HealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675 HealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677 HealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679 HealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681 HealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683 HealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685 HealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687 HealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689 HealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691 HealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693 HealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695 HealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697 HealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActReference typeCode='REFR' constraints.validation.error='HealthConcernActReferenceTypeCode HealthConcernActReferenceExternalDocumentReference'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActProblemObservation2EntryRelationship constraints.validation.info='HealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActAllergyObservation2EntryRelationship constraints.validation.info='HealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActEntryReferenceRefrEntryRelationship constraints.validation.info='HealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActEntryReferenceCompEntryRelationship constraints.validation.info='HealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActAssessmentScaleObservationEntryRelationship constraints.validation.info='HealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActSelfCareActivitiesEntryRelationship constraints.validation.info='HealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActMentalStatusObservation2EntryRelationship constraints.validation.info='HealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActSmokingStatusMeaningfulUse2EntryRelationship constraints.validation.info='HealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActEncounterDiagnosis2EntryRelationship constraints.validation.info='HealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActFamilyHistoryOrganizer2EntryRelationship constraints.validation.info='HealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActFunctionalStatusObservation2EntryRelationship constraints.validation.info='HealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActHospitalAdmissionDiagnosis2EntryRelationship constraints.validation.info='HealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActNutritionAssessmentEntryRelationship constraints.validation.info='HealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActPostprocedureDiagnosis2EntryRelationship constraints.validation.info='HealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActPregnancyObservationEntryRelationship constraints.validation.info='HealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActPreoperativeDiagnosis2EntryRelationship constraints.validation.info='HealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActReactionObservation2EntryRelationship constraints.validation.info='HealthConcernActReactionObservation2EntryRelationshipReactionObservation2667'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActResultObservation2EntryRelationship constraints.validation.info='HealthConcernActResultObservation2EntryRelationshipResultObservation2669'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActSensoryStatusEntryRelationship constraints.validation.info='HealthConcernActSensoryStatusEntryRelationshipSensoryStatus671'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActSocialHistoryObservation2EntryRelationship constraints.validation.info='HealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationship constraints.validation.info='HealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActTobaccoUse2EntryRelationship constraints.validation.info='HealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActVitalSignObservation2EntryRelationship constraints.validation.info='HealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActLongitudinalCareWoundObservationEntryRelationship constraints.validation.info='HealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActCaregiverCharacteristicsEntryRelationship constraints.validation.info='HealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActCulturalAndReligiousObservationEntryRelationship constraints.validation.info='HealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationship constraints.validation.info='HealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActNutritionalStatusObservationEntryRelationship constraints.validation.info='HealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActResultOrganizer2EntryRelationship constraints.validation.info='HealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActPriorityPreferenceEntryRelationship constraints.validation.info='HealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActProblemConcernAct2EntryRelationship constraints.validation.info='HealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHealthConcernActEntryReferenceEntryRelationship constraints.validation.info='HealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699'"
 * @generated
 */
public interface HealthConcernAct extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.132\' and id.extension = \'2015-08-01\')'"
	 * @generated
	 */
	boolean validateHealthConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateHealthConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateHealthConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)'"
	 * @generated
	 */
	boolean validateHealthConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHealthConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'75310-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateHealthConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'active\' or value.code = \'suspended\' or value.code = \'aborted\' or value.code = \'completed\')'"
	 * @generated
	 */
	boolean validateHealthConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHealthConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHealthConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateHealthConcernActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))'"
	 * @generated
	 */
	boolean validateHealthConcernActReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship634(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship636(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship638(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship640(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship642(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship644(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship646(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship648(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship650(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship652(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship654(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship656(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship658(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship660(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship662(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship664(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship666(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship668(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship670(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship672(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship674(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship676(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship678(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship680(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship682(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship684(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship686(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship688(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship690(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship692(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship694(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship696(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryRelationship698(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)'"
	 * @generated
	 */
	boolean validateHealthConcernActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))'"
	 * @generated
	 */
	boolean validateHealthConcernActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)))'"
	 * @generated
	 */
	boolean validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)))'"
	 * @generated
	 */
	boolean validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)))'"
	 * @generated
	 */
	boolean validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PregnancyObservation)))'"
	 * @generated
	 */
	boolean validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryStatus)))'"
	 * @generated
	 */
	boolean validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)))'"
	 * @generated
	 */
	boolean validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))'"
	 * @generated
	 */
	boolean validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)))'"
	 * @generated
	 */
	boolean validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)))'"
	 * @generated
	 */
	boolean validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionalStatusObservation)))'"
	 * @generated
	 */
	boolean validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))'"
	 * @generated
	 */
	boolean validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)))'"
	 * @generated
	 */
	boolean validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))'"
	 * @generated
	 */
	boolean validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthConcernAct init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HealthConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HealthConcernAct
