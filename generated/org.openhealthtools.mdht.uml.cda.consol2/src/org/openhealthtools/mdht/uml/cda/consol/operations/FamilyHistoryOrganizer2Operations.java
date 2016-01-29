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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizer2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Family History Observation2 Entry Relationship Family History Observation21545</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizer2Operations extends FamilyHistoryOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizer2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer2 The receiving '<em><b>Family History Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2 familyHistoryOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_ORGANIZER2__FAMILY_HISTORY_ORGANIZER2_ID,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizer2FamilyHistoryOrganizer2Id"),
						 new Object [] { familyHistoryOrganizer2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Family History Observation2 Entry Relationship Family History Observation21545</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Family History Observation2 Entry Relationship Family History Observation21545</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer2 The receiving '<em><b>Family History Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateFamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545(FamilyHistoryOrganizer2 familyHistoryOrganizer2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_ORGANIZER2__FAMILY_HISTORY_ORGANIZER2_FAMILY_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_OBSERVATION21545,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizer2FamilyHistoryOrganizer2FamilyHistoryObservation2EntryRelationshipFamilyHistoryObservation21545"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.45' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer2 The receiving '<em><b>Family History Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer2 familyHistoryOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_ORGANIZER2__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizer2FamilyHistoryOrganizerTemplateId"),
						 new Object [] { familyHistoryOrganizer2 }));
			}
			 
			return false;
		}
		return true;
	}

} // FamilyHistoryOrganizer2Operations
