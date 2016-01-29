/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProgressNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections ProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP ProgressNoteComponentOf ProgressNoteComponent488 ProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh ProgressNoteDocumentationOfServiceEvent2PreciseToTheDay ProgressNoteDocumentationOfServiceEvent2TemplateId ProgressNoteDocumentationOfServiceEvent2ClassCode ProgressNoteDocumentationOfServiceEvent2 ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility ProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay ProgressNoteComponentOfEncompassingEncounter6EffectiveTime ProgressNoteComponentOfEncompassingEncounter6Id ProgressNoteComponentOfEncompassingEncounter6Location ProgressNoteComponentOfEncompassingEncounter6 ProgressNoteComponentStructuredBodyAssessmentSection490 ProgressNoteComponentStructuredBodyPlanOfCareSection492 ProgressNoteComponentStructuredBodyAssessmentAndPlanSection494 ProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496 ProgressNoteComponentStructuredBodyChiefComplaintSection498 ProgressNoteComponentStructuredBodyInterventionsSection500 ProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502 ProgressNoteComponentStructuredBodyObjectiveSection504 ProgressNoteComponentStructuredBodyPhysicalExamSection506 ProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508 ProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510 ProgressNoteComponentStructuredBodyReviewOfSystemsSection512 ProgressNoteComponentStructuredBodySubjectiveSection514 ProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516 ProgressNoteComponentStructuredBodyInstructionsSection518 ProgressNoteComponentStructuredBody489' templateId.root='2.16.840.1.113883.10.20.22.1.9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.warning='ProgressNoteDocumentationOf ProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow ProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute ProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteDocumentationOfServiceEvent2EffectiveTime ProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute ProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.query='ProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow ProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh ProgressNoteDocumentationOfServiceEvent2PreciseToTheDay ProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute ProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond ProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteDocumentationOfServiceEvent2TemplateId ProgressNoteDocumentationOfServiceEvent2ClassCode ProgressNoteDocumentationOfServiceEvent2EffectiveTime ProgressNoteDocumentationOfServiceEvent2 ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility ProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay ProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute ProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond ProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteComponentOfEncompassingEncounter6EffectiveTime ProgressNoteComponentOfEncompassingEncounter6Id ProgressNoteComponentOfEncompassingEncounter6Location ProgressNoteComponentOfEncompassingEncounter6 ProgressNoteComponentStructuredBodyComponentAssessmentSection491 ProgressNoteComponentStructuredBodyComponentPlanOfCareSection493 ProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495 ProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497 ProgressNoteComponentStructuredBodyComponentChiefComplaintSection499 ProgressNoteComponentStructuredBodyComponentInterventionsSection501 ProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503 ProgressNoteComponentStructuredBodyComponentObjectiveSection505 ProgressNoteComponentStructuredBodyComponentPhysicalExamSection507 ProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509 ProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511 ProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513 ProgressNoteComponentStructuredBodyComponentSubjectiveSection515 ProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517 ProgressNoteComponentStructuredBodyComponentInstructionsSection519 ProgressNoteComponentStructuredBodyAssessmentSection490 ProgressNoteComponentStructuredBodyPlanOfCareSection492 ProgressNoteComponentStructuredBodyAssessmentAndPlanSection494 ProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496 ProgressNoteComponentStructuredBodyChiefComplaintSection498 ProgressNoteComponentStructuredBodyInterventionsSection500 ProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502 ProgressNoteComponentStructuredBodyObjectiveSection504 ProgressNoteComponentStructuredBodyPhysicalExamSection506 ProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508 ProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510 ProgressNoteComponentStructuredBodyReviewOfSystemsSection512 ProgressNoteComponentStructuredBodySubjectiveSection514 ProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516 ProgressNoteComponentStructuredBodyInstructionsSection518 ProgressNoteComponentStructuredBody489' constraints.validation.info='ProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond ProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond ProgressNoteComponentStructuredBodyComponentAssessmentSection491 ProgressNoteComponentStructuredBodyComponentPlanOfCareSection493 ProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495 ProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497 ProgressNoteComponentStructuredBodyComponentChiefComplaintSection499 ProgressNoteComponentStructuredBodyComponentInterventionsSection501 ProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503 ProgressNoteComponentStructuredBodyComponentObjectiveSection505 ProgressNoteComponentStructuredBodyComponentPhysicalExamSection507 ProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509 ProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511 ProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513 ProgressNoteComponentStructuredBodyComponentSubjectiveSection515 ProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517 ProgressNoteComponentStructuredBodyComponentInstructionsSection519'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteDocumentationOf constraints.validation.error='ProgressNoteDocumentationOfServiceEvent2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteDocumentationOfServiceEvent2 constraints.validation.error='ProgressNoteDocumentationOfServiceEvent2TemplateId ProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh ProgressNoteDocumentationOfServiceEvent2PreciseToTheDay ProgressNoteDocumentationOfServiceEvent2ClassCode' templateId.root='2.16.840.1.113883.10.20.21.3.1' constraints.validation.warning='ProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow ProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute ProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset ProgressNoteDocumentationOfServiceEvent2EffectiveTime' constraints.validation.info='ProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond' classCode='PCPR'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOf constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOfEncompassingEncounter6 constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay ProgressNoteComponentOfEncompassingEncounter6EffectiveTime ProgressNoteComponentOfEncompassingEncounter6Id ProgressNoteComponentOfEncompassingEncounter6Location' constraints.validation.warning='ProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute ProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='ProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOfEncompassingEncounter6Location constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1 constraints.validation.error='ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponent constraints.validation.error='ProgressNoteComponentStructuredBody489 ComponentProgressNoteComponentStructuredBodyAssessmentSection490 ComponentProgressNoteComponentStructuredBodyPlanOfCareSection492 ComponentProgressNoteComponentStructuredBodyAssessmentAndPlanSection494 ComponentProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496 ComponentProgressNoteComponentStructuredBodyChiefComplaintSection498 ComponentProgressNoteComponentStructuredBodyInterventionsSection500 ComponentProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502 ComponentProgressNoteComponentStructuredBodyObjectiveSection504 ComponentProgressNoteComponentStructuredBodyPhysicalExamSection506 ComponentProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508 ComponentProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510 ComponentProgressNoteComponentStructuredBodyReviewOfSystemsSection512 ComponentProgressNoteComponentStructuredBodySubjectiveSection514 ComponentProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516 ComponentProgressNoteComponentStructuredBodyInstructionsSection518' constraints.validation.info='ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentSection491 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentPlanOfCareSection493 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentChiefComplaintSection499 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentInterventionsSection501 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentObjectiveSection505 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentPhysicalExamSection507 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentSubjectiveSection515 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentInstructionsSection519' constraints.validation.query='ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentSection491 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentPlanOfCareSection493 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentChiefComplaintSection499 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentInterventionsSection501 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentObjectiveSection505 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentPhysicalExamSection507 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentSubjectiveSection515 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517 ComponentStructuredBodyProgressNoteComponentStructuredBodyComponentInstructionsSection519 ComponentProgressNoteComponentStructuredBodyAssessmentSection490 ComponentProgressNoteComponentStructuredBodyPlanOfCareSection492 ComponentProgressNoteComponentStructuredBodyAssessmentAndPlanSection494 ComponentProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496 ComponentProgressNoteComponentStructuredBodyChiefComplaintSection498 ComponentProgressNoteComponentStructuredBodyInterventionsSection500 ComponentProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502 ComponentProgressNoteComponentStructuredBodyObjectiveSection504 ComponentProgressNoteComponentStructuredBodyPhysicalExamSection506 ComponentProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508 ComponentProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510 ComponentProgressNoteComponentStructuredBodyReviewOfSystemsSection512 ComponentProgressNoteComponentStructuredBodySubjectiveSection514 ComponentProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516 ComponentProgressNoteComponentStructuredBodyInstructionsSection518'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentStructuredBody constraints.validation.error='ProgressNoteComponentStructuredBodyAssessmentSection490 ProgressNoteComponentStructuredBodyPlanOfCareSection492 ProgressNoteComponentStructuredBodyAssessmentAndPlanSection494 ProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496 ProgressNoteComponentStructuredBodyChiefComplaintSection498 ProgressNoteComponentStructuredBodyInterventionsSection500 ProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502 ProgressNoteComponentStructuredBodyObjectiveSection504 ProgressNoteComponentStructuredBodyPhysicalExamSection506 ProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508 ProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510 ProgressNoteComponentStructuredBodyReviewOfSystemsSection512 ProgressNoteComponentStructuredBodySubjectiveSection514 ProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516 ProgressNoteComponentStructuredBodyInstructionsSection518' constraints.validation.info='StructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentSection491 StructuredBodyProgressNoteComponentStructuredBodyComponentPlanOfCareSection493 StructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495 StructuredBodyProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497 StructuredBodyProgressNoteComponentStructuredBodyComponentChiefComplaintSection499 StructuredBodyProgressNoteComponentStructuredBodyComponentInterventionsSection501 StructuredBodyProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503 StructuredBodyProgressNoteComponentStructuredBodyComponentObjectiveSection505 StructuredBodyProgressNoteComponentStructuredBodyComponentPhysicalExamSection507 StructuredBodyProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509 StructuredBodyProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511 StructuredBodyProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513 StructuredBodyProgressNoteComponentStructuredBodyComponentSubjectiveSection515 StructuredBodyProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517 StructuredBodyProgressNoteComponentStructuredBodyComponentInstructionsSection519' constraints.validation.query='StructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentSection491 StructuredBodyProgressNoteComponentStructuredBodyComponentPlanOfCareSection493 StructuredBodyProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495 StructuredBodyProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497 StructuredBodyProgressNoteComponentStructuredBodyComponentChiefComplaintSection499 StructuredBodyProgressNoteComponentStructuredBodyComponentInterventionsSection501 StructuredBodyProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503 StructuredBodyProgressNoteComponentStructuredBodyComponentObjectiveSection505 StructuredBodyProgressNoteComponentStructuredBodyComponentPhysicalExamSection507 StructuredBodyProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509 StructuredBodyProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511 StructuredBodyProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513 StructuredBodyProgressNoteComponentStructuredBodyComponentSubjectiveSection515 StructuredBodyProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517 StructuredBodyProgressNoteComponentStructuredBodyComponentInstructionsSection519'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProgressNoteComponentStructuredBodyComponent constraints.validation.info='ProgressNoteComponentStructuredBodyComponentInstructionsSection519'"
 * @generated
 */
public interface ProgressNote extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
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
	boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponent488(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(effectiveTime->forAll(not low.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(effectiveTime->forAll(width.oclIsUndefined() implies not high.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 8))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 12))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 14))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() > 8 implies effectiveTime.low.value.size() >= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() > 8 implies effectiveTime.high.value.size() >= 15))'"
	 * @generated
	 */
	boolean validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(
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
	boolean validateProgressNoteDocumentationOfServiceEvent2TemplateId(DiagnosticChain diagnostics,
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
	boolean validateProgressNoteDocumentationOfServiceEvent2ClassCode(DiagnosticChain diagnostics,
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
	boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(DiagnosticChain diagnostics,
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
	boolean validateProgressNoteDocumentationOfServiceEvent2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null).healthCareFacility->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
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
	boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 8)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 12)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 14)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() > 8 implies effectiveTime.value.size() >= 15)'"
	 * @generated
	 */
	boolean validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProgressNoteComponentOfEncompassingEncounter6Id(DiagnosticChain diagnostics,
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
	boolean validateProgressNoteComponentOfEncompassingEncounter6Location(DiagnosticChain diagnostics,
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
	boolean validateProgressNoteComponentOfEncompassingEncounter6(DiagnosticChain diagnostics,
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
	boolean validateProgressNoteComponentStructuredBodyComponentAssessmentSection491(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentInterventionsSection501(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyComponentObjectiveSection505(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection)))'"
	 * @generated
	 */
	boolean validateProgressNoteComponentStructuredBodyComponentInstructionsSection519(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyAssessmentSection490(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyPlanOfCareSection492(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyChiefComplaintSection498(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyInterventionsSection500(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyObjectiveSection504(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyPhysicalExamSection506(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodySubjectiveSection514(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBodyInstructionsSection518(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProgressNoteComponentStructuredBody489(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressNote init();

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProgressNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProgressNote
