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
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HistoryAndPhysicalNoteImpl extends GeneralHeaderConstraintsImpl implements HistoryAndPhysicalNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteInFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponent352(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponent352(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNoteComponentStructuredBody353(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBody353(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryAndPhysicalNote init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public HistoryAndPhysicalNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HistoryAndPhysicalNoteImpl
