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
 * A representation of the model object '<em><b>Physical Exam Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicalExamSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicalExamSectionTemplateId PhysicalExamSectionCode PhysicalExamSectionCodeP PhysicalExamSection2Entry1110 PhysicalExamSection2Entry1112 PhysicalExamSection2Entry1114 PhysicalExamSection2Entry1116 PhysicalExamSection2ComponentSectionCode PhysicalExamSection2ComponentSectionCodeP PhysicalExamSection2ComponentSectionTitle PhysicalExamSection2ComponentSectionText PhysicalExamSection2ComponentSection PhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113 PhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115 PhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117' templateId.root='2.16.840.1.113883.10.20.2.10' templateId.extension='2015-08-01' code.code='29545-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Physical Findings' constraints.validation.dependOn.PhysicalExamSectionCode='PhysicalExamSectionCodeP' constraints.validation.info='PhysicalExamSection2Component PhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111' constraints.validation.query='PhysicalExamSection2ComponentSectionCode PhysicalExamSection2ComponentSectionCodeP PhysicalExamSection2ComponentSectionTitle PhysicalExamSection2ComponentSectionText PhysicalExamSection2ComponentSection PhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111 PhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113 PhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115 PhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicalExamSection2Component constraints.validation.error='PhysicalExamSection2ComponentSection'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicalExamSection2ComponentSection code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PhysicalExamSection2ComponentSectionCode PhysicalExamSection2ComponentSectionCodeP PhysicalExamSection2ComponentSectionTitle PhysicalExamSection2ComponentSectionText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicalExamSection2LongitudinalCareWoundObservationEntry constraints.validation.info='PhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicalExamSection2PressureUlcerObservationEntry constraints.validation.error='PhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicalExamSection2NumberOfPressureUlcersObservationEntry constraints.validation.error='PhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicalExamSection2HighestPressureUlcerStageEntry constraints.validation.error='PhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117'"
 * @generated
 */
public interface PhysicalExamSection2 extends PhysicalExamSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies component->exists(component : cda::Component5 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component5))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2Component(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalExamSection2Entry1110(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalExamSection2Entry1112(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalExamSection2Entry1114(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicalExamSection2Entry1116(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2ComponentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2ComponentSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).section->excluding(null)->reject((title.oclIsUndefined() or title.isNullFlavorUndefined()) implies (not title.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2ComponentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).section->excluding(null)->reject(not text.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2ComponentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cda::Section)))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2ComponentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)))'"
	 * @generated
	 */
	boolean validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PhysicalExamSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicalExamSection2
