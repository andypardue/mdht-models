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
 * A representation of the model object '<em><b>Vital Signs Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignsSectionEntriesOptionalTemplateId VitalSignsSectionEntriesOptionalCode VitalSignsSectionEntriesOptionalCodeP VitalSignsSectionEntriesOptional2Entry1172' templateId.root='2.16.840.1.113883.10.20.22.2.4' templateId.extension='2015-08-01' code.code='8716-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Vital Signs' constraints.validation.dependOn.VitalSignsSectionEntriesOptionalCode='VitalSignsSectionEntriesOptionalCodeP' constraints.validation.warning='VitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173' constraints.validation.query='VitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolVitalSignsSectionEntriesOptional2VitalSignsOrganizer2Entry constraints.validation.warning='VitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173'"
 * @generated
 */
public interface VitalSignsSectionEntriesOptional2 extends VitalSignsSectionEntriesOptional {
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
	boolean validateVitalSignsSectionEntriesOptional2Entry1172(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::VitalSignsOrganizer2)))'"
	 * @generated
	 */
	boolean validateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public VitalSignsSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsSectionEntriesOptional2
