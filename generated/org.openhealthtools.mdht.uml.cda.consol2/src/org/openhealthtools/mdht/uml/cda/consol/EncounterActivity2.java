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
 * A representation of the model object '<em><b>Encounter Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncounterActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncounterActivitiesTemplateId EncounterActivitiesSdtcDDCFromNUBCOrDD EncounterActivitiesCodeP EncounterActivity2EntryRelationship904 EncounterActivity2EntryRelationship906 EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.49' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.12' code.codeSystemName='CPT-4' constraints.validation.warning='EncounterActivitiesCode EncounterActivitiesServiceDeliveryLocation EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode' constraints.validation.info='EncounterActivitiesSDTCDischargeDispositionCode EncounterActivitiesEncounterPerformer EncounterActivity2CDTranslation EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP EncounterActivity2Indication2EntryRelationshipIndication2905 EncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907' constraints.validation.query='EncounterActivity2CDTranslation EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity EncounterActivity2Indication2EntryRelationshipIndication2905 EncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907' constraints.validation.dependOn.EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2EncounterPerformer constraints.validation.error='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2EncounterPerformerEncounterPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode' constraints.validation.info='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP' constraints.validation.dependOn.EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2CD constraints.validation.info='EncounterActivity2CDTranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2Indication2EntryRelationship constraints.validation.info='EncounterActivity2Indication2EntryRelationshipIndication2905'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2EncounterDiagnosis2EntryRelationship constraints.validation.info='EncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907'"
 * @generated
 */
public interface EncounterActivity2 extends EncounterActivities {
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
	boolean validateEncounterActivitiesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEncounterActivity2EntryRelationship904(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEncounterActivity2EntryRelationship906(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1) )))'"
	 * @generated
	 */
	boolean validateEncounterActivity2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEncounterActivity2Indication2EntryRelationshipIndication2905(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EncounterActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncounterActivity2
