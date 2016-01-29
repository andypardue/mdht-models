/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProgressNote2Impl extends USRealmHeader2Impl implements ProgressNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2Component1510(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2Component1510(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyAssessmentSection1512(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyAssessmentSection1512(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyInterventionsSection21522(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyInterventionsSection21522(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyInstructionsSection21524(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyInstructionsSection21524(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyObjectiveSection1528(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyObjectiveSection1528(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodySubjectiveSection1538(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodySubjectiveSection1538(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBodyNutritionSection1542(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyNutritionSection1542(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentStructuredBody1511(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentStructuredBody1511(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressNote2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProgressNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProgressNote2Impl
