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
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedInterventionActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Intervention Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedInterventionActImpl extends ActImpl implements PlannedInterventionAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedInterventionActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_INTERVENTION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1548(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1548(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1550(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1550(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1552(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1552(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1554(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1554(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1556(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1556(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1558(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1558(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1560(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1560(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1562(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1562(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1564(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1564(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1566(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1566(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1568(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1568(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1570(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1570(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1572(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1572(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1574(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1574(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1576(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1576(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1578(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1578(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1580(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1580(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1582(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1582(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1584(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1584(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1586(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1586(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryRelationship1588(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1588(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActReferenceExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedInterventionAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlannedInterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlannedInterventionActImpl
