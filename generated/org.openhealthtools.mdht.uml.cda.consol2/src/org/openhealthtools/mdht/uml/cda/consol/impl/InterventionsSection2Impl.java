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
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;

import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interventions Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InterventionsSection2Impl extends InterventionsSectionImpl implements InterventionsSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionsSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INTERVENTIONS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2Entry1094(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2Entry1094(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2Entry1096(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2Entry1096(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2Entry1098(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2Entry1098(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2InterventionActEntryInterventionAct1095(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2InterventionActEntryInterventionAct1095(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionsSection2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public InterventionsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // InterventionsSection2Impl
