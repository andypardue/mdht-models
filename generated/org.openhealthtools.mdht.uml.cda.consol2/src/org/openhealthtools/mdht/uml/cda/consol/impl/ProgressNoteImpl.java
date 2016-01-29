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
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProgressNoteImpl extends GeneralHeaderConstraintsImpl implements ProgressNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponent488(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponent488(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteDocumentationOfServiceEvent2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6Location(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Location(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressNoteComponentOfEncompassingEncounter6(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentAssessmentSection491(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentAssessmentSection491(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentInterventionsSection501(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentInterventionsSection501(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentObjectiveSection505(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentObjectiveSection505(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyComponentInstructionsSection519(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentInstructionsSection519(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyAssessmentSection490(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyAssessmentSection490(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyPlanOfCareSection492(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyPlanOfCareSection492(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyChiefComplaintSection498(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyChiefComplaintSection498(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyInterventionsSection500(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyInterventionsSection500(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyObjectiveSection504(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyObjectiveSection504(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyPhysicalExamSection506(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyPhysicalExamSection506(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodySubjectiveSection514(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodySubjectiveSection514(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBodyInstructionsSection518(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyInstructionsSection518(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteComponentStructuredBody489(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteComponentStructuredBody489(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressNote init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProgressNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProgressNoteImpl
