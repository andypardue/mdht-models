/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship700(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship700</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship702(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship702</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship704(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship704</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship706(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship706</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship708(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship708</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship710(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship710</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship712(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship712</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship714(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship714</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship716(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship716</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship718(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship718</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship720(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship720</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship722(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship722</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship724(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship724</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship726(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship726</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship728(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship728</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation2701</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2 Entry Relationship Immunization Activity2703</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2 Entry Relationship Medication Activity2705</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act2707</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInterventionActEntryRelationshipInterventionAct709(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Act Entry Relationship Intervention Act709</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation2711</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure2713</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2 Entry Relationship Encounter Activity2715</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInstruction2EntryRelationshipInstruction2717(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2 Entry Relationship Instruction2717</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity2719</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation721</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Reference Entry Relationship Intervention Entry Reference723</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference Entry Relationship Goal Obs Entry Reference725</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants727</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act Entry Relationship Planned Intervention Act729</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterventionActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.131' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActTemplateId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActTemplateId(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActTemplateId"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActClassCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActClassCode(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActClassCode"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMoodCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActMoodCode(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActMoodCode"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActId(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActId(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ID,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActId"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActCodeP(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActCodeP"),
						 new Object [] { interventionAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP", passToken);
				}
				passToken.add(interventionAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '362956003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActCode(InterventionAct interventionAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(interventionAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActCode"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActStatusCode(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActStatusCode"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActStatusCodeP(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActStatusCodeP(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActStatusCodeP"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEffectiveTime(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActEffectiveTime(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEffectiveTime"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAuthorParticipation(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActAuthorParticipation(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActAuthorParticipation"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionActReference(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActReference"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship700(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship700</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship700(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship700(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship700</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship700(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship700(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP700,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship700"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship702(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship702</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship702(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship702(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship702</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship702(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship702(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP702,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship702"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship704(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship704</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship704(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship704(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship704</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship704(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship704(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP704,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship704"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship706(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship706</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship706(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship706(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship706</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship706(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship706(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP706,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship706"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship708(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship708</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship708(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship708(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship708</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship708(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship708(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP708,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship708"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship710(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship710</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship710(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship710(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship710</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship710(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship710(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP710,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship710"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship712(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship712</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship712(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship712(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship712</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship712(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship712(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP712,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship712"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship714(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship714</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship714(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship714(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship714</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship714(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship714(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP714,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship714"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship716(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship716</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship716(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship716(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship716</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship716(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship716(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP716,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship716"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship718(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship718</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship718(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship718(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship718</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship718(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship718(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP718,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship718"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship720(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship720</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship720(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship720(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship720</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship720(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship720(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP720,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship720"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship722(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship722</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship722(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship722(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship722</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship722(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship722(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP722,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship722"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship724(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship724</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship724(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship724(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship724</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship724(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship724(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP724,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship724"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship726(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship726</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship726(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship726(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship726</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship726(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship726(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP726,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship726"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryRelationship728(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship728</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship728(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryRelationship728(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship728</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryRelationship728(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionActEntryRelationship728(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_RELATIONSHIP728,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryRelationship728"),
						 new Object [] { interventionAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceTypeCode(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateInterventionActReferenceTypeCode(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_REFERENCE_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActReferenceTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActReferenceExternalDocumentReference(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateInterventionActReferenceExternalDocumentReference(InterventionAct interventionAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActReferenceExternalDocumentReference"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation2701</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation2701</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2 Entry Relationship Immunization Activity2703</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2 Entry Relationship Immunization Activity2703</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2 Entry Relationship Medication Activity2705</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2 Entry Relationship Medication Activity2705</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act2707</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act2707</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActInterventionActEntryRelationshipInterventionAct709(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Act Entry Relationship Intervention Act709</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInterventionActEntryRelationshipInterventionAct709(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActInterventionActEntryRelationshipInterventionAct709(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Act Entry Relationship Intervention Act709</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInterventionActEntryRelationshipInterventionAct709(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActInterventionActEntryRelationshipInterventionAct709(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActInterventionActEntryRelationshipInterventionAct709"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation2711</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation2711</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure2713</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure2713</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2 Entry Relationship Encounter Activity2715</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2 Entry Relationship Encounter Activity2715</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActInstruction2EntryRelationshipInstruction2717(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2 Entry Relationship Instruction2717</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInstruction2EntryRelationshipInstruction2717(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActInstruction2EntryRelationshipInstruction2717(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2 Entry Relationship Instruction2717</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActInstruction2EntryRelationshipInstruction2717(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActInstruction2EntryRelationshipInstruction2717(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActInstruction2EntryRelationshipInstruction2717"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity2719</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity2719</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation721</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation721</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Reference Entry Relationship Intervention Entry Reference723</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Reference Entry Relationship Intervention Entry Reference723</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference Entry Relationship Goal Obs Entry Reference725</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference Entry Relationship Goal Obs Entry Reference725</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants727</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants727</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act Entry Relationship Planned Intervention Act729</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedInterventionAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act Entry Relationship Planned Intervention Act729</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(InterventionAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionAct The receiving '<em><b>Intervention Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(InterventionAct interventionAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTION_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTION_ACT__INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729,
						 ConsolPlugin.INSTANCE.getString("InterventionActInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // InterventionActOperations
