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
 * A representation of the model object '<em><b>Advance Directives Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectivesSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectivesSectionEntriesOptionalTemplateId AdvanceDirectivesSectionEntriesOptionalCode AdvanceDirectivesSectionEntriesOptionalCodeP AdvanceDirectivesSectionEntriesOptional2Entry1174 AdvanceDirectivesSectionEntriesOptional2Entry1176' templateId.root='2.16.840.1.113883.10.20.22.2.21' templateId.extension='2015-08-01' code.code='42348-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Advance Directives' constraints.validation.dependOn.AdvanceDirectivesSectionEntriesOptionalCode='AdvanceDirectivesSectionEntriesOptionalCodeP' constraints.validation.info='AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21175 AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1177' constraints.validation.query='AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21175 AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1177'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveObservation2Entry constraints.validation.info='AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21175'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerEntry constraints.validation.info='AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1177'"
 * @generated
 */
public interface AdvanceDirectivesSectionEntriesOptional2 extends AdvanceDirectivesSectionEntriesOptional {
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
	boolean validateAdvanceDirectivesSectionEntriesOptional2Entry1174(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectivesSectionEntriesOptional2Entry1176(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21175(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1177(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AdvanceDirectivesSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectivesSectionEntriesOptional2
