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
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Component(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1110(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1110</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1112(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1112</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1114(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1114</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1116(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1116</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Longitudinal Care Wound Observation Entry Wound Observation1111</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Pressure Ulcer Observation Entry Pressure Ulcer Observation1113</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation1115</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage1117</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExamSection2Operations extends PhysicalExamSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2Component(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Component(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies component->exists(component : cda::Component5 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component5))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2Component(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Component(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSection2Component(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_COMPONENT,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2Component"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2Entry1110(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1110(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2Entry1110(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1110</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1110(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExamSection2Entry1110(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_ENTRY1110,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2Entry1110"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2Entry1112(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1112</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1112(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2Entry1112(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1112</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1112(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExamSection2Entry1112(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_ENTRY1112,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2Entry1112"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2Entry1114(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1114</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1114(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2Entry1114(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1114</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1114(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExamSection2Entry1114(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_ENTRY1114,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2Entry1114"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2Entry1116(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1116</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1116(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2Entry1116(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1116</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2Entry1116(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExamSection2Entry1116(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_ENTRY1116,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2Entry1116"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2ComponentSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2ComponentSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicalExamSection2ComponentSectionCode(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2ComponentSectionCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2ComponentSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2ComponentSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicalExamSection2ComponentSectionCodeP(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2ComponentSectionCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2ComponentSectionTitle(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionTitle(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).section->excluding(null)->reject((title.oclIsUndefined() or title.isNullFlavorUndefined()) implies (not title.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2ComponentSectionTitle(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionTitle(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicalExamSection2ComponentSectionTitle(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2ComponentSectionTitle"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2ComponentSectionText(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionText(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).section->excluding(null)->reject(not text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2ComponentSectionText(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSectionText(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicalExamSection2ComponentSectionText(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2ComponentSectionText"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2ComponentSection(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSection(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cda::Section)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2ComponentSection(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2ComponentSection(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicalExamSection2ComponentSection(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2ComponentSection"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Longitudinal Care Wound Observation Entry Wound Observation1111</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Longitudinal Care Wound Observation Entry Wound Observation1111</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Pressure Ulcer Observation Entry Pressure Ulcer Observation1113</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Pressure Ulcer Observation Entry Pressure Ulcer Observation1113</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation1115</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation1115</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage1117</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage1117</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(physicalExamSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.10' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionTemplateId(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSectionTemplateId"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionCodeP(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSectionCodeP"),
						 new Object [] { physicalExamSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP", passToken);
				}
				passToken.add(physicalExamSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '29545-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionCode(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(physicalExamSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("PhysicalExamSection2PhysicalExamSectionCode"),
						 new Object [] { physicalExamSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // PhysicalExamSection2Operations
