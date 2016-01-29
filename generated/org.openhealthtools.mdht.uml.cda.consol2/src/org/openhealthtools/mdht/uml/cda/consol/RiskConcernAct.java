/**
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
 * A representation of the model object '<em><b>Risk Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getRiskConcernAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='RiskConcernActTemplateId RiskConcernActClassCode RiskConcernActMoodCode RiskConcernActId RiskConcernActCode RiskConcernActCodeP RiskConcernActStatusCode RiskConcernActStatusCodeP RiskConcernActEntryRelationship1590 RiskConcernActEntryRelationship1592 RiskConcernActEntryRelationship1594 RiskConcernActEntryRelationship1596 RiskConcernActEntryRelationship1598 RiskConcernActEntryRelationship1600 RiskConcernActEntryRelationship1602 RiskConcernActEntryRelationship1604 RiskConcernActEntryRelationship1606 RiskConcernActEntryRelationship1608 RiskConcernActEntryRelationship1610 RiskConcernActEntryRelationship1612 RiskConcernActEntryRelationship1614 RiskConcernActEntryRelationship1616 RiskConcernActEntryRelationship1618 RiskConcernActEntryRelationship1620 RiskConcernActEntryRelationship1622 RiskConcernActEntryRelationship1624 RiskConcernActEntryRelationship1626 RiskConcernActEntryRelationship1628 RiskConcernActEntryRelationship1630 RiskConcernActEntryRelationship1632 RiskConcernActEntryRelationship1634 RiskConcernActEntryRelationship1636 RiskConcernActEntryRelationship1638 RiskConcernActEntryRelationship1640 RiskConcernActEntryRelationship1642 RiskConcernActEntryRelationship1644 RiskConcernActEntryRelationship1646 RiskConcernActEntryRelationship1648 RiskConcernActEntryRelationship1650 RiskConcernActEntryRelationship1652 RiskConcernActEntryRelationship1654 RiskConcernActEntryRelationship1656 RiskConcernActEntryRelationship1658 RiskConcernActEntryRelationship1660 RiskConcernActEntryRelationship1662 RiskConcernActReferenceTypeCode RiskConcernActReferenceExternalDocumentReference' templateId.root='2.16.840.1.113883.10.20.22.4.136' templateId.extension='2015-08-01' classCode='ACT' moodCode='EVN' code.code='281694009' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='At risk for' constraints.validation.dependOn.RiskConcernActCode='RiskConcernActCodeP' constraints.validation.info='RiskConcernActEffectiveTime RiskConcernActReference RiskConcernActProblemObservation2EntryRelationshipProblemObservation21591 RiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593 RiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595 RiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597 RiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599 RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601 RiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603 RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605 RiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607 RiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609 RiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611 RiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613 RiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615 RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617 RiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619 RiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621 RiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623 RiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625 RiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627 RiskConcernActReactionObservation2EntryRelationshipReactionObservation21629 RiskConcernActResultObservation2EntryRelationshipResultObservation21631 RiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633 RiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635 RiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637 RiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639 RiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641 RiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643 RiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645 RiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647 RiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649 RiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651 RiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653 RiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655 RiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657 RiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659 RiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661 RiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663' constraints.validation.warning='RiskConcernActAuthorParticipation' constraints.validation.query='RiskConcernActReferenceTypeCode RiskConcernActReferenceExternalDocumentReference RiskConcernActProblemObservation2EntryRelationshipProblemObservation21591 RiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593 RiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595 RiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597 RiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599 RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601 RiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603 RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605 RiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607 RiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609 RiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611 RiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613 RiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615 RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617 RiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619 RiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621 RiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623 RiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625 RiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627 RiskConcernActReactionObservation2EntryRelationshipReactionObservation21629 RiskConcernActResultObservation2EntryRelationshipResultObservation21631 RiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633 RiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635 RiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637 RiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639 RiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641 RiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643 RiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645 RiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647 RiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649 RiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651 RiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653 RiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655 RiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657 RiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659 RiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661 RiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActReference typeCode='REFR' constraints.validation.error='RiskConcernActReferenceTypeCode RiskConcernActReferenceExternalDocumentReference'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActProblemObservation2EntryRelationship constraints.validation.info='RiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActAllergyObservation2EntryRelationship constraints.validation.info='RiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActEntryReferenceEntryRelationship constraints.validation.info='RiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActAssessmentScaleObservationEntryRelationship constraints.validation.info='RiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActMentalStatusObservation2EntryRelationship constraints.validation.info='RiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActSelfCareActivitiesEntryRelationship constraints.validation.info='RiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActSmokingStatusMeaningfulUse2EntryRelationship constraints.validation.info='RiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActEncounterDiagnosis2EntryRelationship constraints.validation.info='RiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActFamilyHistoryOrganizer2EntryRelationship constraints.validation.info='RiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActFunctionalStatusObservation2EntryRelationship constraints.validation.info='RiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActHospitalAdmissionDiagnosis2EntryRelationship constraints.validation.info='RiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActNutritionAssessmentEntryRelationship constraints.validation.info='RiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActPostprocedureDiagnosis2EntryRelationship constraints.validation.info='RiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActPregnancyObservationEntryRelationship constraints.validation.info='RiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActPreoperativeDiagnosis2EntryRelationship constraints.validation.info='RiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActReactionObservation2EntryRelationship constraints.validation.info='RiskConcernActReactionObservation2EntryRelationshipReactionObservation21629'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActResultObservation2EntryRelationship constraints.validation.info='RiskConcernActResultObservation2EntryRelationshipResultObservation21631'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActSensoryStatusEntryRelationship constraints.validation.info='RiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActSocialHistoryObservation2EntryRelationship constraints.validation.info='RiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationship constraints.validation.info='RiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActTobaccoUse2EntryRelationship constraints.validation.info='RiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActVitalSignObservation2EntryRelationship constraints.validation.info='RiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActLongitudinalCareWoundObservationEntryRelationship constraints.validation.info='RiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActCaregiverCharacteristicsEntryRelationship constraints.validation.info='RiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActCulturalAndReligiousObservationEntryRelationship constraints.validation.info='RiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationship constraints.validation.info='RiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActNutritionalStatusObservationEntryRelationship constraints.validation.info='RiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActResultOrganizer2EntryRelationship constraints.validation.info='RiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActPriorityPreferenceEntryRelationship constraints.validation.info='RiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRiskConcernActProblemConcernAct2EntryRelationship constraints.validation.info='RiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661'"
 * @generated
 */
public interface RiskConcernAct extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.136\' and id.extension = \'2015-08-01\')'"
	 * @generated
	 */
	boolean validateRiskConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)'"
	 * @generated
	 */
	boolean validateRiskConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'281694009\' and value.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateRiskConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActReference(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1590(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1592(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1594(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1596(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1598(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1600(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1602(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1604(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1606(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1608(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1610(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1612(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1614(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1616(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1618(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1620(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1622(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1624(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1626(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1628(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1630(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1632(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1634(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1636(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1638(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1640(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1642(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1644(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1646(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1648(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1650(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1652(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1654(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1656(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1658(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1660(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryRelationship1662(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
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
	boolean validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskConcernAct init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RiskConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // RiskConcernAct
