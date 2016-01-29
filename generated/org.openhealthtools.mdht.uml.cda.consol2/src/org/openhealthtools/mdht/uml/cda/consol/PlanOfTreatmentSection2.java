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
 * A representation of the model object '<em><b>Plan Of Treatment Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPlanOfTreatmentSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlanOfCareSectionTemplateId PlanOfCareSectionCode PlanOfCareSectionCodeP PlanOfTreatmentSection2Entry1118 PlanOfTreatmentSection2Entry1120 PlanOfTreatmentSection2Entry1122 PlanOfTreatmentSection2Entry1124 PlanOfTreatmentSection2Entry1126 PlanOfTreatmentSection2Entry1128 PlanOfTreatmentSection2Entry1130 PlanOfTreatmentSection2Entry1132 PlanOfTreatmentSection2Entry1134 PlanOfTreatmentSection2Entry1136 PlanOfTreatmentSection2Entry1138' templateId.root='2.16.840.1.113883.10.20.22.2.10' templateId.extension='2014-06-09' code.code='18776-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Plan of Treatment' constraints.validation.dependOn.PlanOfCareSectionCode='PlanOfCareSectionCodeP' constraints.validation.info='PlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119 PlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121 PlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123 PlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125 PlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127 PlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129 PlanOfTreatmentSection2Instruction2EntryInstruction21131 PlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133 PlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135 PlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137 PlanOfTreatmentSection2GoalObservationEntryGoalObservation1139' constraints.validation.query='PlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119 PlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121 PlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123 PlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125 PlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127 PlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129 PlanOfTreatmentSection2Instruction2EntryInstruction21131 PlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133 PlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135 PlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137 PlanOfTreatmentSection2GoalObservationEntryGoalObservation1139'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedObservation2Entry constraints.validation.info='PlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedEncounter2Entry constraints.validation.info='PlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedAct2Entry constraints.validation.info='PlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedProcedure2Entry constraints.validation.info='PlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedMedicationActivity2Entry constraints.validation.info='PlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedSupply2Entry constraints.validation.info='PlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2Instruction2Entry constraints.validation.info='PlanOfTreatmentSection2Instruction2EntryInstruction21131'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2HandoffCommunicationParticipantsEntry constraints.validation.info='PlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2NutritionRecommendationEntry constraints.validation.info='PlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2PlannedImmunizationActivityEntry constraints.validation.info='PlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlanOfTreatmentSection2GoalObservationEntry constraints.validation.info='PlanOfTreatmentSection2GoalObservationEntryGoalObservation1139'"
 * @generated
 */
public interface PlanOfTreatmentSection2 extends PlanOfCareSection {
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
	boolean validatePlanOfTreatmentSection2Entry1118(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1120(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1122(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1124(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1126(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1128(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1130(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1132(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1134(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1136(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlanOfTreatmentSection2Entry1138(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)))'"
	 * @generated
	 */
	boolean validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfTreatmentSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PlanOfTreatmentSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlanOfTreatmentSection2
