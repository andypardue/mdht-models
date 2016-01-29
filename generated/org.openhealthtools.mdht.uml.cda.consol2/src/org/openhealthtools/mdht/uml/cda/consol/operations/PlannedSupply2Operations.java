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
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Supply2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2MedInfoXorImmunXorProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Quantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Product(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductRecommended(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship990(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship990</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship992(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship992</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship994(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship994</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship996(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship996</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference Entry Relationship Priority Preference991</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Indication2EntryRelationshipIndication2993(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2 Entry Relationship Indication2993</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2 Entry Relationship Instruction2995</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage Entry Relationship Planned Coverage997</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedSupply2Operations extends PlanOfCareActivitySupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedSupply2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2)) xor (product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)) xor (participant.participantRole->select(oclIsTypeOf(consol::ProductInstance))->size() = 1 )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2MedInfoXorImmunXorProductInstance"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2StatusCode(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2StatusCode"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2StatusCodeP(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2StatusCodeP"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2EffectiveTime(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2EffectiveTime"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2RepeatNumber(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_REPEAT_NUMBER,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2RepeatNumber"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Quantity(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_QUANTITY,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Quantity"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(cda::Product))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Product(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Product"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Performer(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Performer"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2AuthorParticipation(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2AuthorParticipation"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2ProductInstance(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_INSTANCE,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductInstance"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2ProductRecommended(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_RECOMMENDED,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductRecommended"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2EntryRelationship990(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship990</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship990(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2EntryRelationship990(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship990</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship990(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedSupply2EntryRelationship990(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2EntryRelationship990"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2EntryRelationship992(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship992</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship992(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2EntryRelationship992(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship992</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship992(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedSupply2EntryRelationship992(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2EntryRelationship992"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2EntryRelationship994(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship994</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship994(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2EntryRelationship994(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship994</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship994(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedSupply2EntryRelationship994(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2EntryRelationship994"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2EntryRelationship996(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship996</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship996(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2EntryRelationship996(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship996</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EntryRelationship996(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedSupply2EntryRelationship996(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2EntryRelationship996"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->excluding(null).manufacturedProduct->excluding(null)->reject(oclIsTypeOf(consol::MedicationInformation2) xor oclIsTypeOf(consol::ImmunizationMedicationInformation2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(
			PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedSupply2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedSupply2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductManufacturedProduct"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference Entry Relationship Priority Preference991</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference Entry Relationship Priority Preference991</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedSupply2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Indication2EntryRelationshipIndication2993(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2 Entry Relationship Indication2993</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Indication2EntryRelationshipIndication2993(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Indication2EntryRelationshipIndication2993(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2 Entry Relationship Indication2993</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Indication2EntryRelationshipIndication2993(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedSupply2Indication2EntryRelationshipIndication2993(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedSupply2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Indication2EntryRelationshipIndication2993"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2 Entry Relationship Instruction2995</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2 Entry Relationship Instruction2995</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedSupply2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Instruction2EntryRelationshipInstruction2995"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage Entry Relationship Planned Coverage997</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedCoverage)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage Entry Relationship Planned Coverage997</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(plannedSupply2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyTemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyTemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.43' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyTemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyTemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivitySupplyTemplateId(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlanOfCareActivitySupplyTemplateId"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and "+
"let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in "+
"value = vocab::x_DocumentSubstanceMood::INT or value = vocab::x_DocumentSubstanceMood::PRMS or value = vocab::x_DocumentSubstanceMood::PRP or value = vocab::x_DocumentSubstanceMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_SUPPLY2__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedSupply2PlanOfCareActivitySupplyMoodCode"),
						 new Object [] { plannedSupply2 }));
			}
			 
			return false;
		}
		return true;
	}

} // PlannedSupply2Operations
