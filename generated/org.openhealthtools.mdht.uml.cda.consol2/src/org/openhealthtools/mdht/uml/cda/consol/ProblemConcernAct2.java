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
 * A representation of the model object '<em><b>Problem Concern Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemConcernAct2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemConcernActTemplateId ProblemConcernActEffectiveTimeLow ProblemConcernActStatusCode ProblemConcernActStatusCodeP ProblemConcernActEffectiveTime ProblemConcernActCode ProblemConcernActCodeP ProblemConcernAct2EntryRelationship1002 ProblemConcernAct2EntryRelationship1004 ProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003' templateId.root='2.16.840.1.113883.10.20.22.4.3' templateId.extension='2015-08-01' constraints.validation.info='ProblemConcernActEffectiveTimeHigh ProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005' constraints.validation.dependOn.ProblemConcernActStatusCode='ProblemConcernActStatusCodeP' code.code='CONC' code.codeSystem='2.16.840.1.113883.5.6' code.codeSystemName='HL7ActClass' code.displayName='Concern' constraints.validation.dependOn.ProblemConcernActCode='ProblemConcernActCodeP' constraints.validation.warning='ProblemConcernAct2AuthorParticipation' constraints.validation.query='ProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003 ProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProblemConcernAct2ProblemObservation2EntryRelationship constraints.validation.error='ProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProblemConcernAct2PriorityPreferenceEntryRelationship constraints.validation.info='ProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005'"
 * @generated
 */
public interface ProblemConcernAct2 extends ProblemConcernAct {
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
	boolean validateProblemConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProblemConcernAct2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProblemConcernAct2EntryRelationship1002(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProblemConcernAct2EntryRelationship1004(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))'"
	 * @generated
	 */
	boolean validateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))'"
	 * @generated
	 */
	boolean validateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProblemConcernAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProblemConcernAct2
