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

import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1160(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1160</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1162(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1162</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1164(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1164</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1166(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1166</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1168(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1168</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1170(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1170</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Social History Observation2 Entry Social History Observation21161</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Smoking Status Meaningful Use2 Entry Current Smoking Status21163</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Tobacco Use2 Entry Tobacco Use21165</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics Entry Caregiver Characteristics1167</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation Entry Cultural And Religious Observation1169</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment Entry Characteristics Of Home Environment1171</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistorySection2Operations extends SocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistorySection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2Entry1160(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1160</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1160(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2Entry1160(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1160</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1160(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySection2Entry1160(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_ENTRY1160,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2Entry1160"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2Entry1162(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1162</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1162(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2Entry1162(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1162</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1162(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySection2Entry1162(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_ENTRY1162,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2Entry1162"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2Entry1164(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1164</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1164(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2Entry1164(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1164</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1164(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySection2Entry1164(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_ENTRY1164,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2Entry1164"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2Entry1166(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1166</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1166(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2Entry1166(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1166</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1166(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySection2Entry1166(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_ENTRY1166,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2Entry1166"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2Entry1168(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1168</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1168(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2Entry1168(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1168</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1168(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySection2Entry1168(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_ENTRY1168,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2Entry1168"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2Entry1170(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1170</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1170(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2Entry1170(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1170</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2Entry1170(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySection2Entry1170(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_ENTRY1170,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2Entry1170"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Social History Observation2 Entry Social History Observation21161</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Social History Observation2 Entry Social History Observation21161</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(socialHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Smoking Status Meaningful Use2 Entry Current Smoking Status21163</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Smoking Status Meaningful Use2 Entry Current Smoking Status21163</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(socialHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Tobacco Use2 Entry Tobacco Use21165</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Tobacco Use2 Entry Tobacco Use21165</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(socialHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2TobaccoUse2EntryTobaccoUse21165"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics Entry Caregiver Characteristics1167</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics Entry Caregiver Characteristics1167</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(socialHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation Entry Cultural And Religious Observation1169</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation Entry Cultural And Religious Observation1169</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(socialHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment Entry Characteristics Of Home Environment1171</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment Entry Characteristics Of Home Environment1171</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(socialHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.17' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTemplateId(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySectionTemplateId"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionCodeP(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySectionCodeP"),
						 new Object [] { socialHistorySection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP", passToken);
				}
				passToken.add(socialHistorySection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '29762-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionCode(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(socialHistorySection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySectionCode"),
						 new Object [] { socialHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // SocialHistorySection2Operations
