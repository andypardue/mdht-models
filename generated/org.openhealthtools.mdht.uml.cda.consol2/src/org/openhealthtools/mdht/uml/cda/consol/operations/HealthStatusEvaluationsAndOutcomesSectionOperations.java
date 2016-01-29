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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionEntry754(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Entry754</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Outcome Observation Entry Outcome Observation755</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthStatusEvaluationsAndOutcomesSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusEvaluationsAndOutcomesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.61')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(
			HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionTemplateId"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(
			HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionNullFlavor"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionCode(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionCode(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11383-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionCode(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionCode(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsAndOutcomesSectionCode(
			HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionCode"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionCodeP(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionCodeP(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionCodeP(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionCodeP(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsAndOutcomesSectionCodeP(
			HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionCodeP"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionTitle(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionTitle(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionTitle(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionTitle(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsAndOutcomesSectionTitle(
			HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionTitle"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionText(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionText(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionText(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionText(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthStatusEvaluationsAndOutcomesSectionText(
			HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionText"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionEntry754(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Entry754</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionEntry754(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionEntry754(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Entry754</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionEntry754(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthStatusEvaluationsAndOutcomesSectionEntry754(HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthStatusEvaluationsAndOutcomesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionEntry754"),
						 new Object [] { healthStatusEvaluationsAndOutcomesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Outcome Observation Entry Outcome Observation755</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::OutcomeObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Outcome Observation Entry Outcome Observation755</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(HealthStatusEvaluationsAndOutcomesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthStatusEvaluationsAndOutcomesSection The receiving '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthStatusEvaluationsAndOutcomesSection);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION__HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755,
						 ConsolPlugin.INSTANCE.getString("HealthStatusEvaluationsAndOutcomesSectionHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // HealthStatusEvaluationsAndOutcomesSectionOperations
