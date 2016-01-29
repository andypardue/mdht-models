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
 * A representation of the model object '<em><b>Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationActivityTemplateId MedicationActivityInstructionsInversionInd MedicationActivity2SubstanceAdministeredActInversionInd MedicationActivityEffectiveTimeIVLTSorTS MedicationActivity2EffectiveTimeIVLTSLowXorValue MedicationActivityStatusCode MedicationActivityStatusCodeP MedicationActivityRouteCode MedicationActivityDoseQuantity MedicationActivityAdministrationUnitCode MedicationActivityText MedicationActivityConsumable MedicationActivity2EntryRelationship936 MedicationActivity2EntryRelationship938 MedicationActivity2EntryRelationship940 MedicationActivity2EntryRelationship942 MedicationActivity2EntryRelationship944 MedicationActivity2EntryRelationship946 MedicationActivity2EntryRelationship948 MedicationActivity2EntryRelationship950 MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration MedicationActivityConsumableMedicationInformation' templateId.root='2.16.840.1.113883.10.20.22.4.16' templateId.extension='2014-06-09' constraints.validation.info='MedicationActivityTextReference MedicationActivityReferenceValue MedicationActivityTextReferenceValue MedicationActivity2SubstanceAdministeredActSequenceNumber MedicationActivityEffectiveTimeIVLTSHigh MedicationActivityCode MedicationActivityRepeatNumber MedicationActivityAdministrationUnitCodeP MedicationActivityPrecondition MedicationActivity2Indication2EntryRelationshipIndication2937 MedicationActivity2Instruction2EntryRelationshipInstruction2939 MedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941 MedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943 MedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945 MedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947 MedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949 MedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951' constraints.validation.warning='MedicationActivityDoseQuantityorrateQuantity MedicationActivityEffectiveTimeIVLTSLow MedicationActivityEffectiveTimePIVLTS MedicationActivityRouteCodeP MedicationActivity2AuthorParticipation' constraints.validation.dependOn.MedicationActivityStatusCode='MedicationActivityStatusCodeP' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.MedicationActivityRouteCode='MedicationActivityRouteCodeP' administrationUnitCode.codeSystemName='' constraints.validation.dependOn.MedicationActivityAdministrationUnitCode='MedicationActivityAdministrationUnitCodeP' constraints.validation.query='MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration MedicationActivityConsumableMedicationInformation MedicationActivity2Indication2EntryRelationshipIndication2937 MedicationActivity2Instruction2EntryRelationshipInstruction2939 MedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941 MedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943 MedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945 MedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947 MedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949 MedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2Consumable constraints.validation.error='MedicationActivityConsumableMedicationInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2Precondition typeCode='PRCN' constraints.validation.error='MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2Indication2EntryRelationship constraints.validation.info='MedicationActivity2Indication2EntryRelationshipIndication2937'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2Instruction2EntryRelationship constraints.validation.info='MedicationActivity2Instruction2EntryRelationshipInstruction2939'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2MedicationSupplyOrder2EntryRelationship constraints.validation.info='MedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2MedicationDispense2EntryRelationship constraints.validation.info='MedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2ReactionObservation2EntryRelationship constraints.validation.info='MedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2DrugMonitoringActEntryRelationship constraints.validation.info='MedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2SubstanceAdministeredActEntryRelationship constraints.validation.info='MedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2MedicationFreeTextSigEntryRelationship constraints.validation.info='MedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951'"
 * @generated
 */
public interface MedicationActivity2 extends MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::SubstanceAdministeredAct))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateMedicationActivity2SubstanceAdministeredActInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::SubstanceAdministeredAct))->forAll(ent : cda::EntryRelationship | not ent.sequenceNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationActivity2SubstanceAdministeredActSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='( self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1) )  and  ( self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::SXCM_TS))->forAll( eff | eff.oclAsType(datatypes:: SXCM_TS).value->size() = 1 or eff.oclAsType(datatypes::SXCM_TS).isNullFlavorDefined()) )'"
	 * @generated
	 */
	boolean validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(DiagnosticChain diagnostics,
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
	boolean validateMedicationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship936(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship938(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship940(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship942(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship944(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship946(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship948(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2EntryRelationship950(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2Indication2EntryRelationshipIndication2937(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->one(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder2)))'"
	 * @generated
	 */
	boolean validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense2)))'"
	 * @generated
	 */
	boolean validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)))'"
	 * @generated
	 */
	boolean validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DrugMonitoringAct)))'"
	 * @generated
	 */
	boolean validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SubstanceAdministeredAct)))'"
	 * @generated
	 */
	boolean validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationFreeTextSig)))'"
	 * @generated
	 */
	boolean validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public MedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationActivity2
