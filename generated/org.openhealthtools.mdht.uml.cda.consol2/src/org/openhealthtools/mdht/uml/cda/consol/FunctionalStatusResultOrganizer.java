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
 * A representation of the model object '<em><b>Functional Status Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusResultOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerTemplateId ResultOrganizerClassCode ResultOrganizerMoodCode ResultOrganizerId ResultOrganizerCode ResultOrganizerStatusCode ResultOrganizerStatusCodeP FunctionalStatusResultOrganizerFunctionalStatusResultObservationEntryRelationshipFunctionalStatusResultObservation591' templateId.root='2.16.840.1.113883.10.20.22.4.66' constraints.validation.warning='ResultOrganizerCodeValue' classCode='CLUSTER' moodCode='EVN' statusCode.code='completed' constraints.validation.dependOn.ResultOrganizerStatusCode='ResultOrganizerStatusCodeP' constraints.validation.query='FunctionalStatusResultOrganizerFunctionalStatusResultObservationEntryRelationshipFunctionalStatusResultObservation591'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusResultOrganizerFunctionalStatusResultObservationEntryRelationship constraints.validation.error='FunctionalStatusResultOrganizerFunctionalStatusResultObservationEntryRelationshipFunctionalStatusResultObservation591'"
 * @generated
 */
public interface FunctionalStatusResultOrganizer extends ResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultOrganizerFunctionalStatusResultObservationEntryRelationshipFunctionalStatusResultObservation591(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusResultOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public FunctionalStatusResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusResultOrganizer
