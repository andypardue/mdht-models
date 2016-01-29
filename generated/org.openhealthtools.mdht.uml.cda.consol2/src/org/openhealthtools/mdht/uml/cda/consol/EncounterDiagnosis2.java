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
 * A representation of the model object '<em><b>Encounter Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncounterDiagnosis2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncounterDiagnosisTemplateId EncounterDiagnosisCode EncounterDiagnosisCodeP EncounterDiagnosis2EntryRelationship908 EncounterDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2909' templateId.root='2.16.840.1.113883.10.20.22.4.80' templateId.extension='2015-08-01' code.code='29308-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Diagnosis' constraints.validation.dependOn.EncounterDiagnosisCode='EncounterDiagnosisCodeP' constraints.validation.query='EncounterDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2909'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterDiagnosis2ProblemObservation2EntryRelationship constraints.validation.error='EncounterDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2909'"
 * @generated
 */
public interface EncounterDiagnosis2 extends EncounterDiagnosis {
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
	boolean validateEncounterDiagnosis2EntryRelationship908(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEncounterDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2909(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EncounterDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncounterDiagnosis2
