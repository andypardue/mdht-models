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
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GoalObservationImpl extends ObservationImpl implements GoalObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GOAL_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryRelationship624(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryRelationship624(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryRelationship626(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryRelationship626(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryRelationship628(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryRelationship628(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryRelationship630(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryRelationship630(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryRelationship632(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryRelationship632(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationReferenceExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public GoalObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // GoalObservationImpl
