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

import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Anesthesia Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2Entry1052(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1052</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2Entry1054(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1054</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21053</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Medication Activity2 Entry Medication Activity21055</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnesthesiaSection2Operations extends AnesthesiaSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnesthesiaSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSection2Entry1052(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1052</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2Entry1052(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSection2Entry1052(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1052</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2Entry1052(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnesthesiaSection2Entry1052(AnesthesiaSection2 anesthesiaSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anesthesiaSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION2_ENTRY1052,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSection2Entry1052"),
						 new Object [] { anesthesiaSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSection2Entry1054(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1054</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2Entry1054(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSection2Entry1054(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1054</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2Entry1054(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnesthesiaSection2Entry1054(AnesthesiaSection2 anesthesiaSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anesthesiaSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION2_ENTRY1054,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSection2Entry1054"),
						 new Object [] { anesthesiaSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21053</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21053</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(AnesthesiaSection2 anesthesiaSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(anesthesiaSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Medication Activity2 Entry Medication Activity21055</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Medication Activity2 Entry Medication Activity21055</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(AnesthesiaSection2 anesthesiaSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(anesthesiaSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSection2MedicationActivity2EntryMedicationActivity21055"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSectionTemplateId(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSectionTemplateId(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.25' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSectionTemplateId(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSectionTemplateId(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnesthesiaSectionTemplateId(AnesthesiaSection2 anesthesiaSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anesthesiaSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSectionTemplateId"),
						 new Object [] { anesthesiaSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSectionCodeP(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSectionCodeP(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSectionCodeP(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSectionCodeP(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnesthesiaSectionCodeP(AnesthesiaSection2 anesthesiaSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anesthesiaSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSectionCodeP"),
						 new Object [] { anesthesiaSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSectionCodeP", passToken);
				}
				passToken.add(anesthesiaSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnesthesiaSectionCode(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSectionCode(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '59774-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnesthesiaSectionCode(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnesthesiaSectionCode(AnesthesiaSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param anesthesiaSection2 The receiving '<em><b>Anesthesia Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnesthesiaSectionCode(AnesthesiaSection2 anesthesiaSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(anesthesiaSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ANESTHESIA_SECTION2);
			try {
				VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anesthesiaSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ANESTHESIA_SECTION2__ANESTHESIA_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("AnesthesiaSection2AnesthesiaSectionCode"),
						 new Object [] { anesthesiaSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // AnesthesiaSection2Operations
