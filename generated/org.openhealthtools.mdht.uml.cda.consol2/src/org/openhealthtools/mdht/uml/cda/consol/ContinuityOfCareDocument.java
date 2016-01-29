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
 * A representation of the model object '<em><b>Continuity Of Care Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This section, Continuity of Care Document (CCD) Release 1.1, describes CDA constraints  in accordance with Stage 1 Meaningful Use. The CCD requirements in this guide supersede CCD Release 1; in the near future, this guide could supersede HITSP C32 .
 * 
 * The CCD is a core data set of the most relevant administrative, demographic, and clinical information facts about a patient's healthcare, covering one or more healthcare encounters. It provides a means for one healthcare practitioner, system, or setting to aggregate all of the pertinent data about a patient and forward it to another practitioner, system, or setting to support the continuity of care. The primary use case for the CCD is to provide a snapshot in time containing the pertinent clinical, demographic, and administrative data for a specific patient . More specific use cases, such as a Discharge Summary or Progress Note, are available as alternative documents in this guide.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getContinuityOfCareDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ContinuityOfCareDocumentCode ContinuityOfCareDocumentCodeP ContinuityOfCareDocumentLanguageCode ContinuityOfCareDocumentDocumentationOf ContinuityOfCareDocumentAuthor ContinuityOfCareDocumentComponent26 ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId ContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode ContinuityOfCareDocumentDocumentationOfServiceEventClassCode ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime ContinuityOfCareDocumentDocumentationOfServiceEvent ContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization ContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization ContinuityOfCareDocumentAuthorAssignedAuthor ContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29 ContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31 ContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33 ContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35 ContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37 ContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28 ContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30 ContinuityOfCareDocumentComponentStructuredBodyProblemSection32 ContinuityOfCareDocumentComponentStructuredBodyProceduresSection34 ContinuityOfCareDocumentComponentStructuredBodyResultsSection36 ContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38 ContinuityOfCareDocumentComponentStructuredBodyEncountersSection40 ContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42 ContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44 ContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46 ContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48 ContinuityOfCareDocumentComponentStructuredBodyPayersSection50 ContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52 ContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54 ContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56 ContinuityOfCareDocumentComponentStructuredBody27' templateId.root='2.16.840.1.113883.10.20.22.1.2' code.code='34133-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Summarization of Episode Note' constraints.validation.dependOn.ContinuityOfCareDocumentCode='ContinuityOfCareDocumentCodeP' constraints.validation.query='ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId ContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity ContinuityOfCareDocumentDocumentationOfServiceEventClassCode ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime ContinuityOfCareDocumentDocumentationOfServiceEventPerformer ContinuityOfCareDocumentDocumentationOfServiceEvent ContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization ContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization ContinuityOfCareDocumentAuthorAssignedAuthor ContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29 ContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31 ContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33 ContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35 ContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37 ContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39 ContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41 ContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43 ContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45 ContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47 ContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49 ContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51 ContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53 ContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55 ContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57 ContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28 ContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30 ContinuityOfCareDocumentComponentStructuredBodyProblemSection32 ContinuityOfCareDocumentComponentStructuredBodyProceduresSection34 ContinuityOfCareDocumentComponentStructuredBodyResultsSection36 ContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38 ContinuityOfCareDocumentComponentStructuredBodyEncountersSection40 ContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42 ContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44 ContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46 ContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48 ContinuityOfCareDocumentComponentStructuredBodyPayersSection50 ContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52 ContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54 ContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56 ContinuityOfCareDocumentComponentStructuredBody27' constraints.validation.warning='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier ContinuityOfCareDocumentDocumentationOfServiceEventPerformer' constraints.validation.info='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity ContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39 ContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41 ContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43 ContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45 ContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47 ContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49 ContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51 ContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53 ContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55 ContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentDocumentationOf constraints.validation.error='ContinuityOfCareDocumentDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentDocumentationOfServiceEvent classCode='PCPR' constraints.validation.error='ContinuityOfCareDocumentDocumentationOfServiceEventClassCode ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow' constraints.validation.warning='ContinuityOfCareDocumentDocumentationOfServiceEventPerformer' constraints.validation.query='ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentDocumentationOfServiceEventPerformer typeCode='PRF' constraints.validation.error='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode' constraints.validation.info='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity constraints.validation.warning='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier' constraints.validation.info='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode' constraints.validation.error='ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime constraints.validation.error='ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh ContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentAuthor constraints.validation.error='ContinuityOfCareDocumentAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentAuthorAssignedAuthor constraints.validation.error='ContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization ContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentComponent constraints.validation.error='ContinuityOfCareDocumentComponentStructuredBody27 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37 ComponentContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28 ComponentContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30 ComponentContinuityOfCareDocumentComponentStructuredBodyProblemSection32 ComponentContinuityOfCareDocumentComponentStructuredBodyProceduresSection34 ComponentContinuityOfCareDocumentComponentStructuredBodyResultsSection36 ComponentContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38 ComponentContinuityOfCareDocumentComponentStructuredBodyEncountersSection40 ComponentContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42 ComponentContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44 ComponentContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46 ComponentContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48 ComponentContinuityOfCareDocumentComponentStructuredBodyPayersSection50 ComponentContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52 ComponentContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54 ComponentContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56' constraints.validation.query='ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57 ComponentContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28 ComponentContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30 ComponentContinuityOfCareDocumentComponentStructuredBodyProblemSection32 ComponentContinuityOfCareDocumentComponentStructuredBodyProceduresSection34 ComponentContinuityOfCareDocumentComponentStructuredBodyResultsSection36 ComponentContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38 ComponentContinuityOfCareDocumentComponentStructuredBodyEncountersSection40 ComponentContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42 ComponentContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44 ComponentContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46 ComponentContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48 ComponentContinuityOfCareDocumentComponentStructuredBodyPayersSection50 ComponentContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52 ComponentContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54 ComponentContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56' constraints.validation.info='ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55 ComponentStructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentComponentStructuredBody constraints.validation.error='ContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28 ContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30 ContinuityOfCareDocumentComponentStructuredBodyProblemSection32 ContinuityOfCareDocumentComponentStructuredBodyProceduresSection34 ContinuityOfCareDocumentComponentStructuredBodyResultsSection36 ContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38 ContinuityOfCareDocumentComponentStructuredBodyEncountersSection40 ContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42 ContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44 ContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46 ContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48 ContinuityOfCareDocumentComponentStructuredBodyPayersSection50 ContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52 ContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54 ContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37' constraints.validation.query='StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57' constraints.validation.info='StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55 StructuredBodyContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocumentComponentStructuredBodyComponent constraints.validation.error='ContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37' constraints.validation.info='ContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57'"
 * @generated
 */
public interface ContinuityOfCareDocument extends GeneralHeaderConstraints {
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
	boolean validateContinuityOfCareDocumentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'34133-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponent26(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(id->exists(root=\'2.16.840.1.113883.4.6\'))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::ActClassRoot::PCPR)'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((not assignedPerson.oclIsUndefined()) or (not representedOrganization.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((not representedOrganization.oclIsUndefined() and assignedPerson.oclIsUndefined() and assignedAuthoringDevice.oclIsUndefined()) implies id->exists(id | not id.isNullFlavorUndefined() and id.nullFlavor = vocab::NullFlavor::NA))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyProblemSection32(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyResultsSection36(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyPayersSection50(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocumentComponentStructuredBody27(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityOfCareDocument init();

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ContinuityOfCareDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ContinuityOfCareDocument
