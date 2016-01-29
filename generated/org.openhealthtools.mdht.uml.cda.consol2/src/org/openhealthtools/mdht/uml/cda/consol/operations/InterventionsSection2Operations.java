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
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;

import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interventions Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2Entry1094(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1094</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2Entry1096(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1096</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2Entry1098(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1098</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2InterventionActEntryInterventionAct1095(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act Entry Intervention Act1095</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication Participants Entry Handoff Communication1097</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act Entry Planned Intervention Act1099</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterventionsSection2Operations extends InterventionsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionsSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2Entry1094(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1094</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2Entry1094(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2Entry1094(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1094</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2Entry1094(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionsSection2Entry1094(InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_ENTRY1094,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2Entry1094"),
						 new Object [] { interventionsSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2Entry1096(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1096</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2Entry1096(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2Entry1096(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1096</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2Entry1096(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionsSection2Entry1096(InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_ENTRY1096,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2Entry1096"),
						 new Object [] { interventionsSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2Entry1098(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1098</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2Entry1098(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2Entry1098(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1098</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2Entry1098(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInterventionsSection2Entry1098(InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_ENTRY1098,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2Entry1098"),
						 new Object [] { interventionsSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2InterventionActEntryInterventionAct1095(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act Entry Intervention Act1095</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2InterventionActEntryInterventionAct1095(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2InterventionActEntryInterventionAct1095(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act Entry Intervention Act1095</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2InterventionActEntryInterventionAct1095(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionsSection2InterventionActEntryInterventionAct1095(InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionsSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2InterventionActEntryInterventionAct1095"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication Participants Entry Handoff Communication1097</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication Participants Entry Handoff Communication1097</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionsSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act Entry Planned Intervention Act1099</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedInterventionAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act Entry Planned Intervention Act1099</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(interventionsSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSectionTemplateId(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSectionTemplateId"),
						 new Object [] { interventionsSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSectionCodeP(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSectionCodeP"),
						 new Object [] { interventionsSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP", passToken);
				}
				passToken.add(interventionsSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '62387-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSectionCode(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(interventionsSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSectionCode"),
						 new Object [] { interventionsSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // InterventionsSection2Operations
