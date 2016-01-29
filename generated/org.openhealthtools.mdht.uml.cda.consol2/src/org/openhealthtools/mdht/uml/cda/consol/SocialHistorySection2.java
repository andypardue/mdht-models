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
 * A representation of the model object '<em><b>Social History Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSocialHistorySection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SocialHistorySectionTemplateId SocialHistorySectionCode SocialHistorySectionCodeP SocialHistorySection2Entry1160 SocialHistorySection2Entry1162 SocialHistorySection2Entry1164 SocialHistorySection2Entry1166 SocialHistorySection2Entry1168 SocialHistorySection2Entry1170' templateId.root='2.16.840.1.113883.10.20.22.2.17' templateId.extension='2015-08-01' code.code='29762-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Social History' constraints.validation.dependOn.SocialHistorySectionCode='SocialHistorySectionCodeP' constraints.validation.info='SocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161 SocialHistorySection2TobaccoUse2EntryTobaccoUse21165 SocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167 SocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169 SocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171' constraints.validation.query='SocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161 SocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163 SocialHistorySection2TobaccoUse2EntryTobaccoUse21165 SocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167 SocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169 SocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171' constraints.validation.warning='SocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistorySection2SocialHistoryObservation2Entry constraints.validation.info='SocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistorySection2SmokingStatusMeaningfulUse2Entry constraints.validation.warning='SocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistorySection2TobaccoUse2Entry constraints.validation.info='SocialHistorySection2TobaccoUse2EntryTobaccoUse21165'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistorySection2CaregiverCharacteristicsEntry constraints.validation.info='SocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistorySection2CulturalAndReligiousObservationEntry constraints.validation.info='SocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSocialHistorySection2CharacteristicsOfHomeEnvironmentEntry constraints.validation.info='SocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171'"
 * @generated
 */
public interface SocialHistorySection2 extends SocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2Entry1160(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2Entry1162(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2Entry1164(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2Entry1166(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2Entry1168(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2Entry1170(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)))'"
	 * @generated
	 */
	boolean validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SocialHistorySection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SocialHistorySection2
