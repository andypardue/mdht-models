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
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship624(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship624</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship626(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship626</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship628(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship628</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship630(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship630</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship632(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship632</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Health Concern Act ER625</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Planned ERs627</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference Entry Relationship Priority Preference629</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation Entry Relationship Goal Observation631</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Act Reference ER633</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.121')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationTemplateId(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationTemplateId"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationClassCode(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationClassCode"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::GOL";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationMoodCode(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationMoodCode"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationId(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ID,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationId"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationCodeP(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationCodeP"),
						 new Object [] { goalObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP", passToken);
				}
				passToken.add(goalObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationCode(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(goalObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationCode"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationStatusCode(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationStatusCode"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationStatusCodeP(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationStatusCodeP"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationEffectiveTime(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEffectiveTime"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationValue(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationValue"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationAuthorParticipation(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationAuthorParticipation"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationReference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationReference"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryRelationship624(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship624</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship624(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryRelationship624(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship624</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship624(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGoalObservationEntryRelationship624(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_RELATIONSHIP624,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryRelationship624"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryRelationship626(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship626</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship626(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryRelationship626(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship626</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship626(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGoalObservationEntryRelationship626(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_RELATIONSHIP626,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryRelationship626"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryRelationship628(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship628</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship628(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryRelationship628(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship628</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship628(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGoalObservationEntryRelationship628(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_RELATIONSHIP628,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryRelationship628"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryRelationship630(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship630</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship630(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryRelationship630(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship630</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship630(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGoalObservationEntryRelationship630(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_RELATIONSHIP630,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryRelationship630"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryRelationship632(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship632</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship632(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryRelationship632(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship632</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryRelationship632(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGoalObservationEntryRelationship632(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_RELATIONSHIP632,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryRelationship632"),
						 new Object [] { goalObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGoalObservationReferenceTypeCode(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_REFERENCE_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationReferenceTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGoalObservationReferenceExternalDocumentReference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationReferenceExternalDocumentReference"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Health Concern Act ER625</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Health Concern Act ER625</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Planned ERs627</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Planned ERs627</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryReferenceEntryRelationshipPlannedERs627"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference Entry Relationship Priority Preference629</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference Entry Relationship Priority Preference629</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation Entry Relationship Goal Observation631</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation Entry Relationship Goal Observation631</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationGoalObservationEntryRelationshipGoalObservation631"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Act Reference ER633</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Act Reference ER633</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(GoalObservation goalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633,
						 ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEntryReferenceEntryRelationshipActReferenceER633"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // GoalObservationOperations
