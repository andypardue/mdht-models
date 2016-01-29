/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProgressNote2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2 ProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent ProgressNote2Code ProgressNote2CodeP ProgressNote2ComponentOf ProgressNote2Component1510 ProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth ProgressNote2DocumentationOfServiceEventTemplateId ProgressNote2DocumentationOfServiceEventClassCode ProgressNote2DocumentationOfServiceEvent ProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility ProgressNote2ComponentOfEncompassingEncounterId ProgressNote2ComponentOfEncompassingEncounterEffectiveTime ProgressNote2ComponentOfEncompassingEncounterLocation ProgressNote2ComponentOfEncompassingEncounter ProgressNote2ComponentStructuredBodyAssessmentSection1512 ProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514 ProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516 ProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518 ProgressNote2ComponentStructuredBodyChiefComplaintSection1520 ProgressNote2ComponentStructuredBodyInterventionsSection21522 ProgressNote2ComponentStructuredBodyInstructionsSection21524 ProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526 ProgressNote2ComponentStructuredBodyObjectiveSection1528 ProgressNote2ComponentStructuredBodyPhysicalExamSection21530 ProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532 ProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534 ProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536 ProgressNote2ComponentStructuredBodySubjectiveSection1538 ProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540 ProgressNote2ComponentStructuredBodyNutritionSection1542 ProgressNote2ComponentStructuredBody1511' templateId.root='2.16.840.1.113883.10.20.22.1.9' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.ProgressNote2Code='ProgressNote2CodeP' constraints.validation.warning='ProgressNote2DocumentationOf ProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow ProgressNote2DocumentationOfServiceEventEffectiveTime' constraints.validation.query='ProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow ProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth ProgressNote2DocumentationOfServiceEventTemplateId ProgressNote2DocumentationOfServiceEventClassCode ProgressNote2DocumentationOfServiceEventEffectiveTime ProgressNote2DocumentationOfServiceEvent ProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility ProgressNote2ComponentOfEncompassingEncounterId ProgressNote2ComponentOfEncompassingEncounterEffectiveTime ProgressNote2ComponentOfEncompassingEncounterLocation ProgressNote2ComponentOfEncompassingEncounter ProgressNote2ComponentStructuredBodyComponentAssessmentSection1513 ProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515 ProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517 ProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519 ProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521 ProgressNote2ComponentStructuredBodyComponentInterventionsSection21523 ProgressNote2ComponentStructuredBodyComponentInstructionsSection21525 ProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527 ProgressNote2ComponentStructuredBodyComponentObjectiveSection1529 ProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531 ProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533 ProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535 ProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537 ProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539 ProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541 ProgressNote2ComponentStructuredBodyComponentNutritionSection1543 ProgressNote2ComponentStructuredBodyAssessmentSection1512 ProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514 ProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516 ProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518 ProgressNote2ComponentStructuredBodyChiefComplaintSection1520 ProgressNote2ComponentStructuredBodyInterventionsSection21522 ProgressNote2ComponentStructuredBodyInstructionsSection21524 ProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526 ProgressNote2ComponentStructuredBodyObjectiveSection1528 ProgressNote2ComponentStructuredBodyPhysicalExamSection21530 ProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532 ProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534 ProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536 ProgressNote2ComponentStructuredBodySubjectiveSection1538 ProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540 ProgressNote2ComponentStructuredBodyNutritionSection1542 ProgressNote2ComponentStructuredBody1511' constraints.validation.info='ProgressNote2ComponentStructuredBodyComponentAssessmentSection1513 ProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515 ProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517 ProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519 ProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521 ProgressNote2ComponentStructuredBodyComponentInterventionsSection21523 ProgressNote2ComponentStructuredBodyComponentInstructionsSection21525 ProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527 ProgressNote2ComponentStructuredBodyComponentObjectiveSection1529 ProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531 ProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533 ProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535 ProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537 ProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539 ProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541 ProgressNote2ComponentStructuredBodyComponentNutritionSection1543'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2DocumentationOf constraints.validation.error='ProgressNote2DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2DocumentationOfServiceEvent constraints.validation.error='ProgressNote2DocumentationOfServiceEventTemplateId ProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth ProgressNote2DocumentationOfServiceEventClassCode' templateId.root='2.16.840.1.113883.10.20.21.3.1' classCode='PCPR' constraints.validation.warning='ProgressNote2DocumentationOfServiceEventEffectiveTime ServiceEventProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow' constraints.validation.query='ServiceEventProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDT constraints.validation.warning='ProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentOf constraints.validation.error='ProgressNote2ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentOfEncompassingEncounter constraints.validation.error='ProgressNote2ComponentOfEncompassingEncounterId ProgressNote2ComponentOfEncompassingEncounterEffectiveTime ProgressNote2ComponentOfEncompassingEncounterLocation EncompassingEncounterProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow' constraints.validation.query='EncompassingEncounterProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentOfEncompassingEncounterLocation constraints.validation.error='ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility constraints.validation.error='ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDT constraints.validation.error='ProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2Component constraints.validation.error='ProgressNote2ComponentStructuredBody1511 ComponentProgressNote2ComponentStructuredBodyAssessmentSection1512 ComponentProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514 ComponentProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516 ComponentProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518 ComponentProgressNote2ComponentStructuredBodyChiefComplaintSection1520 ComponentProgressNote2ComponentStructuredBodyInterventionsSection21522 ComponentProgressNote2ComponentStructuredBodyInstructionsSection21524 ComponentProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526 ComponentProgressNote2ComponentStructuredBodyObjectiveSection1528 ComponentProgressNote2ComponentStructuredBodyPhysicalExamSection21530 ComponentProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532 ComponentProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534 ComponentProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536 ComponentProgressNote2ComponentStructuredBodySubjectiveSection1538 ComponentProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540 ComponentProgressNote2ComponentStructuredBodyNutritionSection1542' constraints.validation.info='ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentSection1513 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentInterventionsSection21523 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentInstructionsSection21525 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentObjectiveSection1529 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentNutritionSection1543' constraints.validation.query='ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentSection1513 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentInterventionsSection21523 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentInstructionsSection21525 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentObjectiveSection1529 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541 ComponentStructuredBodyProgressNote2ComponentStructuredBodyComponentNutritionSection1543 ComponentProgressNote2ComponentStructuredBodyAssessmentSection1512 ComponentProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514 ComponentProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516 ComponentProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518 ComponentProgressNote2ComponentStructuredBodyChiefComplaintSection1520 ComponentProgressNote2ComponentStructuredBodyInterventionsSection21522 ComponentProgressNote2ComponentStructuredBodyInstructionsSection21524 ComponentProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526 ComponentProgressNote2ComponentStructuredBodyObjectiveSection1528 ComponentProgressNote2ComponentStructuredBodyPhysicalExamSection21530 ComponentProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532 ComponentProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534 ComponentProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536 ComponentProgressNote2ComponentStructuredBodySubjectiveSection1538 ComponentProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540 ComponentProgressNote2ComponentStructuredBodyNutritionSection1542'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentStructuredBody constraints.validation.error='ProgressNote2ComponentStructuredBodyAssessmentSection1512 ProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514 ProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516 ProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518 ProgressNote2ComponentStructuredBodyChiefComplaintSection1520 ProgressNote2ComponentStructuredBodyInterventionsSection21522 ProgressNote2ComponentStructuredBodyInstructionsSection21524 ProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526 ProgressNote2ComponentStructuredBodyObjectiveSection1528 ProgressNote2ComponentStructuredBodyPhysicalExamSection21530 ProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532 ProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534 ProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536 ProgressNote2ComponentStructuredBodySubjectiveSection1538 ProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540 ProgressNote2ComponentStructuredBodyNutritionSection1542' constraints.validation.info='StructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentSection1513 StructuredBodyProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515 StructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517 StructuredBodyProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519 StructuredBodyProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521 StructuredBodyProgressNote2ComponentStructuredBodyComponentInterventionsSection21523 StructuredBodyProgressNote2ComponentStructuredBodyComponentInstructionsSection21525 StructuredBodyProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527 StructuredBodyProgressNote2ComponentStructuredBodyComponentObjectiveSection1529 StructuredBodyProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531 StructuredBodyProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533 StructuredBodyProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535 StructuredBodyProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537 StructuredBodyProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539 StructuredBodyProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541 StructuredBodyProgressNote2ComponentStructuredBodyComponentNutritionSection1543' constraints.validation.query='StructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentSection1513 StructuredBodyProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515 StructuredBodyProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517 StructuredBodyProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519 StructuredBodyProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521 StructuredBodyProgressNote2ComponentStructuredBodyComponentInterventionsSection21523 StructuredBodyProgressNote2ComponentStructuredBodyComponentInstructionsSection21525 StructuredBodyProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527 StructuredBodyProgressNote2ComponentStructuredBodyComponentObjectiveSection1529 StructuredBodyProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531 StructuredBodyProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533 StructuredBodyProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535 StructuredBodyProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537 StructuredBodyProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539 StructuredBodyProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541 StructuredBodyProgressNote2ComponentStructuredBodyComponentNutritionSection1543'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNote2ComponentStructuredBodyComponent constraints.validation.info='ProgressNote2ComponentStructuredBodyComponentNutritionSection1543'"
 * @generated
 */
public interface ProgressNote2 extends USRealmHeader2 {
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
	boolean validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
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
	boolean validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
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
	boolean validateProgressNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'11506-3\' or value.code = \'18733-6\' or value.code = \'18762-5\' or value.code = \'28569-2\' or value.code = \'28617-9\' or value.code = \'34900-1\' or value.code = \'34904-3\' or value.code = \'18764-1\' or value.code = \'28623-7\' or value.code = \'11507-1\' or value.code = \'11508-9\' or value.code = \'11509-7\' or value.code = \'28627-8\' or value.code = \'11510-5\' or value.code = \'28656-7\' or value.code = \'11512-1\' or value.code = \'34126-3\' or value.code = \'15507-7\' or value.code = \'34129-7\' or value.code = \'34125-5\' or value.code = \'34130-5\' or value.code = \'34131-3\' or value.code = \'34124-8\' or value.code = \'34127-1\' or value.code = \'34128-9\' or value.code = \'34901-9\' or value.code = \'34132-1\'))'"
	 * @generated
	 */
	boolean validateProgressNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2Component1510(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.21.3.1\'))'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOfServiceEventTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::ActClassRoot::PCPR)'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateProgressNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null).healthCareFacility->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null)->reject(healthCareFacility->one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyAssessmentSection1512(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyInterventionsSection21522(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyInstructionsSection21524(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyObjectiveSection1528(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodySubjectiveSection1538(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBodyNutritionSection1542(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNote2ComponentStructuredBody1511(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProgressNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProgressNote2
