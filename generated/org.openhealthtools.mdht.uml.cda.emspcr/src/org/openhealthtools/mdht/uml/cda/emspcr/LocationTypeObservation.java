/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getLocationTypeObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='LocationTypeObservationTemplateId LocationTypeObservationCode LocationTypeObservationValue' templateId.root='2.16.840.1.1133883.17.3.10.1.88' code.code='74496-1' code.codeSystemName='' code.displayName='Injury location ICD code' value.codeSystem='2.16.840.1.113883.6.90' value.codeSystemName='ICD-10 CM'"
 * @generated
 */
public interface LocationTypeObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.88\')'"
	 * @generated
	 */
	boolean validateLocationTypeObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'74496-1\')'"
	 * @generated
	 */
	boolean validateLocationTypeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.90\'))'"
	 * @generated
	 */
	boolean validateLocationTypeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTypeObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTypeObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // LocationTypeObservation
