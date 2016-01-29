/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
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

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1548(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1548</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1550(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1550</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1552(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1552</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1554(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1554</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1556(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1556</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1558(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1558</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1560(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1560</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1562(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1562</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1564(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1564</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1566(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1566</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1568(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1568</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1570(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1570</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1572(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1572</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1574(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1574</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1576(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1576</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1578(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1578</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1580(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1580</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1582(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1582</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1584(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1584</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1586(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1586</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1588(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1588</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation21549</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2 Entry Relationship Immunization Activity21551</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2 Entry Relationship Medication Activity21553</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act21555</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act Entry Relationship Intervention Act1557</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation21559</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure21561</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2 Entry Relationship Encounter Activity21563</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2 Entry Relationship Instruction21565</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity21567</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2 Entry Relationship Planned Act21569</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2 Entry Relationship Planned Encounter21571</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2 Entry Relationship Planned Observation21573</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2 Entry Relationship Planned Procedure21575</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2 Entry Relationship Planned Medication Activity21577</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2 Entry Relationship Planned Supply21579</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation1581</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Doc Instance1583</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Goal Obs1585</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants1587</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity Entry Relationship Planned Immunization Activity1589</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedInterventionActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedInterventionActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.146' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActTemplateId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActTemplateId(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActTemplateId"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActClassCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActClassCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActClassCode"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActMoodCodeP(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_MOOD_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActMoodCodeP"),
						 new Object [] { plannedInterventionAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP", passToken);
				}
				passToken.add(plannedInterventionAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and "+
"let value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in "+
"value = vocab::x_DocumentActMood::APT or value = vocab::x_DocumentActMood::ARQ or value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::PRMS or value = vocab::x_DocumentActMood::PRP or value = vocab::x_DocumentActMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMoodCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActMoodCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedInterventionAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActMoodCode"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActId(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActId(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ID,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActId"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActCodeP(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActCodeP"),
						 new Object [] { plannedInterventionAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP", passToken);
				}
				passToken.add(plannedInterventionAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '362956003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedInterventionAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActCode"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActStatusCode(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActStatusCode"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActStatusCodeP(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActStatusCodeP(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActStatusCodeP"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEffectiveTime(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActEffectiveTime(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEffectiveTime"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAuthorParticipation(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActAuthorParticipation(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActAuthorParticipation"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedInterventionActReference(PlannedInterventionAct plannedInterventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActReference"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1548(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1548</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1548(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1548(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1548</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1548(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1548(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1548"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1550(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1550</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1550(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1550(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1550</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1550(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1550(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1550"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1552(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1552</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1552(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1552(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1552</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1552(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1552(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1552"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1554(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1554</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1554(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1554(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1554</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1554(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1554(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1554"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1556(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1556</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1556(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1556(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1556</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1556(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1556(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1556"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1558(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1558</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1558(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1558(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1558</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1558(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1558(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1558"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1560(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1560</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1560(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1560(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1560</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1560(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1560(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1560"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1562(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1562</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1562(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1562(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1562</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1562(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1562(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1562"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1564(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1564</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1564(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1564(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1564</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1564(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1564(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1564"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1566(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1566</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1566(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1566(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1566</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1566(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1566(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1566"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1568(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1568</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1568(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1568(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1568</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1568(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1568(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1568"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1570(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1570</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1570(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1570(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1570</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1570(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1570(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1570"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1572(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1572</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1572(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1572(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1572</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1572(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1572(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1572"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1574(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1574</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1574(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1574(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1574</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1574(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1574(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1574"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1576(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1576</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1576(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1576(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1576</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1576(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1576(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1576"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1578(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1578</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1578(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1578(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1578</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1578(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1578(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1578"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1580(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1580</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1580(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1580(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1580</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1580(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1580(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1580"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1582(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1582</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1582(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1582(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1582</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1582(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1582(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1582"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1584(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1584</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1584(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1584(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1584</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1584(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1584(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1584"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1586(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1586</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1586(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1586(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1586</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1586(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1586(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1586"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryRelationship1588(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1588</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1588(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryRelationship1588(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1588</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryRelationship1588(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedInterventionActEntryRelationship1588(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedInterventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryRelationship1588"),
						 new Object [] { plannedInterventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceTypeCode(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedInterventionActReferenceTypeCode(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActReferenceTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActReferenceExternalDocumentReference(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedInterventionActReferenceExternalDocumentReference(
			PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActReferenceExternalDocumentReference"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation21549</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation21549</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2 Entry Relationship Immunization Activity21551</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2 Entry Relationship Immunization Activity21551</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2 Entry Relationship Medication Activity21553</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2 Entry Relationship Medication Activity21553</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act21555</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act21555</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act Entry Relationship Intervention Act1557</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act Entry Relationship Intervention Act1557</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActInterventionActEntryRelationshipInterventionAct1557"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation21559</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation21559</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure21561</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure21561</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2 Entry Relationship Encounter Activity21563</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2 Entry Relationship Encounter Activity21563</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2 Entry Relationship Instruction21565</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2 Entry Relationship Instruction21565</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActInstruction2EntryRelationshipInstruction21565"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity21567</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity21567</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2 Entry Relationship Planned Act21569</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2 Entry Relationship Planned Act21569</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2 Entry Relationship Planned Encounter21571</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2 Entry Relationship Planned Encounter21571</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2 Entry Relationship Planned Observation21573</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2 Entry Relationship Planned Observation21573</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2 Entry Relationship Planned Procedure21575</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2 Entry Relationship Planned Procedure21575</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2 Entry Relationship Planned Medication Activity21577</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2 Entry Relationship Planned Medication Activity21577</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2 Entry Relationship Planned Supply21579</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2 Entry Relationship Planned Supply21579</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation1581</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation1581</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Doc Instance1583</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Doc Instance1583</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Goal Obs1585</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Goal Obs1585</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants1587</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants1587</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity Entry Relationship Planned Immunization Activity1589</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity Entry Relationship Planned Immunization Activity1589</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(PlannedInterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedInterventionAct The receiving '<em><b>Planned Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(PlannedInterventionAct plannedInterventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedInterventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_INTERVENTION_ACT__PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589,
						 ConsolPlugin.INSTANCE.getString("PlannedInterventionActPlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PlannedInterventionActOperations
