/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Author(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Component1266(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component1266</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Allergies Section21269</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medications Section21271</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Problem Section21273</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Procedures Section21275</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Results Section21277</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Advance Directives Section Entries Optional21279</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Encounters Section Entries Optional21281</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Family History Section21283</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Functional Status Section21285</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Immunizations Section21287</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medical Equipment Section21289</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Payers Section21291</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Plan Of Treatment Section21293</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Social History Section21295</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Vital Signs Section21297</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Mental Status Section1299</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Nutrition Section1301</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Allergies Section21268</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medications Section21270</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Problem Section21272</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Procedures Section21274</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Results Section21276</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Advance Directives Section Entries Optional21278</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Encounters Section Entries Optional21280</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Family History Section21282</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Functional Status Section21284</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Immunizations Section21286</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medical Equipment Section21288</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Payers Section21290</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Plan Of Treatment Section21292</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Social History Section21294</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Vital Signs Section21296</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Mental Status Section1298</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Nutrition Section1300</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBody1267(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body1267</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocument2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocument2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2CodeP"),
						 new Object [] { continuityOfCareDocument2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP", passToken);
				}
				passToken.add(continuityOfCareDocument2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(continuityOfCareDocument2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_CODE,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2Code"),
						 new Object [] { continuityOfCareDocument2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2Author"),
						 new Object [] { continuityOfCareDocument2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2DocumentationOf(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOf"),
						 new Object [] { continuityOfCareDocument2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2Component1266(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component1266</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Component1266(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2Component1266(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component1266</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Component1266(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateContinuityOfCareDocument2Component1266(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2Component1266"),
						 new Object [] { continuityOfCareDocument2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((not assignedPerson.oclIsUndefined()) or (not representedOrganization.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((not representedOrganization.oclIsUndefined() and assignedPerson.oclIsUndefined() and assignedAuthoringDevice.oclIsUndefined()) implies id->exists(id | not id.isNullFlavorUndefined() and id.nullFlavor = vocab::NullFlavor::NA))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2AuthorAssignedAuthor(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthor"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((not assignedPerson.oclIsUndefined() and not id->isEmpty()) implies id->exists(id | (id.isNullFlavorDefined() and id.extension->isEmpty() and id.root->isEmpty()) or (id.isNullFlavorDefined() and id.root='2.16.840.1.113883.4.6') or (id.root='2.16.840.1.113883.4.6' and id.extension->size() = 1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformer"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEvent(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEvent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Allergies Section21269</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Allergies Section21269</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medications Section21271</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medications Section21271</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Problem Section21273</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Problem Section21273</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Procedures Section21275</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Procedures Section21275</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Results Section21277</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Results Section21277</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Advance Directives Section Entries Optional21279</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Advance Directives Section Entries Optional21279</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Encounters Section Entries Optional21281</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Encounters Section Entries Optional21281</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Family History Section21283</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Family History Section21283</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Functional Status Section21285</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Functional Status Section21285</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Immunizations Section21287</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Immunizations Section21287</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medical Equipment Section21289</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medical Equipment Section21289</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Payers Section21291</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Payers Section21291</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Plan Of Treatment Section21293</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Plan Of Treatment Section21293</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Social History Section21295</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Social History Section21295</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Vital Signs Section21297</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Vital Signs Section21297</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Mental Status Section1299</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Mental Status Section1299</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Nutrition Section1301</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Nutrition Section1301</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Allergies Section21268</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Allergies Section21268</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medications Section21270</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medications Section21270</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Problem Section21272</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Problem Section21272</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Procedures Section21274</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Procedures Section21274</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Results Section21276</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Results Section21276</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Advance Directives Section Entries Optional21278</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Advance Directives Section Entries Optional21278</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Encounters Section Entries Optional21280</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Encounters Section Entries Optional21280</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Family History Section21282</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Family History Section21282</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Functional Status Section21284</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Functional Status Section21284</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Immunizations Section21286</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Immunizations Section21286</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medical Equipment Section21288</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medical Equipment Section21288</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Payers Section21290</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Payers Section21290</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Plan Of Treatment Section21292</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Plan Of Treatment Section21292</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Social History Section21294</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Social History Section21294</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Vital Signs Section21296</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Vital Signs Section21296</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Mental Status Section1298</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Mental Status Section1298</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Nutrition Section1300</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Nutrition Section1300</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBody1267(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body1267</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBody1267(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ComponentStructuredBody1267(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body1267</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ComponentStructuredBody1267(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateContinuityOfCareDocument2ComponentStructuredBody1267(ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2ComponentStructuredBody1267"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.2' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2GeneralHeaderConstraintsTemplateId"),
						 new Object [] { continuityOfCareDocument2 }));
			}
			 
			return false;
		}
		return true;
	}

} // ContinuityOfCareDocument2Operations
