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

import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
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

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Authorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Component1418(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component1418</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Anesthesia Section21421</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Complications Section21423</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Preoperative Diagnosis Section21425</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1427</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Findings Section21429</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Specimens Taken Section1431</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Description Section1433</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Postoperative Diagnosis Section1435</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Implants Section1437</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Fluid Section1439</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Surgical Procedure Section1441</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Plan Of Treatment Section21443</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Planned Procedure Section21445</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Disposition Section1447</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Indications Section21449</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Surgical Drains Section1451</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Anesthesia Section21420</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Complications Section21422</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Preoperative Diagnosis Section21424</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Estimated Blood Loss Section1426</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Findings Section21428</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Specimens Taken Section1430</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Description Section1432</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Postoperative Diagnosis Section1434</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Implants Section1436</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Fluid Section1438</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Surgical Procedure Section1440</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Plan Of Treatment Section21442</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Planned Procedure Section21444</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Disposition Section1446</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Indications Section21448</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Surgical Drains Section1450</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBody1419(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body1419</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNote2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNote2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2CodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2CodeP(OperativeNote2 operativeNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_CODE_P,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2CodeP"),
						 new Object [] { operativeNote2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP", passToken);
				}
				passToken.add(operativeNote2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11504-8' or value.code = '34137-0' or value.code = '28583-3' or value.code = '28624-5' or value.code = '28573-4' or value.code = '34877-1' or value.code = '34874-8' or value.code = '34870-6' or value.code = '34868-0' or value.code = '34818-5'))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Code(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2Code(OperativeNote2 operativeNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(operativeNote2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2Code"),
						 new Object [] { operativeNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOf(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2DocumentationOf(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOf"),
						 new Object [] { operativeNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->one(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Authorization(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNote2Authorization(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2Authorization"),
						 new Object [] { operativeNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2Component1418(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component1418</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Component1418(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2Component1418(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component1418</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2Component1418(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOperativeNote2Component1418(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT1418,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2Component1418"),
						 new Object [] { operativeNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.12.443' and (value.code = 'CP' or value.code = 'PP' or value.code = 'RP')))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.12.443' and (value.code = 'CP' or value.code = 'PP' or value.code = 'RP')))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::SPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventProcedureCodes(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventProcedureCodes(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventProcedureCodes"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTime(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformer(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformer"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(
			OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEventPerformerAssistants"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2DocumentationOfServiceEvent(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2DocumentationOfServiceEvent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClass::CONS)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsentClassCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2AuthorizationConsentClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsentMoodCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2AuthorizationConsentMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsentStatusCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2AuthorizationConsentStatusCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::AUTH)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationTypeCode(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationTypeCode(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2AuthorizationTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2AuthorizationConsent(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNote2AuthorizationConsent(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_AUTHORIZATION_CONSENT,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2AuthorizationConsent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Anesthesia Section21421</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Anesthesia Section21421</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Complications Section21423</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Complications Section21423</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentComplicationsSection21423"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Preoperative Diagnosis Section21425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Preoperative Diagnosis Section21425</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1427</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Findings Section21429</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Findings Section21429</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Specimens Taken Section1431</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Specimens Taken Section1431</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Description Section1433</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Description Section1433</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Postoperative Diagnosis Section1435</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Postoperative Diagnosis Section1435</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Implants Section1437</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Implants Section1437</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Fluid Section1439</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Fluid Section1439</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Surgical Procedure Section1441</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Surgical Procedure Section1441</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Plan Of Treatment Section21443</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Plan Of Treatment Section21443</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Planned Procedure Section21445</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Planned Procedure Section21445</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Disposition Section1447</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Disposition Section1447</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Indications Section21449</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Indications Section21449</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Surgical Drains Section1451</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Surgical Drains Section1451</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Anesthesia Section21420</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Anesthesia Section21420</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyAnesthesiaSection21420"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Complications Section21422</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Complications Section21422</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyComplicationsSection21422"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Preoperative Diagnosis Section21424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Preoperative Diagnosis Section21424</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Estimated Blood Loss Section1426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Estimated Blood Loss Section1426</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Findings Section21428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Findings Section21428</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureFindingsSection21428"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Specimens Taken Section1430</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Specimens Taken Section1430</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Description Section1432</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Description Section1432</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Postoperative Diagnosis Section1434</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Postoperative Diagnosis Section1434</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Implants Section1436</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Implants Section1436</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureImplantsSection1436"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Fluid Section1438</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Fluid Section1438</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Surgical Procedure Section1440</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Surgical Procedure Section1440</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Plan Of Treatment Section21442</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Plan Of Treatment Section21442</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Planned Procedure Section21444</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Planned Procedure Section21444</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyPlannedProcedureSection21444"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Disposition Section1446</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Disposition Section1446</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureDispositionSection1446"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Indications Section21448</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Indications Section21448</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Surgical Drains Section1450</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Surgical Drains Section1450</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBodySurgicalDrainsSection1450"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNote2ComponentStructuredBody1419(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body1419</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBody1419(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNote2ComponentStructuredBody1419(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body1419</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNote2ComponentStructuredBody1419(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNote2ComponentStructuredBody1419(OperativeNote2 operativeNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2OperativeNote2ComponentStructuredBody1419"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.7' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(OperativeNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote2 The receiving '<em><b>Operative Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(OperativeNote2 operativeNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("OperativeNote2GeneralHeaderConstraintsTemplateId"),
						 new Object [] { operativeNote2 }));
			}
			 
			return false;
		}
		return true;
	}

} // OperativeNote2Operations
