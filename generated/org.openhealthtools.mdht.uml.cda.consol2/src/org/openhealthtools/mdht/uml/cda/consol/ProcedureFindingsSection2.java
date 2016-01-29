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
 * A representation of the model object '<em><b>Procedure Findings Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureFindingsSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureFindingsSectionTemplateId ProcedureFindingsSectionCode ProcedureFindingsSectionCodeP ProcedureFindingsSection2Entry1146' templateId.root='2.16.840.1.113883.10.20.22.2.28' templateId.extension='2015-08-01' code.code='59776-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Procedure Findings' constraints.validation.dependOn.ProcedureFindingsSectionCode='ProcedureFindingsSectionCodeP' constraints.validation.info='ProcedureFindingsSection2ProblemObservation2EntryProblemObservation21147' constraints.validation.query='ProcedureFindingsSection2ProblemObservation2EntryProblemObservation21147'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureFindingsSection2ProblemObservation2Entry constraints.validation.info='ProcedureFindingsSection2ProblemObservation2EntryProblemObservation21147'"
 * @generated
 */
public interface ProcedureFindingsSection2 extends ProcedureFindingsSection {
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
	boolean validateProcedureFindingsSection2Entry1146(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))'"
	 * @generated
	 */
	boolean validateProcedureFindingsSection2ProblemObservation2EntryProblemObservation21147(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProcedureFindingsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureFindingsSection2
