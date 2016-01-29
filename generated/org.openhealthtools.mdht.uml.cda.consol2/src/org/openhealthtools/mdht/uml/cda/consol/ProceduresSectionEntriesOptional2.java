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
 * A representation of the model object '<em><b>Procedures Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProceduresSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProceduresSectionEntriesOptionalTemplateId ProceduresSectionEntriesOptionalCode ProceduresSectionEntriesOptionalCodeP ProceduresSectionEntriesOptional2Entry1150 ProceduresSectionEntriesOptional2Entry1152 ProceduresSectionEntriesOptional2Entry1154' templateId.root='2.16.840.1.113883.10.20.22.2.7' templateId.extension='2014-06-09' code.code='47519-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='History of Procedures' constraints.validation.dependOn.ProceduresSectionEntriesOptionalCode='ProceduresSectionEntriesOptionalCodeP' constraints.validation.info='ProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151 ProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153 ProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155' constraints.validation.query='ProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151 ProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153 ProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProceduresSectionEntriesOptional2ProcedureActivityProcedure2Entry constraints.validation.info='ProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProceduresSectionEntriesOptional2ProcedureActivityObservation2Entry constraints.validation.info='ProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProceduresSectionEntriesOptional2ProcedureActivityAct2Entry constraints.validation.info='ProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155'"
 * @generated
 */
public interface ProceduresSectionEntriesOptional2 extends ProceduresSectionEntriesOptional {
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
	boolean validateProceduresSectionEntriesOptional2Entry1150(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProceduresSectionEntriesOptional2Entry1152(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProceduresSectionEntriesOptional2Entry1154(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))'"
	 * @generated
	 */
	boolean validateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)))'"
	 * @generated
	 */
	boolean validateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)))'"
	 * @generated
	 */
	boolean validateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProceduresSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProceduresSectionEntriesOptional2
