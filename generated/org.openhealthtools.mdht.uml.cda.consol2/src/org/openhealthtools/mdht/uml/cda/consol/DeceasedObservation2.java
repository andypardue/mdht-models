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
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deceased Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDeceasedObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DeceasedObservationTemplateId DeceasedObservationCode DeceasedObservationCodeP DeceasedObservation2EntryRelationship900' templateId.root='2.16.840.1.113883.10.20.22.4.79' templateId.extension='2015-08-01' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.DeceasedObservationCode='DeceasedObservationCodeP' constraints.validation.warning='DeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901' constraints.validation.query='DeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolDeceasedObservation2ProblemObservation2EntryRelationship constraints.validation.warning='DeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901'"
 * @generated
 */
public interface DeceasedObservation2 extends DeceasedObservation {
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
	boolean validateDeceasedObservation2EntryRelationship900(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))'"
	 * @generated
	 */
	boolean validateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeceasedObservation2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public DeceasedObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DeceasedObservation2
