/**
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
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
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
 * A static utility class that provides operations related to '<em><b>Risk Concern Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1590(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1590</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1592(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1592</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1594(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1594</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1596(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1596</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1598(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1598</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1600(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1600</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1602(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1602</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1604(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1604</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1606(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1606</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1608(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1608</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1610(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1610</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1612(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1612</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1614(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1614</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1616(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1616</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1618(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1618</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1620(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1620</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1622(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1622</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1624(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1624</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1626(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1626</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1628(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1628</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1630(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1630</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1632(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1632</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1634(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1634</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1636(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1636</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1638(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1638</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1640(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1640</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1642(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1642</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1644(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1644</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1646(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1646</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1648(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1648</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1650(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1650</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1652(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1652</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1654(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1654</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1656(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1656</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1658(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1658</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1660(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1660</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryRelationship1662(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1662</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Entry Relationship Problem Observation21591</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Allergy Observation2 Entry Relationship Allergy Observation21593</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Relates To1595</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Has Component1597</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Assessment Scale Observation Entry Relationship Assessment Scale Observation1599</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation21601</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Self Care Activities Entry Relationship Self Care Activities1603</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2 B1605</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Smoking Status Meaningful Use2 Entry Relationship Smoking Status Meaningful Use21607</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Encounter Diagnosis2 Entry Relationship Encounter Diagnosis21609</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Family History Organizer2 Entry Relationship Family History Organizer21611</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Functional Status Observation2 Entry Relationship Functional Status Observation21613</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Hospital Admission Diagnosis2 Entry Relationship Hospital Admission Diagnosis21615</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2 C1617</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment1619</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment B1621</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Postprocedure Diagnosis2 Entry Relationship Postprocedure Diagnosis21623</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Pregnancy Observation Entry Relationship Pregnancy Observation1625</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Preoperative Diagnosis2 Entry Relationship Preoperative Diagnosis21627</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reaction Observation2 Entry Relationship Reaction Observation21629</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Observation2 Entry Relationship Result Observation21631</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Sensory Status Entry Relationship Sensory Status1633</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Social History Observation2 Entry Relationship Social History Observation21635</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Substance Or Device Allergy Observation2 Entry Relationship Substance Or Device Allergy Observation21637</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Tobacco Use2 Entry Relationship Tobacco Use21639</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Vital Sign Observation2 Entry Relationship Vital Sign Observation21641</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Longitudinal Care Wound Observation Entry Relationship Wound Observation1643</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Entry Relationship Problem Observation2 Has Support1645</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Caregiver Characteristics Entry Relationship Caregiver Characteristics1647</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Cultural And Religious Observation Entry Relationship Cultural And Religious Observation1649</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Characteristics Of Home Environment Entry Relationship Characteristics Of Home Environment1651</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutritional Status Observation Entry Relationship Nutritional Status Observation1653</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Organizer2 Entry Relationship Result Organizer21655</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Entry Relationship Priority Preference Patient1657</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Entry Relationship Priority Preference Provider1659</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Concern Act2 Entry Relationship Problem Concern Act21661</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Health Concern1663</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskConcernActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskConcernActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.136' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActTemplateId(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActTemplateId"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActClassCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActClassCode"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActMoodCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMoodCode"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActId(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ID,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActId"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCodeP(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCodeP"),
						 new Object [] { riskConcernAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP", passToken);
				}
				passToken.add(riskConcernAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '281694009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(riskConcernAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCode"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActStatusCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActStatusCode"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActStatusCodeP(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActStatusCodeP"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActEffectiveTime(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEffectiveTime"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActAuthorParticipation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActAuthorParticipation"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActReference(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReference"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1590(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1590</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1590(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1590(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1590</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1590(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1590(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1590"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1592(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1592</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1592(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1592(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1592</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1592(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1592(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1592"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1594(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1594</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1594(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1594(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1594</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1594(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1594(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1594"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1596(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1596</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1596(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1596(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1596</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1596(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1596(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1596"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1598(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1598</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1598(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1598(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1598</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1598(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1598(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1598"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1600(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1600</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1600(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1600(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1600</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1600(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1600(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1600"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1602(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1602</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1602(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1602(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1602</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1602(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1602(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1602"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1604(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1604</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1604(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1604(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1604</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1604(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1604(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1604"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1606(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1606</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1606(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1606(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1606</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1606(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1606(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1606"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1608(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1608</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1608(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1608(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1608</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1608(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1608(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1608"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1610(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1610</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1610(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1610(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1610</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1610(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1610(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1610"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1612(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1612</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1612(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1612(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1612</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1612(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1612(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1612"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1614(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1614</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1614(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1614(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1614</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1614(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1614(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1614"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1616(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1616</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1616(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1616(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1616</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1616(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1616(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1616"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1618(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1618</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1618(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1618(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1618</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1618(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1618(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1618"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1620(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1620</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1620(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1620(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1620</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1620(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1620(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1620"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1622(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1622</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1622(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1622(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1622</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1622(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1622(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1622"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1624(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1624</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1624(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1624(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1624</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1624(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1624(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1624"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1626(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1626</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1626(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1626(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1626</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1626(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1626(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1626"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1628(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1628</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1628(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1628(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1628</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1628(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1628(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1628"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1630(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1630</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1630(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1630(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1630</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1630(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1630(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1630"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1632(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1632</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1632(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1632(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1632</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1632(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1632(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1632"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1634(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1634</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1634(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1634(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1634</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1634(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1634(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1634"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1636(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1636</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1636(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1636(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1636</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1636(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1636(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1636"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1638(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1638</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1638(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1638(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1638</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1638(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1638(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1638"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1640(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1640</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1640(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1640(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1640</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1640(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1640(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1640"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1642(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1642</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1642(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1642(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1642</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1642(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1642(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1642"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1644(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1644</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1644(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1644(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1644</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1644(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1644(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1644"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1646(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1646</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1646(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1646(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1646</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1646(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1646(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1646"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1648(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1648</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1648(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1648(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1648</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1648(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1648(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1648"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1650(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1650</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1650(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1650(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1650</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1650(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1650(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1650"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1652(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1652</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1652(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1652(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1652</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1652(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1652(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1652"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1654(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1654</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1654(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1654(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1654</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1654(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1654(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1654"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1656(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1656</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1656(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1656(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1656</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1656(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1656(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1656"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1658(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1658</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1658(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1658(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1658</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1658(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1658(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1658"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1660(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1660</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1660(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1660(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1660</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1660(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1660(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1660"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryRelationship1662(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1662</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1662(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryRelationship1662(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Relationship1662</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryRelationship1662(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRiskConcernActEntryRelationship1662(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryRelationship1662"),
						 new Object [] { riskConcernAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateRiskConcernActReferenceTypeCode(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REFERENCE_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReferenceTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReferenceExternalDocumentReference"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Entry Relationship Problem Observation21591</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Entry Relationship Problem Observation21591</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Allergy Observation2 Entry Relationship Allergy Observation21593</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Allergy Observation2 Entry Relationship Allergy Observation21593</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Relates To1595</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Relates To1595</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Has Component1597</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Has Component1597</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Assessment Scale Observation Entry Relationship Assessment Scale Observation1599</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Assessment Scale Observation Entry Relationship Assessment Scale Observation1599</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation21601</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation21601</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Self Care Activities Entry Relationship Self Care Activities1603</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Self Care Activities Entry Relationship Self Care Activities1603</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2 B1605</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2 B1605</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Smoking Status Meaningful Use2 Entry Relationship Smoking Status Meaningful Use21607</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Smoking Status Meaningful Use2 Entry Relationship Smoking Status Meaningful Use21607</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Encounter Diagnosis2 Entry Relationship Encounter Diagnosis21609</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Encounter Diagnosis2 Entry Relationship Encounter Diagnosis21609</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Family History Organizer2 Entry Relationship Family History Organizer21611</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Family History Organizer2 Entry Relationship Family History Organizer21611</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Functional Status Observation2 Entry Relationship Functional Status Observation21613</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Functional Status Observation2 Entry Relationship Functional Status Observation21613</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Hospital Admission Diagnosis2 Entry Relationship Hospital Admission Diagnosis21615</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Hospital Admission Diagnosis2 Entry Relationship Hospital Admission Diagnosis21615</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2 C1617</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 Entry Relationship Mental Status Observation2 C1617</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment1619</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment1619</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment B1621</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment Entry Relationship Nutrition Assessment B1621</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Postprocedure Diagnosis2 Entry Relationship Postprocedure Diagnosis21623</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Postprocedure Diagnosis2 Entry Relationship Postprocedure Diagnosis21623</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Pregnancy Observation Entry Relationship Pregnancy Observation1625</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PregnancyObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Pregnancy Observation Entry Relationship Pregnancy Observation1625</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Preoperative Diagnosis2 Entry Relationship Preoperative Diagnosis21627</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Preoperative Diagnosis2 Entry Relationship Preoperative Diagnosis21627</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reaction Observation2 Entry Relationship Reaction Observation21629</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reaction Observation2 Entry Relationship Reaction Observation21629</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Observation2 Entry Relationship Result Observation21631</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Observation2 Entry Relationship Result Observation21631</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActResultObservation2EntryRelationshipResultObservation21631"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Sensory Status Entry Relationship Sensory Status1633</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryStatus)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Sensory Status Entry Relationship Sensory Status1633</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Social History Observation2 Entry Relationship Social History Observation21635</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Social History Observation2 Entry Relationship Social History Observation21635</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Substance Or Device Allergy Observation2 Entry Relationship Substance Or Device Allergy Observation21637</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Substance Or Device Allergy Observation2 Entry Relationship Substance Or Device Allergy Observation21637</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Tobacco Use2 Entry Relationship Tobacco Use21639</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Tobacco Use2 Entry Relationship Tobacco Use21639</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Vital Sign Observation2 Entry Relationship Vital Sign Observation21641</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Vital Sign Observation2 Entry Relationship Vital Sign Observation21641</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Longitudinal Care Wound Observation Entry Relationship Wound Observation1643</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Longitudinal Care Wound Observation Entry Relationship Wound Observation1643</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Entry Relationship Problem Observation2 Has Support1645</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Entry Relationship Problem Observation2 Has Support1645</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Caregiver Characteristics Entry Relationship Caregiver Characteristics1647</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Caregiver Characteristics Entry Relationship Caregiver Characteristics1647</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Cultural And Religious Observation Entry Relationship Cultural And Religious Observation1649</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Cultural And Religious Observation Entry Relationship Cultural And Religious Observation1649</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Characteristics Of Home Environment Entry Relationship Characteristics Of Home Environment1651</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Characteristics Of Home Environment Entry Relationship Characteristics Of Home Environment1651</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutritional Status Observation Entry Relationship Nutritional Status Observation1653</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionalStatusObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutritional Status Observation Entry Relationship Nutritional Status Observation1653</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Organizer2 Entry Relationship Result Organizer21655</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(organizer->exists(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Organizer2 Entry Relationship Result Organizer21655</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Entry Relationship Priority Preference Patient1657</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Entry Relationship Priority Preference Patient1657</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Entry Relationship Priority Preference Provider1659</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Entry Relationship Priority Preference Provider1659</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Concern Act2 Entry Relationship Problem Concern Act21661</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Concern Act2 Entry Relationship Problem Concern Act21661</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Health Concern1663</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Entry Relationship Entry Reference Health Concern1663</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(riskConcernAct);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663,
						 ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // RiskConcernActOperations
