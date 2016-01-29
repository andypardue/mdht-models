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
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2Entry1100(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1100</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2Entry1102(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1102</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2Entry1104(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1104</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer Entry Medical Equipment Organizer1101</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Non Medicinal Supply Activity2 Entry Non Medicinal Supply Activity21103</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21105</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentSection2Operations extends MedicalEquipmentSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalEquipmentSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2Entry1100(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1100</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2Entry1100(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1100__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2Entry1100(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1100</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2Entry1100(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalEquipmentSection2Entry1100(MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1100__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_ENTRY1100,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2Entry1100"),
						 new Object [] { medicalEquipmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2Entry1102(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1102</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2Entry1102(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1102__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2Entry1102(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1102</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2Entry1102(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1102__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalEquipmentSection2Entry1102(MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1102__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1102__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1102__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1102__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_ENTRY1102,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2Entry1102"),
						 new Object [] { medicalEquipmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2Entry1104(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1104</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2Entry1104(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1104__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2Entry1104(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Entry1104</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2Entry1104(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1104__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalEquipmentSection2Entry1104(MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1104__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1104__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1104__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_ENTRY1104__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_ENTRY1104,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2Entry1104"),
						 new Object [] { medicalEquipmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer Entry Medical Equipment Organizer1101</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::MedicalEquipmentOrganizer)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer Entry Medical Equipment Organizer1101</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101(MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicalEquipmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER_ENTRY_MEDICAL_EQUIPMENT_ORGANIZER1101,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2MedicalEquipmentOrganizerEntryMedicalEquipmentOrganizer1101"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Non Medicinal Supply Activity2 Entry Non Medicinal Supply Activity21103</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Non Medicinal Supply Activity2 Entry Non Medicinal Supply Activity21103</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103(MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicalEquipmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21103,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21103"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21105</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21105</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105(MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicalEquipmentSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21105,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21105"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.23' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection2 medicalEquipmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSectionTemplateId"),
						 new Object [] { medicalEquipmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2 medicalEquipmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSectionCodeP"),
						 new Object [] { medicalEquipmentSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP", passToken);
				}
				passToken.add(medicalEquipmentSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '46264-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSectionCode(MedicalEquipmentSection2 medicalEquipmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicalEquipmentSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSectionCode"),
						 new Object [] { medicalEquipmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // MedicalEquipmentSection2Operations
