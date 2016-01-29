/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
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

import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocument2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuity Of Care Document2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContinuityOfCareDocument2Impl extends USRealmHeader2Impl implements ContinuityOfCareDocument2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocument2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2Author(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Author(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2Component1266(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Component1266(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2AuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument2ComponentStructuredBody1267(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBody1267(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityOfCareDocument2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ContinuityOfCareDocument2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ContinuityOfCareDocument2Impl
