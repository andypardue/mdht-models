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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FunctionalStatusSectionTemplateId FunctionalStatusSectionCode FunctionalStatusSectionCodeP FunctionalStatusSection2Entry1062 FunctionalStatusSection2Entry1064 FunctionalStatusSection2Entry1066 FunctionalStatusSection2Entry1068 FunctionalStatusSection2Entry1070 FunctionalStatusSection2Entry1072 FunctionalStatusSection2Entry1074 FunctionalStatusSection2Entry1076 FunctionalStatusSection2Entry1078 FunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067 FunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069 FunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073 FunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075' templateId.root='2.16.840.1.113883.10.20.22.2.14' templateId.extension='2014-06-09' code.code='47420-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Functional Status' constraints.validation.dependOn.FunctionalStatusSectionCode='FunctionalStatusSectionCodeP' constraints.validation.info='FunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063 FunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065 FunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071 FunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077 FunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079' constraints.validation.query='FunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063 FunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065 FunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067 FunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069 FunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071 FunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073 FunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075 FunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077 FunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2FunctionalStatusOrganizer2Entry constraints.validation.info='FunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2FunctionalStatusObservation2Entry constraints.validation.info='FunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2CognitiveStatusResultOrganizerEntry constraints.validation.error='FunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2CognitiveStatusResultObservationEntry constraints.validation.error='FunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2NonMedicinalSupplyActivity2Entry constraints.validation.info='FunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2NumberOfPressureUlcersObservationEntry constraints.validation.error='FunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2HighestPressureUlcerStageEntry constraints.validation.error='FunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2SelfCareActivitiesEntry constraints.validation.info='FunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusSection2SensoryStatusEntry constraints.validation.info='FunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079'"
 * @generated
 */
public interface FunctionalStatusSection2 extends FunctionalStatusSection {
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
	boolean validateFunctionalStatusSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1062(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1064(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1066(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1068(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1070(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1072(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1074(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1076(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2Entry1078(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusOrganizer2)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryStatus)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public FunctionalStatusSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusSection2
