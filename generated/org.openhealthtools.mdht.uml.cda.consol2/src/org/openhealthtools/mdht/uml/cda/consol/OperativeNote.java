/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operative Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getOperativeNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP OperativeNoteDocumentationOf OperativeNoteComponent396 OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP OperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity OperativeNoteDocumentationOfServiceEventProcedureCodes OperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow OperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNoteDocumentationOfServiceEventPreciseToTheDay OperativeNoteDocumentationOfServiceEventCode OperativeNoteDocumentationOfServiceEventEffectiveTime OperativeNoteDocumentationOfServiceEventPrimaryPerformer OperativeNoteDocumentationOfServiceEvent OperativeNoteComponentStructuredBodyComponentAnesthesiaSection399 OperativeNoteComponentStructuredBodyComponentComplicationsSection401 OperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403 OperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405 OperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407 OperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409 OperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411 OperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413 OperativeNoteComponentStructuredBodyAnesthesiaSection398 OperativeNoteComponentStructuredBodyComplicationsSection400 OperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402 OperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404 OperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406 OperativeNoteComponentStructuredBodyProcedureFindingsSection408 OperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410 OperativeNoteComponentStructuredBodyProcedureDescriptionSection412 OperativeNoteComponentStructuredBodyProcedureImplantsSection414 OperativeNoteComponentStructuredBodyOperativeNoteFluidSection416 OperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418 OperativeNoteComponentStructuredBodyPlanOfCareSection420 OperativeNoteComponentStructuredBodyPlannedProcedureSection422 OperativeNoteComponentStructuredBodyProcedureDispositionSection424 OperativeNoteComponentStructuredBodyProcedureIndicationsSection426 OperativeNoteComponentStructuredBodySurgicalDrainsSection428 OperativeNoteComponentStructuredBody397' templateId.root='2.16.840.1.113883.10.20.22.1.7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.query='OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP OperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity OperativeNoteDocumentationOfServiceEventProcedureCodes OperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow OperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNoteDocumentationOfServiceEventPreciseToTheDay OperativeNoteDocumentationOfServiceEventPreciseToTheMinute OperativeNoteDocumentationOfServiceEventPreciseToTheSecond OperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset OperativeNoteDocumentationOfServiceEventCode OperativeNoteDocumentationOfServiceEventEffectiveTime OperativeNoteDocumentationOfServiceEventPrimaryPerformer OperativeNoteDocumentationOfServiceEvent OperativeNoteComponentStructuredBodyComponentAnesthesiaSection399 OperativeNoteComponentStructuredBodyComponentComplicationsSection401 OperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403 OperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405 OperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407 OperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409 OperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411 OperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413 OperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415 OperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417 OperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419 OperativeNoteComponentStructuredBodyComponentPlanOfCareSection421 OperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423 OperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425 OperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427 OperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429 OperativeNoteComponentStructuredBodyAnesthesiaSection398 OperativeNoteComponentStructuredBodyComplicationsSection400 OperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402 OperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404 OperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406 OperativeNoteComponentStructuredBodyProcedureFindingsSection408 OperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410 OperativeNoteComponentStructuredBodyProcedureDescriptionSection412 OperativeNoteComponentStructuredBodyProcedureImplantsSection414 OperativeNoteComponentStructuredBodyOperativeNoteFluidSection416 OperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418 OperativeNoteComponentStructuredBodyPlanOfCareSection420 OperativeNoteComponentStructuredBodyPlannedProcedureSection422 OperativeNoteComponentStructuredBodyProcedureDispositionSection424 OperativeNoteComponentStructuredBodyProcedureIndicationsSection426 OperativeNoteComponentStructuredBodySurgicalDrainsSection428 OperativeNoteComponentStructuredBody397' constraints.validation.warning='OperativeNoteDocumentationOfServiceEventPreciseToTheMinute OperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='OperativeNoteDocumentationOfServiceEventPreciseToTheSecond OperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415 OperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417 OperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419 OperativeNoteComponentStructuredBodyComponentPlanOfCareSection421 OperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423 OperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425 OperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427 OperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteDocumentationOf constraints.validation.error='OperativeNoteDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteDocumentationOfServiceEvent constraints.validation.error='OperativeNoteDocumentationOfServiceEventProcedureCodes OperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow OperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth OperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth OperativeNoteDocumentationOfServiceEventPreciseToTheDay OperativeNoteDocumentationOfServiceEventCode OperativeNoteDocumentationOfServiceEventEffectiveTime OperativeNoteDocumentationOfServiceEventPrimaryPerformer OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP OperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode ServiceEventOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity' constraints.validation.warning='OperativeNoteDocumentationOfServiceEventPreciseToTheMinute OperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='OperativeNoteDocumentationOfServiceEventPreciseToTheSecond' constraints.validation.query='OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP OperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode ServiceEventOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteDocumentationOfServiceEventPrimaryPerformer typeCode='PPRF' constraints.validation.error='OperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode OperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteComponent constraints.validation.error='OperativeNoteComponentStructuredBody397 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentComplicationsSection401 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413 ComponentOperativeNoteComponentStructuredBodyAnesthesiaSection398 ComponentOperativeNoteComponentStructuredBodyComplicationsSection400 ComponentOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402 ComponentOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404 ComponentOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406 ComponentOperativeNoteComponentStructuredBodyProcedureFindingsSection408 ComponentOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410 ComponentOperativeNoteComponentStructuredBodyProcedureDescriptionSection412 ComponentOperativeNoteComponentStructuredBodyProcedureImplantsSection414 ComponentOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416 ComponentOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418 ComponentOperativeNoteComponentStructuredBodyPlanOfCareSection420 ComponentOperativeNoteComponentStructuredBodyPlannedProcedureSection422 ComponentOperativeNoteComponentStructuredBodyProcedureDispositionSection424 ComponentOperativeNoteComponentStructuredBodyProcedureIndicationsSection426 ComponentOperativeNoteComponentStructuredBodySurgicalDrainsSection428' constraints.validation.query='ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentComplicationsSection401 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429 ComponentOperativeNoteComponentStructuredBodyAnesthesiaSection398 ComponentOperativeNoteComponentStructuredBodyComplicationsSection400 ComponentOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402 ComponentOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404 ComponentOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406 ComponentOperativeNoteComponentStructuredBodyProcedureFindingsSection408 ComponentOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410 ComponentOperativeNoteComponentStructuredBodyProcedureDescriptionSection412 ComponentOperativeNoteComponentStructuredBodyProcedureImplantsSection414 ComponentOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416 ComponentOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418 ComponentOperativeNoteComponentStructuredBodyPlanOfCareSection420 ComponentOperativeNoteComponentStructuredBodyPlannedProcedureSection422 ComponentOperativeNoteComponentStructuredBodyProcedureDispositionSection424 ComponentOperativeNoteComponentStructuredBodyProcedureIndicationsSection426 ComponentOperativeNoteComponentStructuredBodySurgicalDrainsSection428' constraints.validation.info='ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427 ComponentStructuredBodyOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteComponentStructuredBody constraints.validation.error='OperativeNoteComponentStructuredBodyAnesthesiaSection398 OperativeNoteComponentStructuredBodyComplicationsSection400 OperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402 OperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404 OperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406 OperativeNoteComponentStructuredBodyProcedureFindingsSection408 OperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410 OperativeNoteComponentStructuredBodyProcedureDescriptionSection412 OperativeNoteComponentStructuredBodyProcedureImplantsSection414 OperativeNoteComponentStructuredBodyOperativeNoteFluidSection416 OperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418 OperativeNoteComponentStructuredBodyPlanOfCareSection420 OperativeNoteComponentStructuredBodyPlannedProcedureSection422 OperativeNoteComponentStructuredBodyProcedureDispositionSection424 OperativeNoteComponentStructuredBodyProcedureIndicationsSection426 OperativeNoteComponentStructuredBodySurgicalDrainsSection428 StructuredBodyOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399 StructuredBodyOperativeNoteComponentStructuredBodyComponentComplicationsSection401 StructuredBodyOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403 StructuredBodyOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413' constraints.validation.query='StructuredBodyOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399 StructuredBodyOperativeNoteComponentStructuredBodyComponentComplicationsSection401 StructuredBodyOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403 StructuredBodyOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415 StructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417 StructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419 StructuredBodyOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421 StructuredBodyOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427 StructuredBodyOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429' constraints.validation.info='StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415 StructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417 StructuredBodyOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419 StructuredBodyOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421 StructuredBodyOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425 StructuredBodyOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427 StructuredBodyOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolOperativeNoteComponentStructuredBodyComponent constraints.validation.error='OperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413' constraints.validation.info='OperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429'"
 * @generated
 */
public interface OperativeNote extends GeneralHeaderConstraints {
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
	boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponent396(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(DiagnosticChain diagnostics,
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
	boolean validateOperativeNoteDocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.low.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
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
	boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 8))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 12))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 14))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() > 8 implies effectiveTime.low.value.size() >= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() > 8 implies effectiveTime.high.value.size() >= 15))'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
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
	boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->size() = 1)'"
	 * @generated
	 */
	boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(DiagnosticChain diagnostics,
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
	boolean validateOperativeNoteDocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection)))'"
	 * @generated
	 */
	boolean validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyComplicationsSection400(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateOperativeNoteComponentStructuredBody397(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote init();

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public OperativeNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // OperativeNote
