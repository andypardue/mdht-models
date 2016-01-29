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
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;

import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concerns Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionEntry748(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry748</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionEntry750(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry750</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionEntry752(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry752</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2 Entry Health Status Observation2749</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act Entry Health Concern Act751</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act Entry Risk Concern Act753</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthConcernsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.58' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionTemplateId(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionTemplateId"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionNullFlavor(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_NULL_FLAVOR,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionNullFlavor"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '75310-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionCode(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionCode"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionCodeP(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionCodeP"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionTitle(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionTitle"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionText(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionText"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionEntry748(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry748</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionEntry748(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionEntry748(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry748</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionEntry748(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernsSectionEntry748(HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_ENTRY748,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionEntry748"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionEntry750(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry750</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionEntry750(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionEntry750(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry750</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionEntry750(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernsSectionEntry750(HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_ENTRY750,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionEntry750"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionEntry752(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry752</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionEntry752(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionEntry752(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry752</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionEntry752(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernsSectionEntry752(HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_ENTRY752,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionEntry752"),
						 new Object [] { healthConcernsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2 Entry Health Status Observation2749</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2 Entry Health Status Observation2749</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernsSection);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act Entry Health Concern Act751</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HealthConcernAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act Entry Health Concern Act751</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernsSection);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionHealthConcernActEntryHealthConcernAct751"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act Entry Risk Concern Act753</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::RiskConcernAct)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act Entry Risk Concern Act753</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernsSection);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753,
						 ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionRiskConcernActEntryRiskConcernAct753"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // HealthConcernsSectionOperations
