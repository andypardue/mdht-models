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
 * A representation of the model object '<em><b>Admission Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdmissionMedicationsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalAdmissionMedicationsSectionEntriesOptionalTemplateId HospitalAdmissionMedicationsSectionEntriesOptionalCode HospitalAdmissionMedicationsSectionEntriesOptionalCodeP AdmissionMedicationsSectionEntriesOptional2Entry1084' templateId.root='2.16.840.1.113883.10.20.22.2.44' templateId.extension='2015-08-01' code.code='42346-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Medications on Admission' constraints.validation.dependOn.HospitalAdmissionMedicationsSectionEntriesOptionalCode='HospitalAdmissionMedicationsSectionEntriesOptionalCodeP' constraints.validation.warning='AdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085' constraints.validation.query='AdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2Entry constraints.validation.warning='AdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085'"
 * @generated
 */
public interface AdmissionMedicationsSectionEntriesOptional2 extends HospitalAdmissionMedicationsSectionEntriesOptional {
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
	boolean validateAdmissionMedicationsSectionEntriesOptional2Entry1084(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AdmissionMedication2)))'"
	 * @generated
	 */
	boolean validateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedicationsSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AdmissionMedicationsSectionEntriesOptional2 init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdmissionMedicationsSectionEntriesOptional2
