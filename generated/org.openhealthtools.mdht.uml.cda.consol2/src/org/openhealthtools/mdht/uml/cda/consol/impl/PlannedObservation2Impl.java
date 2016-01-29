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
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedObservation2Impl extends PlanOfCareActivityObservationImpl implements PlannedObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2MethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2MethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2TargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2TargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2TargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2TargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2Performer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2EntryRelationship968(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship968(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2EntryRelationship970(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship970(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2EntryRelationship972(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship972(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2EntryRelationship974(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship974(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2Indication2EntryRelationshipIndication2971(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2Indication2EntryRelationshipIndication2971(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2Instruction2EntryRelationshipInstruction2973(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2Instruction2EntryRelationshipInstruction2973(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlanOfCareActivityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedObservation2Operations.validatePlanOfCareActivityObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedObservation2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PlannedObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlannedObservation2Impl
