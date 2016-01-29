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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preoperative Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PreoperativeDiagnosisSection2Impl extends PreoperativeDiagnosisSectionImpl implements
		PreoperativeDiagnosisSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreoperativeDiagnosisSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSection2Entry1144(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSection2Entry1144(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis21145(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis21145(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreoperativeDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreoperativeDiagnosisSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreoperativeDiagnosisSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PreoperativeDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PreoperativeDiagnosisSection2Impl
