/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
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
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concern Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship634(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship634</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship636(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship636</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship638(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship638</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship640(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship640</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship642(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship642</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship644(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship644</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship646(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship646</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship648(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship648</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship650(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship650</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship652(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship652</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship654(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship654</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship656(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship656</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship658(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship658</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship660(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship660</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship662(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship662</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship664(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship664</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship666(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship666</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship668(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship668</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship670(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship670</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship672(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship672</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship674(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship674</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship676(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship676</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship678(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship678</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship680(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship680</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship682(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship682</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship684(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship684</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship686(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship686</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship688(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship688</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship690(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship690</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship692(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship692</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship694(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship694</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship696(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship696</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryRelationship698(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship698</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Entry Relationship Problem Observation2635</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Allergy Observation2 Entry Relationship Allergy Observation2637</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Refr Entry Relationship Health Concern Act Er Refr639</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Comp Entry Relationship Health Concern Act Er Comp641</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation Entry Relationship Assessment Scale Observation643</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities Entry Relationship Self Care Activities645</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2647</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Smoking Status Meaningful Use2 Entry Relationship Smoking Status Meaningful Use2649</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Encounter Diagnosis2 Entry Relationship Encounter Diagnosis2651</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer2 Entry Relationship Family History Organizer2653</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Functional Status Observation2 Entry Relationship Functional Status Observation2655</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Hospital Admission Diagnosis2 Entry Relationship Hospital Admission Diagnosis2657</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment659</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Postprocedure Diagnosis2 Entry Relationship Postprocedure Diagnosis2661</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation Entry Relationship Pregnancy Observation663</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Preoperative Diagnosis2 Entry Relationship Preoperative Diagnosis2665</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reaction Observation2 Entry Relationship Reaction Observation2667</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Observation2 Entry Relationship Result Observation2669</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory Status Entry Relationship Sensory Status671</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Social History Observation2 Entry Relationship Social History Observation2673</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Substance Or Device Allergy Observation2 Entry Relationship Substance Or Device Allergy Observation2675</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Tobacco Use2 Entry Relationship Tobacco Use2677</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Vital Sign Observation2 Entry Relationship Vital Sign Observation2679</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Longitudinal Care Wound Observation Entry Relationship Longitudinal Care Wound Observation681</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Entry Relationship Problem Observation2 Support683</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics Entry Relationship Caregiver Characteristics685</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation Entry Relationship Cultural And Religious Observation687</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment Entry Relationship Characteristics Of Home Environment689</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation Entry Relationship Nutritional Status Observation691</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Organizer2 Entry Relationship Result Organizer2693</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Priority Preference Entry Relationship Priority Preference695</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Concern Act2 Entry Relationship Problem Concern Act2697</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Entry Relationship Entry Reference General699</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthConcernActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.132' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActTemplateId(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActTemplateId"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActClassCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActClassCode"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActMoodCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActMoodCode"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActId(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ID,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActId"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCodeP(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCodeP"),
						 new Object [] { healthConcernAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP", passToken);
				}
				passToken.add(healthConcernAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '75310-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCode(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(healthConcernAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCode"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActStatusCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActStatusCode"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActStatusCodeP(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActStatusCodeP"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActEffectiveTime(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEffectiveTime"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActAuthorParticipation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActAuthorParticipation"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActReference(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReference"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship634(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship634</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship634(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship634(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship634</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship634(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship634(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship634"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship636(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship636</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship636(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship636(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship636</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship636(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship636(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship636"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship638(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship638</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship638(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship638(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship638</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship638(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship638(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship638"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship640(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship640</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship640(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship640(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship640</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship640(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship640(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship640"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship642(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship642</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship642(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship642(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship642</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship642(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship642(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship642"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship644(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship644</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship644(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship644(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship644</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship644(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship644(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship644"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship646(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship646</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship646(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship646(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship646</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship646(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship646(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship646"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship648(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship648</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship648(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship648(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship648</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship648(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship648(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship648"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship650(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship650</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship650(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship650(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship650</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship650(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship650(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship650"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship652(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship652</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship652(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship652(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship652</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship652(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship652(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship652"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship654(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship654</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship654(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship654(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship654</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship654(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship654(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship654"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship656(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship656</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship656(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship656(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship656</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship656(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship656(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship656"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship658(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship658</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship658(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship658(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship658</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship658(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship658(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship658"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship660(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship660</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship660(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship660(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship660</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship660(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship660(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship660"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship662(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship662</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship662(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship662(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship662</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship662(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship662(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship662"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship664(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship664</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship664(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship664(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship664</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship664(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship664(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship664"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship666(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship666</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship666(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship666(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship666</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship666(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship666(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship666"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship668(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship668</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship668(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship668(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship668</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship668(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship668(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship668"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship670(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship670</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship670(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship670(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship670</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship670(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship670(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship670"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship672(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship672</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship672(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship672(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship672</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship672(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship672(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship672"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship674(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship674</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship674(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship674(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship674</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship674(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship674(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship674"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship676(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship676</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship676(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship676(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship676</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship676(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship676(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship676"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship678(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship678</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship678(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship678(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship678</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship678(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship678(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship678"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship680(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship680</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship680(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship680(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship680</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship680(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship680(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship680"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship682(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship682</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship682(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship682(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship682</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship682(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship682(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship682"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship684(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship684</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship684(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship684(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship684</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship684(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship684(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship684"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship686(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship686</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship686(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship686(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship686</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship686(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship686(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship686"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship688(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship688</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship688(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship688(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship688</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship688(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship688(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship688"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship690(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship690</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship690(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship690(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship690</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship690(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship690(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship690"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship692(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship692</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship692(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship692(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship692</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship692(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship692(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship692"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship694(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship694</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship694(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship694(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship694</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship694(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship694(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship694"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship696(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship696</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship696(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship696(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship696</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship696(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship696(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship696"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryRelationship698(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship698</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship698(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryRelationship698(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Relationship698</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryRelationship698(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHealthConcernActEntryRelationship698(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryRelationship698"),
						 new Object [] { healthConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHealthConcernActReferenceTypeCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReferenceTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReferenceExternalDocumentReference"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Entry Relationship Problem Observation2635</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Entry Relationship Problem Observation2635</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Allergy Observation2 Entry Relationship Allergy Observation2637</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Allergy Observation2 Entry Relationship Allergy Observation2637</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Refr Entry Relationship Health Concern Act Er Refr639</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Refr Entry Relationship Health Concern Act Er Refr639</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Comp Entry Relationship Health Concern Act Er Comp641</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Comp Entry Relationship Health Concern Act Er Comp641</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation Entry Relationship Assessment Scale Observation643</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation Entry Relationship Assessment Scale Observation643</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities Entry Relationship Self Care Activities645</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities Entry Relationship Self Care Activities645</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2647</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2647</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Smoking Status Meaningful Use2 Entry Relationship Smoking Status Meaningful Use2649</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Smoking Status Meaningful Use2 Entry Relationship Smoking Status Meaningful Use2649</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Encounter Diagnosis2 Entry Relationship Encounter Diagnosis2651</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Encounter Diagnosis2 Entry Relationship Encounter Diagnosis2651</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer2 Entry Relationship Family History Organizer2653</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer2 Entry Relationship Family History Organizer2653</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Functional Status Observation2 Entry Relationship Functional Status Observation2655</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Functional Status Observation2 Entry Relationship Functional Status Observation2655</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Hospital Admission Diagnosis2 Entry Relationship Hospital Admission Diagnosis2657</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Hospital Admission Diagnosis2 Entry Relationship Hospital Admission Diagnosis2657</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment659</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment659</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Postprocedure Diagnosis2 Entry Relationship Postprocedure Diagnosis2661</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Postprocedure Diagnosis2 Entry Relationship Postprocedure Diagnosis2661</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation Entry Relationship Pregnancy Observation663</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PregnancyObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation Entry Relationship Pregnancy Observation663</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Preoperative Diagnosis2 Entry Relationship Preoperative Diagnosis2665</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Preoperative Diagnosis2 Entry Relationship Preoperative Diagnosis2665</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reaction Observation2 Entry Relationship Reaction Observation2667</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reaction Observation2 Entry Relationship Reaction Observation2667</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Observation2 Entry Relationship Result Observation2669</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Observation2 Entry Relationship Result Observation2669</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActResultObservation2EntryRelationshipResultObservation2669"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory Status Entry Relationship Sensory Status671</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryStatus)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory Status Entry Relationship Sensory Status671</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Social History Observation2 Entry Relationship Social History Observation2673</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Social History Observation2 Entry Relationship Social History Observation2673</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Substance Or Device Allergy Observation2 Entry Relationship Substance Or Device Allergy Observation2675</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Substance Or Device Allergy Observation2 Entry Relationship Substance Or Device Allergy Observation2675</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Tobacco Use2 Entry Relationship Tobacco Use2677</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Tobacco Use2 Entry Relationship Tobacco Use2677</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Vital Sign Observation2 Entry Relationship Vital Sign Observation2679</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Vital Sign Observation2 Entry Relationship Vital Sign Observation2679</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Longitudinal Care Wound Observation Entry Relationship Longitudinal Care Wound Observation681</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Longitudinal Care Wound Observation Entry Relationship Longitudinal Care Wound Observation681</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Entry Relationship Problem Observation2 Support683</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Entry Relationship Problem Observation2 Support683</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics Entry Relationship Caregiver Characteristics685</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics Entry Relationship Caregiver Characteristics685</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation Entry Relationship Cultural And Religious Observation687</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation Entry Relationship Cultural And Religious Observation687</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment Entry Relationship Characteristics Of Home Environment689</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment Entry Relationship Characteristics Of Home Environment689</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation Entry Relationship Nutritional Status Observation691</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionalStatusObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation Entry Relationship Nutritional Status Observation691</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Organizer2 Entry Relationship Result Organizer2693</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Organizer2 Entry Relationship Result Organizer2693</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Priority Preference Entry Relationship Priority Preference695</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Priority Preference Entry Relationship Priority Preference695</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Concern Act2 Entry Relationship Problem Concern Act2697</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Concern Act2 Entry Relationship Problem Concern Act2697</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Entry Relationship Entry Reference General699</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference Entry Relationship Entry Reference General699</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699,
						 ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // HealthConcernActOperations
