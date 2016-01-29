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
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedAct2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedAct2Impl extends PlanOfCareActivityActImpl implements PlannedAct2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedAct2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_ACT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2CodeFromLoincOrSnomed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2CodeFromLoincOrSnomed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedAct2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedAct2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedAct2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedAct2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedAct2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedAct2Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2Performer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2EntryRelationship958(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2EntryRelationship958(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2EntryRelationship960(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2EntryRelationship960(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2EntryRelationship962(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2EntryRelationship962(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2PriorityPreferenceEntryRelationshipPriorityPreference959(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2PriorityPreferenceEntryRelationshipPriorityPreference959(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2Indication2EntryRelationshipIndication2961(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2Indication2EntryRelationshipIndication2961(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedAct2Instruction2EntryRelationshipInstruction2963(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlannedAct2Instruction2EntryRelationshipInstruction2963(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlanOfCareActivityActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedAct2Operations.validatePlanOfCareActivityActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedAct2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PlannedAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlannedAct2Impl
