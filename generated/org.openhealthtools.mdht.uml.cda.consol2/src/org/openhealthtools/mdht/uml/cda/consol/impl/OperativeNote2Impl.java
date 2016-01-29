/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote2;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperativeNote2Impl extends USRealmHeader2Impl implements OperativeNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2Authorization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2Authorization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2Component1418(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2Component1418(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventProcedureCodes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2AuthorizationConsent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2AuthorizationConsent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNote2ComponentStructuredBody1419(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBody1419(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNote2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public OperativeNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // OperativeNote2Impl
