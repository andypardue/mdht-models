/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tapered Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.TaperedDose#validateTaperedDoseTaperedDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Tapered Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.TaperedDose#validateTaperedDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaperedDoseOperations extends MedicationOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected TaperedDoseOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateTaperedDoseTaperedDosingSubstanceAdministration(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Tapered Dosing Substance Administration</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTaperedDoseTaperedDosingSubstanceAdministration(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship.substanceAdministration->exists( substanceAdministration  | substanceAdministration.oclIsKindOf( ihe::Medication) )";

	/**
	* The cached OCL invariant for the '{@link #validateTaperedDoseTaperedDosingSubstanceAdministration(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Tapered Dosing Substance Administration</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTaperedDoseTaperedDosingSubstanceAdministration(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param taperedDose The receiving '<em><b>Tapered Dose</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateTaperedDoseTaperedDosingSubstanceAdministration(TaperedDose taperedDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.TAPERED_DOSE);
			try {
				VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			taperedDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.TAPERED_DOSE__TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION,
					IHEPlugin.INSTANCE.getString("TaperedDoseTaperedDosingSubstanceAdministration"),
					new Object[] { taperedDose }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateTaperedDoseTemplateId(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTaperedDoseTemplateId(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.8')";

	/**
	* The cached OCL invariant for the '{@link #validateTaperedDoseTemplateId(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTaperedDoseTemplateId(TaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param taperedDose The receiving '<em><b>Tapered Dose</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateTaperedDoseTemplateId(TaperedDose taperedDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.TAPERED_DOSE);
			try {
				VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(taperedDose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.TAPERED_DOSE__TAPERED_DOSE_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("TaperedDoseTemplateId"), new Object[] { taperedDose }));
			}

			return false;
		}
		return true;
	}

} // TaperedDoseOperations
