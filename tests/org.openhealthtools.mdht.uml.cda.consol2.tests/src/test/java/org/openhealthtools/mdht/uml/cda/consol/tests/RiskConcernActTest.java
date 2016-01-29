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
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.RiskConcernActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

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

public class RiskConcernActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActTemplateId() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActTemplateIdTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActTemplateId(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActClassCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActClassCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActClassCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActMoodCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMoodCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMoodCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActId() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActIdTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActId",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActId(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActCodeP() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCodePTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCodeP(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected void setDependency(RiskConcernAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActStatusCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActStatusCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActStatusCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActStatusCodeP() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActStatusCodePTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActStatusCodeP(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActEffectiveTime() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEffectiveTimeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEffectiveTime(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActAuthorParticipation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActAuthorParticipationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActAuthorParticipation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActReference() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReferenceTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReference",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReference(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1590() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1590TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1590", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1590__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1590(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1590TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1592() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1592TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1592", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1592__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1592(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1592TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1594() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1594TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1594", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1594__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1594(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1594TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1596() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1596TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1596", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1596__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1596(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1596TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1598() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1598TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1598", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1598__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1598(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1598TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1600() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1600TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1600", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1600__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1600(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1600TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1602() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1602TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1602", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1602__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1602(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1602TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1604() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1604TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1604", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1604__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1604(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1604TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1606() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1606TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1606", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1606__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1606(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1606TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1608() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1608TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1608", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1608__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1608(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1608TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1610() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1610TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1610", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1610__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1610(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1610TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1612() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1612TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1612", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1612__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1612(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1612TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1614() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1614TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1614", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1614__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1614(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1614TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1616() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1616TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1616", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1616__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1616(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1616TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1618() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1618TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1618", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1618__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1618(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1618TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1620() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1620TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1620", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1620__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1620(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1620TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1622() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1622TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1622", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1622__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1622(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1622TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1624() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1624TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1624", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1624__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1624(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1624TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1626() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1626TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1626", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1626__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1626(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1626TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1628() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1628TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1628", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1628__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1628(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1628TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1630() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1630TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1630", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1630__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1630(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1630TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1632() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1632TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1632", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1632__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1632(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1632TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1634() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1634TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1634", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1634__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1634(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1634TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1636() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1636TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1636", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1636__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1636(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1636TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1638() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1638TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1638", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1638__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1638(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1638TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1640() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1640TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1640", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1640__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1640(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1640TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1642() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1642TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1642", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1642__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1642(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1642TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1644() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1644TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1644", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1644__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1644(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1644TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1646() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1646TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1646", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1646__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1646(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1646TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1648() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1648TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1648", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1648__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1648(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1648TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1650() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1650TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1650", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1650__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1650(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1650TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1652() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1652TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1652", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1652__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1652(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1652TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1654() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1654TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1654", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1654__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1654(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1654TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1656() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1656TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1656", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1656__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1656(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1656TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1658() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1658TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1658", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1658__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1658(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1658TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1660() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1660TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1660", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1660__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1660(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1660TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryRelationship1662() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryRelationship1662TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryRelationship1662", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_RELATIONSHIP1662__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryRelationship1662(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryRelationship1662TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActReferenceTypeCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReferenceTypeCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReferenceTypeCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActReferenceExternalDocumentReference() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReferenceExternalDocumentReference(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21591__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION21593__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_RELATES_TO1595__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HAS_COMPONENT1597__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION1599__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION21601__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES1603__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_B1605__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_RELATIONSHIP_SMOKING_STATUS_MEANINGFUL_USE21607__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS21609__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2_ENTRY_RELATIONSHIP_FAMILY_HISTORY_ORGANIZER21611__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION21613__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP_HOSPITAL_ADMISSION_DIAGNOSIS21615__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_MENTAL_STATUS_OBSERVATION2_C1617__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT1619__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT_B1621__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2_ENTRY_RELATIONSHIP_POSTPROCEDURE_DIAGNOSIS21623__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION_ENTRY_RELATIONSHIP_PREGNANCY_OBSERVATION1625__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP_PREOPERATIVE_DIAGNOSIS21627__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21629__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActResultObservation2EntryRelationshipResultObservation21631() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21631__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS_ENTRY_RELATIONSHIP_SENSORY_STATUS1633__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2_ENTRY_RELATIONSHIP_SOCIAL_HISTORY_OBSERVATION21635__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION21637__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2_ENTRY_RELATIONSHIP_TOBACCO_USE21639__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2_ENTRY_RELATIONSHIP_VITAL_SIGN_OBSERVATION21641__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_OBSERVATION1643__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2_HAS_SUPPORT1645__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS1647__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_RELATIONSHIP_CULTURAL_AND_RELIGIOUS_OBSERVATION1649__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_RELATIONSHIP_CHARACTERISTICS_OF_HOME_ENVIRONMENT1651__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_NUTRITIONAL_STATUS_OBSERVATION1653__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2_ENTRY_RELATIONSHIP_RESULT_ORGANIZER21655__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PATIENT1657__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE_PROVIDER1659__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP_PROBLEM_CONCERN_ACT21661__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_HEALTH_CONCERN1663__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RiskConcernActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RiskConcernAct> {
		public RiskConcernAct create() {
			return ConsolFactory.eINSTANCE.createRiskConcernAct();
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
	private static class ConstructorTestClass extends RiskConcernActOperations {
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

} // RiskConcernActOperations
