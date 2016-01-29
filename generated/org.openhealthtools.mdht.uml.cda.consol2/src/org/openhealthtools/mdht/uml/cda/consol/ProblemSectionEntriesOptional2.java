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
 * A representation of the model object '<em><b>Problem Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemSectionEntriesOptionalTemplateId ProblemSectionEntriesOptionalCode ProblemSectionEntriesOptionalCodeP ProblemSectionEntriesOptional2Entry1180 ProblemSectionEntriesOptional2Entry1182' templateId.root='2.16.840.1.113883.10.20.22.2.5' templateId.extension='2015-08-01' code.code='11450-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Problem List' constraints.validation.dependOn.ProblemSectionEntriesOptionalCode='ProblemSectionEntriesOptionalCodeP' constraints.validation.warning='ProblemSectionEntriesOptional2ProblemConcernAct2EntryProblemConcernAct21181' constraints.validation.query='ProblemSectionEntriesOptional2ProblemConcernAct2EntryProblemConcernAct21181 ProblemSectionEntriesOptional2HealthStatusObservation2EntryHealthStatusObservation21183' constraints.validation.info='ProblemSectionEntriesOptional2HealthStatusObservation2EntryHealthStatusObservation21183'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProblemSectionEntriesOptional2ProblemConcernAct2Entry constraints.validation.warning='ProblemSectionEntriesOptional2ProblemConcernAct2EntryProblemConcernAct21181'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProblemSectionEntriesOptional2HealthStatusObservation2Entry constraints.validation.info='ProblemSectionEntriesOptional2HealthStatusObservation2EntryHealthStatusObservation21183'"
 * @generated
 */
public interface ProblemSectionEntriesOptional2 extends ProblemSectionEntriesOptional {
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
	boolean validateProblemSectionEntriesOptional2Entry1180(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProblemSectionEntriesOptional2Entry1182(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)))'"
	 * @generated
	 */
	boolean validateProblemSectionEntriesOptional2ProblemConcernAct2EntryProblemConcernAct21181(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation2)))'"
	 * @generated
	 */
	boolean validateProblemSectionEntriesOptional2HealthStatusObservation2EntryHealthStatusObservation21183(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProblemSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProblemSectionEntriesOptional2
