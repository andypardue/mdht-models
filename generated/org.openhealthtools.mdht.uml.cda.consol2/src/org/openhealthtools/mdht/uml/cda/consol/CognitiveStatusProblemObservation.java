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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cognitive Status Problem Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCognitiveStatusProblemObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemObservationTemplateId ProblemObservationHasTextReferenceValue ProblemObservationHasOnsetDate ProblemObservationClassCode ProblemObservationMoodCode ProblemObservationId ProblemObservationCodeP ProblemObservationStatusCode ProblemObservationValueP CognitiveStatusProblemObservationEntryRelationship562 CognitiveStatusProblemObservationEntryRelationship564 CognitiveStatusProblemObservationEntryRelationship566' templateId.root='2.16.840.1.113883.10.20.22.4.73' constraints.validation.warning='ProblemObservationHasTextReference ProblemObservationHasResolutionDate ProblemObservationCode ProblemObservationText ProblemObservationEffectiveTime ProblemObservationValue' classCode='OBS' moodCode='EVN' constraints.validation.info='ProblemObservationNegationInd CognitiveStatusProblemObservationMethodCode CognitiveStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity563 CognitiveStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics565 CognitiveStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation567' code.code='373930000' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Cognitive function finding' constraints.validation.dependOn.ProblemObservationCode='ProblemObservationCodeP' statusCode.code='completed' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ProblemObservationValue='ProblemObservationValueP' constraints.validation.query='CognitiveStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity563 CognitiveStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics565 CognitiveStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation567'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCognitiveStatusProblemObservationNonMedicinalSupplyActivityEntryRelationship constraints.validation.info='CognitiveStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity563'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCognitiveStatusProblemObservationCaregiverCharacteristicsEntryRelationship constraints.validation.info='CognitiveStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics565'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCognitiveStatusProblemObservationAssessmentScaleObservationEntryRelationship constraints.validation.info='CognitiveStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation567'"
 * @generated
 */
public interface CognitiveStatusProblemObservation extends ProblemObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())'"
	 * @generated
	 */
	boolean validateCognitiveStatusProblemObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCognitiveStatusProblemObservationEntryRelationship562(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCognitiveStatusProblemObservationEntryRelationship564(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCognitiveStatusProblemObservationEntryRelationship566(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)))'"
	 * @generated
	 */
	boolean validateCognitiveStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity563(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))'"
	 * @generated
	 */
	boolean validateCognitiveStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics565(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)))'"
	 * @generated
	 */
	boolean validateCognitiveStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation567(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusProblemObservation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public CognitiveStatusProblemObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CognitiveStatusProblemObservation
