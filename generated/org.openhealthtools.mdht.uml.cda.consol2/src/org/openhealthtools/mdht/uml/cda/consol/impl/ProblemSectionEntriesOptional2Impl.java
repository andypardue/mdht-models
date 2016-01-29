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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemSectionEntriesOptional2Impl extends ProblemSectionEntriesOptionalImpl implements
		ProblemSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSectionEntriesOptional2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_SECTION_ENTRIES_OPTIONAL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionEntriesOptional2Entry1180(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptional2Entry1180(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionEntriesOptional2Entry1182(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptional2Entry1182(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionEntriesOptional2ProblemConcernAct2EntryProblemConcernAct21181(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptional2ProblemConcernAct2EntryProblemConcernAct21181(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionEntriesOptional2HealthStatusObservation2EntryHealthStatusObservation21183(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptional2HealthStatusObservation2EntryHealthStatusObservation21183(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemSectionEntriesOptionalCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionEntriesOptional2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProblemSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProblemSectionEntriesOptional2Impl
