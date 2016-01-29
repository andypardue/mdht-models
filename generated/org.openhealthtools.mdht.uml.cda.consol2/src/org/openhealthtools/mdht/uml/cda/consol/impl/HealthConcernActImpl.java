/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;

import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.SensoryStatus;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HealthConcernActImpl extends ActImpl implements HealthConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_CONCERN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship634(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship634(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship636(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship636(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship638(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship638(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship640(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship640(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship642(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship642(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship644(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship644(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship646(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship646(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship648(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship648(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship650(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship650(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship652(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship652(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship654(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship654(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship656(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship656(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship658(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship658(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship660(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship660(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship662(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship662(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship664(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship664(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship666(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship666(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship668(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship668(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship670(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship670(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship672(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship672(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship674(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship674(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship676(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship676(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship678(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship678(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship680(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship680(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship682(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship682(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship684(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship684(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship686(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship686(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship688(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship688(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship690(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship690(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship692(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship692(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship694(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship694(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship696(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship696(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryRelationship698(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryRelationship698(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReferenceExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthConcernAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public HealthConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HealthConcernActImpl
