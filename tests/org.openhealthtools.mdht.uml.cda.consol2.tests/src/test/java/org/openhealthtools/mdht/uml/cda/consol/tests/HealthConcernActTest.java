/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

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

public class HealthConcernActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActTemplateId() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActTemplateIdTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActTemplateId(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActClassCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActClassCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActClassCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActMoodCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActMoodCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActMoodCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActId() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActIdTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActId(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActCodeP() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCodePTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCodeP(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected void setDependency(HealthConcernAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActStatusCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActStatusCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActStatusCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActStatusCodeP() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActStatusCodePTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActStatusCodeP(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActEffectiveTime() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEffectiveTimeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEffectiveTime(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActAuthorParticipation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActAuthorParticipationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActAuthorParticipation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActReference() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActReferenceTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActReference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActReference(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship634() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship634TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship634", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP634__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship634(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship634TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship636() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship636TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship636", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP636__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship636(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship636TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship638() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship638TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship638", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP638__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship638(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship638TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship640() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship640TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship640", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP640__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship640(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship640TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship642() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship642TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship642", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP642__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship642(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship642TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship644() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship644TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship644", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP644__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship644(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship644TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship646() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship646TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship646", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP646__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship646(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship646TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship648() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship648TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship648", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP648__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship648(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship648TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship650() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship650TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship650", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP650__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship650(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship650TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship652() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship652TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship652", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP652__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship652(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship652TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship654() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship654TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship654", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP654__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship654(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship654TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship656() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship656TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship656", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP656__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship656(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship656TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship658() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship658TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship658", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP658__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship658(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship658TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship660() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship660TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship660", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP660__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship660(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship660TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship662() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship662TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship662", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP662__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship662(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship662TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship664() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship664TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship664", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP664__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship664(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship664TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship666() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship666TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship666", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP666__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship666(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship666TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship668() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship668TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship668", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP668__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship668(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship668TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship670() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship670TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship670", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP670__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship670(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship670TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship672() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship672TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship672", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP672__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship672(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship672TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship674() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship674TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship674", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP674__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship674(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship674TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship676() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship676TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship676", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP676__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship676(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship676TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship678() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship678TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship678", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP678__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship678(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship678TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship680() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship680TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship680", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP680__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship680(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship680TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship682() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship682TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship682", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP682__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship682(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship682TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship684() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship684TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship684", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP684__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship684(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship684TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship686() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship686TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship686", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP686__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship686(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship686TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship688() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship688TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship688", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP688__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship688(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship688TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship690() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship690TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship690", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP690__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship690(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship690TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship692() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship692TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship692", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP692__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship692(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship692TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship694() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship694TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship694", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP694__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship694(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship694TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship696() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship696TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship696", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP696__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship696(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship696TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryRelationship698() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryRelationship698TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryRelationship698", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_RELATIONSHIP698__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryRelationship698(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryRelationship698TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActReferenceTypeCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActReferenceTypeCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActReferenceTypeCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActReferenceExternalDocumentReference() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActReferenceExternalDocumentReference(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2635__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2635TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2637__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActAllergyObservation2EntryRelationshipAllergyObservation2637TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_REFR_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_REFR639__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryReferenceRefrEntryRelationshipHealthConcernActErRefr639TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_COMP_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER_COMP641__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryReferenceCompEntryRelationshipHealthConcernActErComp641TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION643__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation643TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES645__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities645TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2647__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2647TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE2649__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse2649TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2651__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis2651TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER2653__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer2653TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2655__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2655TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS2657__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis2657TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT659__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActNutritionAssessmentEntryRelationshipNutritionAssessment659TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS2661__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis2661TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION663__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActPregnancyObservationEntryRelationshipPregnancyObservation663TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS2665__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis2665TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2667__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActReactionObservation2EntryRelationshipReactionObservation2667TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActResultObservation2EntryRelationshipResultObservation2669() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION2669__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActResultObservation2EntryRelationshipResultObservation2669TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS671__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSensoryStatusEntryRelationshipSensoryStatus671TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION2673__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation2673TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2675__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation2675TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE2677__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActTobaccoUse2EntryRelationshipTobaccoUse2677TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION2679__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActVitalSignObservation2EntryRelationshipVitalSignObservation2679TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_LONGITUDINAL_CARE_WOUND_OBSERVATION681__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActLongitudinalCareWoundObservationEntryRelationshipLongitudinalCareWoundObservation681TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_SUPPORT683__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActProblemObservation2EntryRelationshipProblemObservation2Support683TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS685__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics685TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION687__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation687TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT689__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment689TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION691__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation691TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER2693__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActResultOrganizer2EntryRelationshipResultOrganizer2693TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE695__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActPriorityPreferenceEntryRelationshipPriorityPreference695TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT2697__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActProblemConcernAct2EntryRelationshipProblemConcernAct2697TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GENERAL699__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEntryReferenceEntryRelationshipEntryReferenceGeneral699TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthConcernActOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<HealthConcernAct> {
		@Override
		public HealthConcernAct create() {
			return ConsolFactory.eINSTANCE.createHealthConcernAct();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends HealthConcernActOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HealthConcernActOperations
