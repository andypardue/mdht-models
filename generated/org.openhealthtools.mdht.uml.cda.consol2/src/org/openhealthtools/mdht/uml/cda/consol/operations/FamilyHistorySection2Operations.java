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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySection2Entry1546(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Entry1546</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Family History Organizer2 Entry Family History Organizer21547</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySection2Operations extends FamilyHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistorySection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySection2Entry1546(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Entry1546</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySection2Entry1546(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySection2Entry1546(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Entry1546</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySection2Entry1546(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySection2 The receiving '<em><b>Family History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFamilyHistorySection2Entry1546(FamilyHistorySection2 familyHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SECTION2);
			try {
				VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_SECTION2__FAMILY_HISTORY_SECTION2_ENTRY1546,
						 ConsolPlugin.INSTANCE.getString("FamilyHistorySection2FamilyHistorySection2Entry1546"),
						 new Object [] { familyHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Family History Organizer2 Entry Family History Organizer21547</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Family History Organizer2 Entry Family History Organizer21547</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySection2 The receiving '<em><b>Family History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(FamilyHistorySection2 familyHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistorySection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_SECTION2__FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547,
						 ConsolPlugin.INSTANCE.getString("FamilyHistorySection2FamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySectionTemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionTemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.15' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySectionTemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionTemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySection2 The receiving '<em><b>Family History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySectionTemplateId(FamilyHistorySection2 familyHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SECTION2);
			try {
				VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_SECTION2__FAMILY_HISTORY_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("FamilyHistorySection2FamilyHistorySectionTemplateId"),
						 new Object [] { familyHistorySection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // FamilyHistorySection2Operations
