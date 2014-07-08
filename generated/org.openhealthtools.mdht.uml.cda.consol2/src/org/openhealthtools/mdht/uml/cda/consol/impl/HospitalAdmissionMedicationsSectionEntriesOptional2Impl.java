/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionMedicationsSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Admission Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionMedicationsSectionEntriesOptional2Impl extends
		HospitalAdmissionMedicationsSectionEntriesOptionalImpl implements
		HospitalAdmissionMedicationsSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionMedicationsSectionEntriesOptional2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdmissionMedication2> getConsolAdmissionMedication2s() {
		return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.getConsolAdmissionMedication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionMedicationsSectionEntriesOptional2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionMedicationsSectionEntriesOptional2 init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HospitalAdmissionMedicationsSectionEntriesOptional2Impl
