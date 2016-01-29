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
 * A representation of the model object '<em><b>Continuity Of Care Document2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getContinuityOfCareDocument2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ContinuityOfCareDocument2Code ContinuityOfCareDocument2CodeP ContinuityOfCareDocument2Author ContinuityOfCareDocument2DocumentationOf ContinuityOfCareDocument2Component1266 ContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization ContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization ContinuityOfCareDocument2AuthorAssignedAuthor ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId ContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode ContinuityOfCareDocument2DocumentationOfServiceEventClassCode ContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime ContinuityOfCareDocument2DocumentationOfServiceEvent ContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269 ContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271 ContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273 ContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277 ContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295 ContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297 ContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268 ContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270 ContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272 ContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274 ContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276 ContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278 ContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280 ContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282 ContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284 ContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286 ContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288 ContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290 ContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292 ContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294 ContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296 ContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298 ContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300 ContinuityOfCareDocument2ComponentStructuredBody1267' templateId.root='2.16.840.1.113883.10.20.22.1.2' templateId.extension='2015-08-01' code.code='34133-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Summarization of Episode Note' constraints.validation.dependOn.ContinuityOfCareDocument2Code='ContinuityOfCareDocument2CodeP' constraints.validation.query='ContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization ContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization ContinuityOfCareDocument2AuthorAssignedAuthor ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson ContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity ContinuityOfCareDocument2DocumentationOfServiceEventClassCode ContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime ContinuityOfCareDocument2DocumentationOfServiceEventPerformer ContinuityOfCareDocument2DocumentationOfServiceEvent ContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269 ContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271 ContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273 ContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275 ContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277 ContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279 ContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281 ContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283 ContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285 ContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287 ContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289 ContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291 ContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293 ContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295 ContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297 ContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299 ContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301 ContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268 ContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270 ContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272 ContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274 ContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276 ContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278 ContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280 ContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282 ContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284 ContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286 ContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288 ContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290 ContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292 ContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294 ContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296 ContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298 ContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300 ContinuityOfCareDocument2ComponentStructuredBody1267' constraints.validation.warning='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier ContinuityOfCareDocument2DocumentationOfServiceEventPerformer ContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275 ContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293' constraints.validation.info='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity ContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279 ContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281 ContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283 ContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285 ContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287 ContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289 ContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291 ContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299 ContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2Author constraints.validation.error='ContinuityOfCareDocument2AuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2AuthorAssignedAuthor constraints.validation.error='ContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization ContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2DocumentationOf constraints.validation.error='ContinuityOfCareDocument2DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2DocumentationOfServiceEvent classCode='PCPR' constraints.validation.error='ContinuityOfCareDocument2DocumentationOfServiceEventClassCode ContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh' constraints.validation.warning='ContinuityOfCareDocument2DocumentationOfServiceEventPerformer' constraints.validation.query='ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2DocumentationOfServiceEventIVLTS constraints.validation.error='ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2DocumentationOfServiceEventPerformer typeCode='PRF' constraints.validation.error='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode' constraints.validation.info='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity constraints.validation.warning='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier' constraints.validation.error='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId' constraints.validation.info='ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2Component constraints.validation.error='ContinuityOfCareDocument2ComponentStructuredBody1267 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297 ComponentContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268 ComponentContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270 ComponentContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272 ComponentContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274 ComponentContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276 ComponentContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278 ComponentContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280 ComponentContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282 ComponentContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284 ComponentContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286 ComponentContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288 ComponentContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290 ComponentContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292 ComponentContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294 ComponentContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296 ComponentContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298 ComponentContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300' constraints.validation.query='ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301 ComponentContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268 ComponentContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270 ComponentContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272 ComponentContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274 ComponentContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276 ComponentContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278 ComponentContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280 ComponentContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282 ComponentContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284 ComponentContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286 ComponentContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288 ComponentContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290 ComponentContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292 ComponentContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294 ComponentContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296 ComponentContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298 ComponentContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300' constraints.validation.warning='ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293' constraints.validation.info='ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299 ComponentStructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2ComponentStructuredBody constraints.validation.error='ContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268 ContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270 ContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272 ContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274 ContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276 ContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278 ContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280 ContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282 ContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284 ContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286 ContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288 ContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290 ContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292 ContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294 ContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296 ContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298 ContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297' constraints.validation.query='StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301' constraints.validation.warning='StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293' constraints.validation.info='StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299 StructuredBodyContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolContinuityOfCareDocument2ComponentStructuredBodyComponent constraints.validation.error='ContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297' constraints.validation.warning='ContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293' constraints.validation.info='ContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301'"
 * @generated
 */
public interface ContinuityOfCareDocument2 extends USRealmHeader2 {
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
	boolean validateContinuityOfCareDocument2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2Author(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2Component1266(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
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
	boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocument2AuthorAssignedAuthor(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((not assignedPerson.oclIsUndefined() and not id->isEmpty()) implies id->exists(id | (id.isNullFlavorDefined() and id.extension->isEmpty() and id.root->isEmpty()) or (id.isNullFlavorDefined() and id.root=\'2.16.840.1.113883.4.6\') or (id.root=\'2.16.840.1.113883.4.6\' and id.extension->size() = 1)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
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
	boolean validateContinuityOfCareDocument2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection)))'"
	 * @generated
	 */
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateContinuityOfCareDocument2ComponentStructuredBody1267(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ContinuityOfCareDocument2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ContinuityOfCareDocument2
