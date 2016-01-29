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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervention Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InterventionActImpl extends ActImpl implements InterventionAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INTERVENTION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship700(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship700(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship702(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship702(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship704(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship704(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship706(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship706(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship708(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship708(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship710(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship710(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship712(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship712(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship714(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship714(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship716(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship716(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship718(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship718(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship720(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship720(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship722(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship722(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship724(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship724(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship726(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship726(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryRelationship728(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryRelationship728(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActReferenceExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActInterventionActEntryRelationshipInterventionAct709(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActInterventionActEntryRelationshipInterventionAct709(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActInstruction2EntryRelationshipInstruction2717(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActInstruction2EntryRelationshipInstruction2717(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public InterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // InterventionActImpl
