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
 * A representation of the model object '<em><b>Substance Or Device Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSubstanceOrDeviceAllergyObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SubstanceOrDeviceAllergyObservationTemplateId SubstanceOrDeviceAllergyObservationReactionInversionIndicator SubstanceOrDeviceAllergyObservationSeverityInversionIndicator SubstanceOrDeviceAllergyObservationEffectiveTime SubstanceOrDeviceAllergyObservationValue SubstanceOrDeviceAllergyObservationValueP SubstanceOrDeviceAllergyObservationCode SubstanceOrDeviceAllergyObservationCodeP SubstanceOrDeviceAllergyObservation2EntryRelationship1044 SubstanceOrDeviceAllergyObservation2EntryRelationship1046 SubstanceOrDeviceAllergyObservation2IVLTSLow SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.24.3.90' templateId.extension='2014-06-09' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationValue='SubstanceOrDeviceAllergyObservationValueP' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationCode='SubstanceOrDeviceAllergyObservationCodeP' constraints.validation.warning='SubstanceOrDeviceAllergyObservationParticipant SubstanceOrDeviceAllergyObservation2AuthorParticipation SubstanceOrDeviceAllergyObservation2ReactionObservation2EntryRelationshipReactionObservation21045' constraints.validation.query='SubstanceOrDeviceAllergyObservation2IVLTSLow SubstanceOrDeviceAllergyObservation2IVLTSHigh SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservationParticipantParticipantRole SubstanceOrDeviceAllergyObservation2ReactionObservation2EntryRelationshipReactionObservation21045 SubstanceOrDeviceAllergyObservation2SeverityObservation2EntryRelationshipSeverityObservation21047' constraints.validation.info='SubstanceOrDeviceAllergyObservation2IVLTSHigh SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance SubstanceOrDeviceAllergyObservation2SeverityObservation2EntryRelationshipSeverityObservation21047'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2IVLTS constraints.validation.error='SubstanceOrDeviceAllergyObservation2IVLTSLow' constraints.validation.info='SubstanceOrDeviceAllergyObservation2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2Participant constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRole constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntity constraints.validation.info='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance' constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation' constraints.validation.query='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityCE constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ReactionObservation2EntryRelationship constraints.validation.warning='SubstanceOrDeviceAllergyObservation2ReactionObservation2EntryRelationshipReactionObservation21045'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2SeverityObservation2EntryRelationship constraints.validation.info='SubstanceOrDeviceAllergyObservation2SeverityObservation2EntryRelationshipSeverityObservation21047'"
 * @generated
 */
public interface SubstanceOrDeviceAllergyObservation2 extends SubstanceOrDeviceAllergyObservation {
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
	boolean validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics,
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
	boolean validateSubstanceOrDeviceAllergyObservation2EntryRelationship1044(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservation2EntryRelationship1046(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservation2ReactionObservation2EntryRelationshipReactionObservation21045(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation2)))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2SeverityObservation2EntryRelationshipSeverityObservation21047(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceOrDeviceAllergyObservation2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SubstanceOrDeviceAllergyObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SubstanceOrDeviceAllergyObservation2
