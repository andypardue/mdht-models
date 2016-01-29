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
 * A representation of the model object '<em><b>Interventions Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getInterventionsSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InterventionsSectionTemplateId InterventionsSectionCode InterventionsSectionCodeP InterventionsSection2Entry1094 InterventionsSection2Entry1096 InterventionsSection2Entry1098' templateId.root='2.16.840.1.113883.10.20.21.2.3' templateId.extension='2015-08-01' code.code='62387-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Interventions Provided' constraints.validation.dependOn.InterventionsSectionCode='InterventionsSectionCodeP' constraints.validation.warning='InterventionsSection2InterventionActEntryInterventionAct1095 InterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099' constraints.validation.query='InterventionsSection2InterventionActEntryInterventionAct1095 InterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097 InterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099' constraints.validation.info='InterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolInterventionsSection2InterventionActEntry constraints.validation.warning='InterventionsSection2InterventionActEntryInterventionAct1095'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolInterventionsSection2HandoffCommunicationParticipantsEntry constraints.validation.info='InterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolInterventionsSection2PlannedInterventionActEntry constraints.validation.warning='InterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099'"
 * @generated
 */
public interface InterventionsSection2 extends InterventionsSection {
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
	boolean validateInterventionsSection2Entry1094(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateInterventionsSection2Entry1096(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateInterventionsSection2Entry1098(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)))'"
	 * @generated
	 */
	boolean validateInterventionsSection2InterventionActEntryInterventionAct1095(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedInterventionAct)))'"
	 * @generated
	 */
	boolean validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionsSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public InterventionsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // InterventionsSection2
