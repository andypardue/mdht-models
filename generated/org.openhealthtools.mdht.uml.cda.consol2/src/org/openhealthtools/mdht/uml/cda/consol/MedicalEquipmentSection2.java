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
 * A representation of the model object '<em><b>Medical Equipment Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicalEquipmentSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicalEquipmentSectionTemplateId MedicalEquipmentSectionCode MedicalEquipmentSectionCodeP MedicalEquipmentSection2Entry1100 MedicalEquipmentSection2Entry1102 MedicalEquipmentSection2Entry1104' templateId.root='2.16.840.1.113883.10.20.22.2.23' templateId.extension='2014-06-09' code.code='46264-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Medical Equipment' constraints.validation.dependOn.MedicalEquipmentSectionCode='MedicalEquipmentSectionCodeP' constraints.validation.info='MedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101' constraints.validation.query='MedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101 MedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103 MedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105' constraints.validation.warning='MedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103 MedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicalEquipmentSection2MedicalEquipmentOrganizerEntry constraints.validation.info='MedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicalEquipmentSection2NonMedicinalSupplyActivity2Entry constraints.validation.warning='MedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicalEquipmentSection2ProcedureActivityProcedure2Entry constraints.validation.warning='MedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105'"
 * @generated
 */
public interface MedicalEquipmentSection2 extends MedicalEquipmentSection {
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
	boolean validateMedicalEquipmentSection2Entry1100(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicalEquipmentSection2Entry1102(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicalEquipmentSection2Entry1104(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::MedicalEquipmentOrganizer)))'"
	 * @generated
	 */
	boolean validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))'"
	 * @generated
	 */
	boolean validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))'"
	 * @generated
	 */
	boolean validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipmentSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public MedicalEquipmentSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicalEquipmentSection2
