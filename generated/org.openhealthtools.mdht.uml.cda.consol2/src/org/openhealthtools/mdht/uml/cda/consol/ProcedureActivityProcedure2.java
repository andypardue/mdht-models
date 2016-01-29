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
 * A representation of the model object '<em><b>Procedure Activity Procedure2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureActivityProcedure2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityProcedureTemplateId ProcedureActivityProcedureInstructionsInversion ProcedureActivityProcedureServiceDeliveryLocationTypeCode ProcedureActivityProcedureTargetSiteCode ProcedureActivityProcedureMoodCode ProcedureActivityProcedureStatusCode ProcedureActivityProcedureStatusCodeP ProcedureActivityProcedure2EntryRelationship1028 ProcedureActivityProcedure2EntryRelationship1030 ProcedureActivityProcedure2EntryRelationship1032 ProcedureActivityProcedure2EntryRelationship1034 ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.14' templateId.extension='2014-06-09' constraints.validation.warning='ProcedureActivityProcedureCodeCodeSystems ProcedureActivityProcedureTargetSiteCodeP ProcedureActivityProcedurePerformer ProcedureActivityProcedure2AuthorParticipation' constraints.validation.info='ProcedureActivityProcedure2CodeSuggestedCodeSystems ProcedureActivityProcedureSpecimen ProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029 ProcedureActivityProcedure2Indication2EntryRelationshipIndication21031 ProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033 ProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ProcedureActivityProcedureTargetSiteCode='ProcedureActivityProcedureTargetSiteCodeP' moodCode='EVN' constraints.validation.dependOn.ProcedureActivityProcedureStatusCode='ProcedureActivityProcedureStatusCodeP' constraints.validation.query='ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity ProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029 ProcedureActivityProcedure2Indication2EntryRelationshipIndication21031 ProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033 ProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2ProcedureActivityPerformer constraints.validation.error='ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityAssignedEntity constraints.validation.error='ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2Instruction2EntryRelationship constraints.validation.info='ProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2Indication2EntryRelationship constraints.validation.info='ProcedureActivityProcedure2Indication2EntryRelationshipIndication21031'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2MedicationActivity2EntryRelationship constraints.validation.info='ProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2ReactionObservation2EntryRelationship constraints.validation.info='ProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035'"
 * @generated
 */
public interface ProcedureActivityProcedure2 extends ProcedureActivityProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not code.oclIsUndefined() and self.code.isNullFlavorUndefined() implies self.code.codeSystem = \'2.16.840.1.113883.6.12\' or self.code.codeSystem = \'2.16.840.1.113883.6.4\' or self.code.codeSystem = \'2.16.840.1.113883.6.13\''"
	 * @generated
	 */
	boolean validateProcedureActivityProcedure2CodeSuggestedCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedureStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2EntryRelationship1028(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2EntryRelationship1030(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2EntryRelationship1032(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2EntryRelationship1034(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)))'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)))'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityProcedure2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProcedureActivityProcedure2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityProcedure2
