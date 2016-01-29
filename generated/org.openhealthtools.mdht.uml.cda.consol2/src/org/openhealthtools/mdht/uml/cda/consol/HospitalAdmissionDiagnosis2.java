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
 * A representation of the model object '<em><b>Hospital Admission Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHospitalAdmissionDiagnosis2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalAdmissionDiagnosisTemplateId HospitalAdmissionDiagnosisCode HospitalAdmissionDiagnosisCodeP HospitalAdmissionDiagnosis2EntryRelationship922 HospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923' templateId.root='2.16.840.1.113883.10.20.22.4.34' templateId.extension='2015-08-01' code.code='46241-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Admission diagnosis' constraints.validation.dependOn.HospitalAdmissionDiagnosisCode='HospitalAdmissionDiagnosisCodeP' constraints.validation.query='HospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationship constraints.validation.error='HospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923'"
 * @generated
 */
public interface HospitalAdmissionDiagnosis2 extends HospitalAdmissionDiagnosis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHospitalAdmissionDiagnosisCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHospitalAdmissionDiagnosis2EntryRelationship922(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosis2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public HospitalAdmissionDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HospitalAdmissionDiagnosis2
