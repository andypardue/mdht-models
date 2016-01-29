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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Functional Status section describes the patient's physical state, status of functioning, and environmental status at the time the document was created. 
 * A patient's physical state may include information regarding the patient's physical findings as they relate to problems, including but not limited to:
 * Pressure Ulcers
 * Amputations
 * Heart murmur
 * Ostomies
 * A patient's functional status may include information regarding the patient relative to their general functional and cognitive ability, including:
 * Ambulatory ability
 * Mental status or competency
 * Activities of Daily Living (ADLs), including bathing, dressing, feeding, grooming
 * Home or living situation having an effect on the health status of the patient
 * Ability to care for self
 * Social activity, including issues with social cognition, participation with friends and acquaintances other than family members
 * Occupation activity, including activities partly or directly related to working, housework or volunteering, family and home responsibilities or activities related to home and family
 * Communication ability, including issues with speech, writing or cognition required for communication
 * Perception, including sight, hearing, taste, skin sensation, kinesthetic sense, proprioception, or balance
 * A patient's environmental status may include information regarding the patient's current exposures from their daily environment, including but not limited to:
 * Airborne hazards such as second-hand smoke, volatile organic compounds, dust, or other allergens
 * Radiation
 * Safety hazards in home, such as throw rugs, poor lighting, lack of railings/grab bars, etc.
 * Safety hazards at work, such as communicable diseases, excessive heat, excessive noise, etc.
 * The patient's functional status may be expressed as a problem or as a result observation. A functional or cognitive status problem observation describes a patient's problem, symptoms or condition. A functional or cognitive status result observation may include observations resulting from an assessment scale, evaluation or question and answer assessment.
 * Any deviation from normal function displayed by the patient and recorded in the record should be included. Of particular interest are those limitations that would interfere with self-care or the medical therapeutic process in any way. In addition, a note of normal function, an improvement, or a change in functioning status may be included.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FunctionalStatusSectionTemplateId FunctionalStatusSectionCode FunctionalStatusSectionTitle FunctionalStatusSectionText FunctionalStatusSectionEntry80 FunctionalStatusSectionEntry82 FunctionalStatusSectionEntry84 FunctionalStatusSectionEntry86 FunctionalStatusSectionEntry88 FunctionalStatusSectionEntry90 FunctionalStatusSectionEntry92 FunctionalStatusSectionEntry94 FunctionalStatusSectionEntry96 FunctionalStatusSectionEntry98 FunctionalStatusSectionEntry100 FunctionalStatusSectionEntry102' templateId.root='2.16.840.1.113883.10.20.22.2.14' code.code='47420-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Functional status assessment' constraints.validation.info='FunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81 FunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83 FunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85 FunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87 FunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89 FunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91 FunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93 FunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95 FunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97 FunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99 FunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101 FunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103' constraints.validation.query='FunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81 FunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83 FunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85 FunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87 FunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89 FunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91 FunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93 FunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95 FunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97 FunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99 FunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101 FunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionFunctionalStatusResultOrganizerEntry constraints.validation.info='FunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionFunctionalStatusResultObservationEntry constraints.validation.info='FunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionCognitiveStatusResultOrganizerEntry constraints.validation.info='FunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionCognitiveStatusResultObservationEntry constraints.validation.info='FunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionCognitiveStatusProblemObservationEntry constraints.validation.info='FunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionFunctionalStatusProblemObservationEntry constraints.validation.info='FunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionCaregiverCharacteristicsEntry constraints.validation.info='FunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionAssessmentScaleObservationEntry constraints.validation.info='FunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionNonMedicinalSupplyActivityEntry constraints.validation.info='FunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionPressureUlcerObservationEntry constraints.validation.info='FunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionNumberOfPressureUlcersObservationEntry constraints.validation.info='FunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSectionHighestPressureUlcerStageEntry constraints.validation.info='FunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103'"
 * @generated
 */
public interface FunctionalStatusSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.14\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'47420-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry80(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry82(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry84(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry86(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry88(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry90(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry92(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry94(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry96(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry98(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry100(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionEntry102(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init();

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	public FunctionalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusSection
