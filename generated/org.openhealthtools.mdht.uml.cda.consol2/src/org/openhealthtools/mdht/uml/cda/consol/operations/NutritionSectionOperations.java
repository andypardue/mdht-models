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
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionEntry762(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Entry762</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Nutritional Status Observation Entry Nutritional Status Observation763</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionTemplateId(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionTemplateId(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.57')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionTemplateId(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionTemplateId(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionSectionTemplateId(NutritionSection nutritionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionTemplateId"),
						 new Object [] { nutritionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionCode(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionCode(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '61144-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionCode(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionCode(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionSectionCode(NutritionSection nutritionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionCode"),
						 new Object [] { nutritionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionCodeP(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionCodeP(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionCodeP(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionCodeP(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionSectionCodeP(NutritionSection nutritionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionCodeP"),
						 new Object [] { nutritionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionTitle(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionTitle(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionTitle(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionTitle(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionSectionTitle(NutritionSection nutritionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionTitle"),
						 new Object [] { nutritionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionText(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionText(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionText(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionText(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionSectionText(NutritionSection nutritionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionText"),
						 new Object [] { nutritionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionEntry762(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Entry762</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionEntry762(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_ENTRY762__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionEntry762(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Entry762</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionEntry762(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_SECTION_ENTRY762__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionSectionEntry762(NutritionSection nutritionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_ENTRY762__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				VALIDATE_NUTRITION_SECTION_ENTRY762__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_SECTION_ENTRY762__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_SECTION_ENTRY762__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_ENTRY762,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionEntry762"),
						 new Object [] { nutritionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Nutritional Status Observation Entry Nutritional Status Observation763</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionalStatusObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Nutritional Status Observation Entry Nutritional Status Observation763</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763(NutritionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionSection The receiving '<em><b>Nutrition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763(NutritionSection nutritionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionSection);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_SECTION__NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_NUTRITIONAL_STATUS_OBSERVATION763,
						 ConsolPlugin.INSTANCE.getString("NutritionSectionNutritionSectionNutritionalStatusObservationEntryNutritionalStatusObservation763"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // NutritionSectionOperations
