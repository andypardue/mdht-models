/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operative Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getOperativeNote2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId OperativeNote2Code OperativeNote2CodeP OperativeNote2DocumentationOf OperativeNote2Component1418 OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNote2DocumentationOfServiceEventProcedureCodes OperativeNote2DocumentationOfServiceEventEffectiveTime OperativeNote2DocumentationOfServiceEventCode OperativeNote2DocumentationOfServiceEventPerformer OperativeNote2DocumentationOfServiceEvent OperativeNote2AuthorizationConsentClassCode OperativeNote2AuthorizationConsentMoodCode OperativeNote2AuthorizationConsentStatusCode OperativeNote2AuthorizationTypeCode OperativeNote2AuthorizationConsent OperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421 OperativeNote2ComponentStructuredBodyComponentComplicationsSection21423 OperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425 OperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427 OperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429 OperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431 OperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433 OperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435 OperativeNote2ComponentStructuredBodyAnesthesiaSection21420 OperativeNote2ComponentStructuredBodyComplicationsSection21422 OperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424 OperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426 OperativeNote2ComponentStructuredBodyProcedureFindingsSection21428 OperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430 OperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432 OperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434 OperativeNote2ComponentStructuredBodyProcedureImplantsSection1436 OperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438 OperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440 OperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442 OperativeNote2ComponentStructuredBodyPlannedProcedureSection21444 OperativeNote2ComponentStructuredBodyProcedureDispositionSection1446 OperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448 OperativeNote2ComponentStructuredBodySurgicalDrainsSection1450 OperativeNote2ComponentStructuredBody1419' templateId.root='2.16.840.1.113883.10.20.22.1.7' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.OperativeNote2Code='OperativeNote2CodeP' constraints.validation.info='OperativeNote2Authorization OperativeNote2DocumentationOfServiceEventPerformerAssistants OperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437 OperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439 OperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441 OperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443 OperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445 OperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447 OperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449 OperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451' constraints.validation.query='OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNote2DocumentationOfServiceEventProcedureCodes OperativeNote2DocumentationOfServiceEventEffectiveTime OperativeNote2DocumentationOfServiceEventCode OperativeNote2DocumentationOfServiceEventPerformer OperativeNote2DocumentationOfServiceEventPerformerAssistants OperativeNote2DocumentationOfServiceEvent OperativeNote2AuthorizationConsentClassCode OperativeNote2AuthorizationConsentMoodCode OperativeNote2AuthorizationConsentStatusCode OperativeNote2AuthorizationTypeCode OperativeNote2AuthorizationConsent OperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421 OperativeNote2ComponentStructuredBodyComponentComplicationsSection21423 OperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425 OperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427 OperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429 OperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431 OperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433 OperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435 OperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437 OperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439 OperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441 OperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443 OperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445 OperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447 OperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449 OperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451 OperativeNote2ComponentStructuredBodyAnesthesiaSection21420 OperativeNote2ComponentStructuredBodyComplicationsSection21422 OperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424 OperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426 OperativeNote2ComponentStructuredBodyProcedureFindingsSection21428 OperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430 OperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432 OperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434 OperativeNote2ComponentStructuredBodyProcedureImplantsSection1436 OperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438 OperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440 OperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442 OperativeNote2ComponentStructuredBodyPlannedProcedureSection21444 OperativeNote2ComponentStructuredBodyProcedureDispositionSection1446 OperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448 OperativeNote2ComponentStructuredBodySurgicalDrainsSection1450 OperativeNote2ComponentStructuredBody1419'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOf constraints.validation.error='OperativeNote2DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEvent constraints.validation.error='OperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNote2DocumentationOfServiceEventProcedureCodes OperativeNote2DocumentationOfServiceEventEffectiveTime OperativeNote2DocumentationOfServiceEventCode OperativeNote2DocumentationOfServiceEventPerformer ServiceEventOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow' constraints.validation.info='OperativeNote2DocumentationOfServiceEventPerformerAssistants' constraints.validation.query='ServiceEventOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformer typeCode='PPRF' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.12.443' code.codeSystemName='Provider Role (HL7)' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDT constraints.validation.error='OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformerAssistants typeCode='SPRF' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity code.codeSystem='2.16.840.1.113883.12.443' code.codeSystemName='Provider Role (HL7)' constraints.validation.error='OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2Authorization typeCode='AUTH' constraints.validation.error='OperativeNote2AuthorizationTypeCode OperativeNote2AuthorizationConsent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2AuthorizationConsent classCode='CONS' constraints.validation.error='OperativeNote2AuthorizationConsentClassCode OperativeNote2AuthorizationConsentMoodCode OperativeNote2AuthorizationConsentStatusCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2Component constraints.validation.error='OperativeNote2ComponentStructuredBody1419 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435 ComponentOperativeNote2ComponentStructuredBodyAnesthesiaSection21420 ComponentOperativeNote2ComponentStructuredBodyComplicationsSection21422 ComponentOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424 ComponentOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426 ComponentOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428 ComponentOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430 ComponentOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432 ComponentOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434 ComponentOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436 ComponentOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438 ComponentOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440 ComponentOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442 ComponentOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444 ComponentOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446 ComponentOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448 ComponentOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450' constraints.validation.query='ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451 ComponentOperativeNote2ComponentStructuredBodyAnesthesiaSection21420 ComponentOperativeNote2ComponentStructuredBodyComplicationsSection21422 ComponentOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424 ComponentOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426 ComponentOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428 ComponentOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430 ComponentOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432 ComponentOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434 ComponentOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436 ComponentOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438 ComponentOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440 ComponentOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442 ComponentOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444 ComponentOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446 ComponentOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448 ComponentOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450' constraints.validation.info='ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449 ComponentStructuredBodyOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2ComponentStructuredBody constraints.validation.error='OperativeNote2ComponentStructuredBodyAnesthesiaSection21420 OperativeNote2ComponentStructuredBodyComplicationsSection21422 OperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424 OperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426 OperativeNote2ComponentStructuredBodyProcedureFindingsSection21428 OperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430 OperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432 OperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434 OperativeNote2ComponentStructuredBodyProcedureImplantsSection1436 OperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438 OperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440 OperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442 OperativeNote2ComponentStructuredBodyPlannedProcedureSection21444 OperativeNote2ComponentStructuredBodyProcedureDispositionSection1446 OperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448 OperativeNote2ComponentStructuredBodySurgicalDrainsSection1450 StructuredBodyOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421 StructuredBodyOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435' constraints.validation.query='StructuredBodyOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421 StructuredBodyOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437 StructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439 StructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449 StructuredBodyOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451' constraints.validation.info='StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437 StructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439 StructuredBodyOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443 StructuredBodyOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447 StructuredBodyOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449 StructuredBodyOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNote2ComponentStructuredBodyComponent constraints.validation.error='OperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435' constraints.validation.info='OperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451'"
 * @generated
 */
public interface OperativeNote2 extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateOperativeNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'11504-8\' or value.code = \'34137-0\' or value.code = \'28583-3\' or value.code = \'28624-5\' or value.code = \'28573-4\' or value.code = \'34877-1\' or value.code = \'34874-8\' or value.code = \'34870-6\' or value.code = \'34868-0\' or value.code = \'34818-5\'))'"
	 * @generated
	 */
	boolean validateOperativeNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization->one(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))'"
	 * @generated
	 */
	boolean validateOperativeNote2Authorization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))'"
	 * @generated
	 */
	boolean validateOperativeNote2Component1418(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.12.443\' and (value.code = \'CP\' or value.code = \'PP\' or value.code = \'RP\')))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.12.443\' and (value.code = \'CP\' or value.code = \'PP\' or value.code = \'RP\')))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::SPRF)'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(code.codeSystem = \'2.16.840.1.113883.6.104\' or code.codeSystem = \'2.16.840.1.113883.6.12\' or code.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateOperativeNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization->excluding(null).consent->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::ActClass::CONS)'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization->excluding(null).consent->excluding(null)->reject(isDefined(\'moodCode\') and moodCode=vocab::ActMood::EVN)'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization->excluding(null).consent->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipType::AUTH)'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization->excluding(null)->reject(consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))'"
	 * @generated
	 */
	boolean validateOperativeNote2AuthorizationConsent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))'"
	 * @generated
	 */
	boolean validateOperativeNote2ComponentStructuredBody1419(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNote2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperativeNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // OperativeNote2
