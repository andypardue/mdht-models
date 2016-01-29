/**
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
 * A representation of the model object '<em><b>Family History Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistoryOrganizer2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistoryOrganizerTemplateId FamilyHistoryOrganizer2Id FamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545' templateId.root='2.16.840.1.113883.10.20.22.4.45' templateId.extension='2015-08-01' constraints.validation.query='FamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationship constraints.validation.error='FamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545'"
 * @generated
 */
public interface FamilyHistoryOrganizer2 extends FamilyHistoryOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizer2Id(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation2)))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FamilyHistoryOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistoryOrganizer2
