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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Treatment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1118(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1118</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1120(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1120</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1122(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1122</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1124(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1124</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1126(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1126</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1128(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1128</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1130(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1130</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1132(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1132</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1134(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1134</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1136(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1136</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1138(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1138</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Observation2 Entry Planned Observation21119</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Encounter2 Entry Planned Encounter21121</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Act2 Entry Planned Act21123</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Procedure2 Entry Planned Procedure21125</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Medication Activity2 Entry Planned Medication Activity21127</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Supply2 Entry Planned Supply21129</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Instruction2 Entry Instruction21131</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication Participants Entry Handoff Communication1133</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation Entry Nutrition Recommendation1135</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity Entry Planned Immunization Activity1137</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation Entry Goal Observation1139</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfTreatmentSection2Operations extends PlanOfCareSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfTreatmentSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1118(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1118</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1118(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1118(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1118</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1118(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1118(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1118,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1118"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1120(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1120</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1120(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1120(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1120</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1120(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1120(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1120,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1120"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1122(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1122</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1122(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1122(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1122</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1122(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1122(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1122,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1122"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1124(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1124</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1124(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1124(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1124</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1124(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1124(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1124,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1124"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1126(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1126</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1126(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1126(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1126</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1126(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1126(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1126,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1126"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1128(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1128</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1128(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1128(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1128</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1128(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1128(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1128,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1128"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1130(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1130</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1130(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1130(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1130</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1130(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1130(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1130,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1130"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1132(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1132(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1132(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1132</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1132(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1132(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1132,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1132"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1134(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1134(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1134(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1134</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1134(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1134(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1134,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1134"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1136(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1136(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1136(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1136</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1136(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1136(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1136,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1136"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Entry1138(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1138(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Entry1138(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1138</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Entry1138(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlanOfTreatmentSection2Entry1138(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_ENTRY1138,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Entry1138"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Observation2 Entry Planned Observation21119</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Observation2 Entry Planned Observation21119</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Encounter2 Entry Planned Encounter21121</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Encounter2 Entry Planned Encounter21121</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Act2 Entry Planned Act21123</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Act2 Entry Planned Act21123</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Procedure2 Entry Planned Procedure21125</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Procedure2 Entry Planned Procedure21125</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Medication Activity2 Entry Planned Medication Activity21127</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Medication Activity2 Entry Planned Medication Activity21127</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Supply2 Entry Planned Supply21129</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Supply2 Entry Planned Supply21129</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Instruction2 Entry Instruction21131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Instruction2 Entry Instruction21131</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2Instruction2EntryInstruction21131"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication Participants Entry Handoff Communication1133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication Participants Entry Handoff Communication1133</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation Entry Nutrition Recommendation1135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation Entry Nutrition Recommendation1135</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity Entry Planned Immunization Activity1137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity Entry Planned Immunization Activity1137</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation Entry Goal Observation1139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation Entry Goal Observation1139</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(planOfTreatmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2GoalObservationEntryGoalObservation1139"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionTemplateId(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionTemplateId"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionCodeP"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP", passToken);
				}
				passToken.add(planOfTreatmentSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCode(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(planOfTreatmentSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionCode"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // PlanOfTreatmentSection2Operations
