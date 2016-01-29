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
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Findings Of Skin Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionEntry764(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Entry764</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Longitudinal Care Wound Observation Entry Wound Observation765</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalFindingsOfSkinSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFindingsOfSkinSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionTemplateId(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionTemplateId(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.62')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionTemplateId(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionTemplateId(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalFindingsOfSkinSectionTemplateId(
			PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalFindingsOfSkinSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionTemplateId"),
						 new Object [] { physicalFindingsOfSkinSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionCode(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionCode(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '10206-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionCode(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionCode(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalFindingsOfSkinSectionCode(
			PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalFindingsOfSkinSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionCode"),
						 new Object [] { physicalFindingsOfSkinSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionCodeP(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionCodeP(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionCodeP(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionCodeP(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalFindingsOfSkinSectionCodeP(
			PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalFindingsOfSkinSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionCodeP"),
						 new Object [] { physicalFindingsOfSkinSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionTitle(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionTitle(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionTitle(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionTitle(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalFindingsOfSkinSectionTitle(
			PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalFindingsOfSkinSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionTitle"),
						 new Object [] { physicalFindingsOfSkinSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionText(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionText(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionText(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionText(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalFindingsOfSkinSectionText(
			PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalFindingsOfSkinSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionText"),
						 new Object [] { physicalFindingsOfSkinSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionEntry764(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Entry764</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionEntry764(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionEntry764(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Entry764</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionEntry764(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalFindingsOfSkinSectionEntry764(PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalFindingsOfSkinSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_ENTRY764,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionEntry764"),
						 new Object [] { physicalFindingsOfSkinSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Longitudinal Care Wound Observation Entry Wound Observation765</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Longitudinal Care Wound Observation Entry Wound Observation765</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765(PhysicalFindingsOfSkinSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalFindingsOfSkinSection The receiving '<em><b>Physical Findings Of Skin Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765(PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalFindingsOfSkinSection);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_FINDINGS_OF_SKIN_SECTION__PHYSICAL_FINDINGS_OF_SKIN_SECTION_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION765,
						 ConsolPlugin.INSTANCE.getString("PhysicalFindingsOfSkinSectionPhysicalFindingsOfSkinSectionLongitudinalCareWoundObservationEntryWoundObservation765"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PhysicalFindingsOfSkinSectionOperations
