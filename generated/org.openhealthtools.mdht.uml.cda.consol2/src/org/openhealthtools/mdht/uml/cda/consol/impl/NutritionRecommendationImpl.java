/**
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
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;

import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionRecommendationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NutritionRecommendationImpl extends ActImpl implements NutritionRecommendation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NUTRITION_RECOMMENDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEntryRelationship602(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship602(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEntryRelationship604(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship604(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEntryRelationship606(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship606(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEntryRelationship608(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship608(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEntryRelationship610(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship610(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEntryRelationship612(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship612(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRecommendation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NutritionRecommendation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NutritionRecommendationImpl
