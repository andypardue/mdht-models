/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Intervention Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPlannedInterventionAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlannedInterventionActTemplateId PlannedInterventionActClassCode PlannedInterventionActMoodCode PlannedInterventionActMoodCodeP PlannedInterventionActId PlannedInterventionActCode PlannedInterventionActCodeP PlannedInterventionActStatusCode PlannedInterventionActStatusCodeP PlannedInterventionActEntryRelationship1548 PlannedInterventionActEntryRelationship1550 PlannedInterventionActEntryRelationship1552 PlannedInterventionActEntryRelationship1554 PlannedInterventionActEntryRelationship1556 PlannedInterventionActEntryRelationship1558 PlannedInterventionActEntryRelationship1560 PlannedInterventionActEntryRelationship1562 PlannedInterventionActEntryRelationship1564 PlannedInterventionActEntryRelationship1566 PlannedInterventionActEntryRelationship1568 PlannedInterventionActEntryRelationship1570 PlannedInterventionActEntryRelationship1572 PlannedInterventionActEntryRelationship1574 PlannedInterventionActEntryRelationship1576 PlannedInterventionActEntryRelationship1578 PlannedInterventionActEntryRelationship1580 PlannedInterventionActEntryRelationship1582 PlannedInterventionActEntryRelationship1584 PlannedInterventionActEntryRelationship1586 PlannedInterventionActEntryRelationship1588 PlannedInterventionActReferenceTypeCode PlannedInterventionActReferenceExternalDocumentReference PlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585' templateId.root='2.16.840.1.113883.10.20.22.4.146' templateId.extension='2015-08-01' classCode='ACT' constraints.validation.dependOn.PlannedInterventionActMoodCode='PlannedInterventionActMoodCodeP' code.code='362956003' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='procedure / intervention (navigational concept)' constraints.validation.dependOn.PlannedInterventionActCode='PlannedInterventionActCodeP' statusCode.code='active' constraints.validation.warning='PlannedInterventionActEffectiveTime PlannedInterventionActAuthorParticipation' constraints.validation.info='PlannedInterventionActReference PlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549 PlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551 PlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553 PlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555 PlannedInterventionActInterventionActEntryRelationshipInterventionAct1557 PlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559 PlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561 PlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563 PlannedInterventionActInstruction2EntryRelationshipInstruction21565 PlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567 PlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569 PlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571 PlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573 PlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575 PlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577 PlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579 PlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581 PlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583 PlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587 PlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589' constraints.validation.query='PlannedInterventionActReferenceTypeCode PlannedInterventionActReferenceExternalDocumentReference PlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549 PlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551 PlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553 PlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555 PlannedInterventionActInterventionActEntryRelationshipInterventionAct1557 PlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559 PlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561 PlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563 PlannedInterventionActInstruction2EntryRelationshipInstruction21565 PlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567 PlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569 PlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571 PlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573 PlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575 PlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577 PlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579 PlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581 PlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583 PlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585 PlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587 PlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActReference typeCode='REFR' constraints.validation.error='PlannedInterventionActReferenceTypeCode PlannedInterventionActReferenceExternalDocumentReference'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActAdvanceDirectiveObservation2EntryRelationship constraints.validation.info='PlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActImmunizationActivity2EntryRelationship constraints.validation.info='PlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActMedicationActivity2EntryRelationship constraints.validation.info='PlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActProcedureActivityAct2EntryRelationship constraints.validation.info='PlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActInterventionActEntryRelationship constraints.validation.info='PlannedInterventionActInterventionActEntryRelationshipInterventionAct1557'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActProcedureActivityObservation2EntryRelationship constraints.validation.info='PlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActProcedureActivityProcedure2EntryRelationship constraints.validation.info='PlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActEncounterActivity2EntryRelationship constraints.validation.info='PlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActInstruction2EntryRelationship constraints.validation.info='PlannedInterventionActInstruction2EntryRelationshipInstruction21565'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActNonMedicinalSupplyActivity2EntryRelationship constraints.validation.info='PlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedAct2EntryRelationship constraints.validation.info='PlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedEncounter2EntryRelationship constraints.validation.info='PlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedObservation2EntryRelationship constraints.validation.info='PlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedProcedure2EntryRelationship constraints.validation.info='PlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedMedicationActivity2EntryRelationship constraints.validation.info='PlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedSupply2EntryRelationship constraints.validation.info='PlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActNutritionRecommendationEntryRelationship constraints.validation.info='PlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActEntryReferenceEntryRelationship constraints.validation.info='PlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583' constraints.validation.error='PlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActHandoffCommunicationParticipantsEntryRelationship constraints.validation.info='PlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedInterventionActPlannedImmunizationActivityEntryRelationship constraints.validation.info='PlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589'"
 * @generated
 */
public interface PlannedInterventionAct extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.146\' and id.extension = \'2015-08-01\')'"
	 * @generated
	 */
	boolean validatePlannedInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validatePlannedInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validatePlannedInterventionActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and \nlet value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in \nvalue = vocab::x_DocumentActMood::APT or value = vocab::x_DocumentActMood::ARQ or value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::PRMS or value = vocab::x_DocumentActMood::PRP or value = vocab::x_DocumentActMood::RQO'"
	 * @generated
	 */
	boolean validatePlannedInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)'"
	 * @generated
	 */
	boolean validatePlannedInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'362956003\' and value.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validatePlannedInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'active\')'"
	 * @generated
	 */
	boolean validatePlannedInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePlannedInterventionActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1548(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1550(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1552(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1554(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1556(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1558(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1560(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1562(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1564(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1566(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1568(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1570(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1572(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1574(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1576(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1578(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1580(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1582(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1584(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1586(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryRelationship1588(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)'"
	 * @generated
	 */
	boolean validatePlannedInterventionActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)))'"
	 * @generated
	 */
	boolean validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedInterventionAct init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlannedInterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlannedInterventionAct
