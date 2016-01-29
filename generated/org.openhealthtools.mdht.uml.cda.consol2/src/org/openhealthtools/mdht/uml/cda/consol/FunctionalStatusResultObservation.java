/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusResultObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservationTemplateId ResultObservationTextReferenceValue ResultObservationClassCode ResultObservationMoodCode ResultObservationId ResultObservationCodeP ResultObservationStatusCode ResultObservationStatusCodeP ResultObservationEffectiveTime ResultObservationValue FunctionalStatusResultObservationEntryRelationship584 FunctionalStatusResultObservationEntryRelationship586 FunctionalStatusResultObservationEntryRelationship588 FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode FunctionalStatusResultObservationReferenceRangeObservationRange' templateId.root='2.16.840.1.113883.10.20.22.4.67' constraints.validation.warning='ResultObservationTextReference FunctionalStatusResultObservationValueDatatype ResultObservationCode ResultObservationText ResultObservationInterpretationCode FunctionalStatusResultObservationReferenceRange' classCode='OBS' moodCode='EVN' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.ResultObservationCode='ResultObservationCodeP' statusCode.code='completed' constraints.validation.dependOn.ResultObservationStatusCode='ResultObservationStatusCodeP' constraints.validation.info='ResultObservationMethodCode ResultObservationTargetSiteCode FunctionalStatusResultObservationAuthor FunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585 FunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587 FunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589' constraints.validation.query='FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode FunctionalStatusResultObservationReferenceRangeObservationRange FunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585 FunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587 FunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusResultObservationReferenceRange constraints.validation.error='FunctionalStatusResultObservationReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusResultObservationReferenceRangeObservationRange constraints.validation.error='FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationship constraints.validation.info='FunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationship constraints.validation.info='FunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationship constraints.validation.info='FunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589'"
 * @generated
 */
public interface FunctionalStatusResultObservation extends ResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->forAll(val | val.oclIsTypeOf(datatypes::CD) implies (val.isNullFlavorDefined() or val.oclAsType(datatypes::CD).codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationReferenceRange(DiagnosticChain diagnostics,
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
	boolean validateFunctionalStatusResultObservationEntryRelationship584(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusResultObservationEntryRelationship586(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateFunctionalStatusResultObservationEntryRelationship588(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject(code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->one(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusResultObservation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public FunctionalStatusResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusResultObservation
