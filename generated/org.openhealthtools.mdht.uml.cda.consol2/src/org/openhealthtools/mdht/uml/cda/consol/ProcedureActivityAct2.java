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
 * A representation of the model object '<em><b>Procedure Activity Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureActivityAct2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityActTemplateId ProcedureActivityActInstructionsInversion ProcedureActivityActMoodCode ProcedureActivityActStatusCode ProcedureActivityActStatusCodeP ProcedureActivityActEffectiveTime ProcedureActivityAct2EntryRelationship1014 ProcedureActivityAct2EntryRelationship1016 ProcedureActivityAct2EntryRelationship1018 ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom ProcedureActivityActProcedureActPerformerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.12' templateId.extension='2014-06-09' constraints.validation.info='ProcedureActivityAct2CodeSuggestedCodeSystems ProcedureActivityAct2Instruction2EntryRelationshipInstruction21015 ProcedureActivityAct2Indication2EntryRelationshipIndication21017 ProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019' moodCode='EVN' constraints.validation.dependOn.ProcedureActivityActStatusCode='ProcedureActivityActStatusCodeP' constraints.validation.warning='ProcedureActivityActPerformer ProcedureActivityAct2AuthorParticipation ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization' constraints.validation.query='ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization ProcedureActivityActProcedureActPerformerAssignedEntity ProcedureActivityAct2Instruction2EntryRelationshipInstruction21015 ProcedureActivityAct2Indication2EntryRelationshipIndication21017 ProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityAct2ProcedureActPerformer constraints.validation.error='ProcedureActivityActProcedureActPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityAct2ProcedureActPerformerProcedureActAssignedEntity constraints.validation.error='ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom' constraints.validation.warning='ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityAct2ProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganization constraints.validation.error='ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom ProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityAct2Instruction2EntryRelationship constraints.validation.info='ProcedureActivityAct2Instruction2EntryRelationshipInstruction21015'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityAct2Indication2EntryRelationship constraints.validation.info='ProcedureActivityAct2Indication2EntryRelationshipIndication21017'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityAct2MedicationActivity2EntryRelationship constraints.validation.info='ProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019'"
 * @generated
 */
public interface ProcedureActivityAct2 extends ProcedureActivityAct {
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
	boolean validateProcedureActivityAct2CodeSuggestedCodeSystems(DiagnosticChain diagnostics,
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
	boolean validateProcedureActivityActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2EntryRelationship1014(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2EntryRelationship1016(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2EntryRelationship1018(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2Indication2EntryRelationshipIndication21017(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityAct2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProcedureActivityAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityAct2
