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
 * A representation of the model object '<em><b>Encounters Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncountersSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncountersSectionEntriesOptionalTemplateId EncountersSectionEntriesOptionalCode EncountersSectionEntriesOptionalCodeP EncountersSectionEntriesOptional2Entry1060' templateId.root='2.16.840.1.113883.10.20.22.2.22' templateId.extension='2015-08-01' code.code='46240-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Encounters' constraints.validation.dependOn.EncountersSectionEntriesOptionalCode='EncountersSectionEntriesOptionalCodeP' constraints.validation.warning='EncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061' constraints.validation.query='EncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncountersSectionEntriesOptional2EncounterActivity2Entry constraints.validation.warning='EncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061'"
 * @generated
 */
public interface EncountersSectionEntriesOptional2 extends EncountersSectionEntriesOptional {
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
	boolean validateEncountersSectionEntriesOptional2Entry1060(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)))'"
	 * @generated
	 */
	boolean validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EncountersSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncountersSectionEntriesOptional2
