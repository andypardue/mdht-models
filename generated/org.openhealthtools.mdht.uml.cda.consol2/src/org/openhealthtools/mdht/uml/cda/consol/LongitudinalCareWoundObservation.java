/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Longitudinal Care Wound Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getLongitudinalCareWoundObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemObservationTemplateId LongitudinalCareWoundObservationClassCode LongitudinalCareWoundObservationMoodCode LongitudinalCareWoundObservationCode LongitudinalCareWoundObservationCodeP LongitudinalCareWoundObservationValueP LongitudinalCareWoundObservationEntryRelationship738 LongitudinalCareWoundObservationEntryRelationship740 LongitudinalCareWoundObservationEntryRelationship742 LongitudinalCareWoundObservationEntryRelationship744 LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue' templateId.root='2.16.840.1.113883.10.20.22.4.114' templateId.extension='2015-08-01' classCode='OBS' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='assertion' constraints.validation.dependOn.LongitudinalCareWoundObservationCode='LongitudinalCareWoundObservationCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.warning='LongitudinalCareWoundObservationValue LongitudinalCareWoundObservationTargetSiteCode LongitudinalCareWoundObservationTargetSiteCodeP LongitudinalCareWoundObservationAuthorParticipation LongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739 LongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741' constraints.validation.dependOn.LongitudinalCareWoundObservationValue='LongitudinalCareWoundObservationValueP' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.query='LongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue LongitudinalCareWoundObservationCDQualifier LongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739 LongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741 LongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743 LongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745' constraints.validation.info='LongitudinalCareWoundObservationCDQualifier LongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743 LongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationCD constraints.validation.info='LongitudinalCareWoundObservationCDQualifier' constraints.validation.warning='CDCRLongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.query='CDCRLongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue' constraints.validation.error='LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationCDCR name.code='272741003' name.codeSystemName='' name.displayName='laterality' constraints.validation.error='LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue LongitudinalCareWoundObservationCDCRCDCode' constraints.validation.warning='CRLongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.query='CRLongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationCDCRCDCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationCDCRCD constraints.validation.warning='LongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.error='LongitudinalCareWoundObservationCDCRCDCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationship constraints.validation.warning='LongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationWoundCharacteristicEntryRelationship constraints.validation.warning='LongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationship constraints.validation.info='LongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationship constraints.validation.info='LongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745'"
 * @generated
 */
public interface LongitudinalCareWoundObservation extends ProblemObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1)'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationEntryRelationship738(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationEntryRelationship740(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationEntryRelationship742(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationEntryRelationship744(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject(code = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRCDValueTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRCDCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined() and name.oclIsKindOf(datatypes::CV) and \nlet value : datatypes::CV = name.oclAsType(datatypes::CV) in \nvalue.code = \'272741003\') )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRNameP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((qualifier->isEmpty() or qualifier->exists(element | element.isNullFlavorUndefined())) implies (not qualifier->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDQualifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundMeasurementObservation)))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundCharacteristic)))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2)))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongitudinalCareWoundObservation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LongitudinalCareWoundObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // LongitudinalCareWoundObservation
