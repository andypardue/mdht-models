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
 * A representation of the model object '<em><b>Immunizations Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationsSectionEntriesOptionalTemplateId ImmunizationsSectionEntriesOptionalCode ImmunizationsSectionEntriesOptionalCodeP ImmunizationsSectionEntriesOptional2Entry1090' templateId.root='2.16.840.1.113883.10.20.22.2.2' templateId.extension='2015-08-01' code.code='11369-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Immunizations' constraints.validation.dependOn.ImmunizationsSectionEntriesOptionalCode='ImmunizationsSectionEntriesOptionalCodeP' constraints.validation.warning='ImmunizationsSectionEntriesOptional2ImmunizationActivity2EntryImmunizationActivity21091' constraints.validation.query='ImmunizationsSectionEntriesOptional2ImmunizationActivity2EntryImmunizationActivity21091'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationsSectionEntriesOptional2ImmunizationActivity2Entry constraints.validation.warning='ImmunizationsSectionEntriesOptional2ImmunizationActivity2EntryImmunizationActivity21091'"
 * @generated
 */
public interface ImmunizationsSectionEntriesOptional2 extends ImmunizationsSectionEntriesOptional {
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
	boolean validateImmunizationsSectionEntriesOptional2Entry1090(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)))'"
	 * @generated
	 */
	boolean validateImmunizationsSectionEntriesOptional2ImmunizationActivity2EntryImmunizationActivity21091(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ImmunizationsSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationsSectionEntriesOptional2
