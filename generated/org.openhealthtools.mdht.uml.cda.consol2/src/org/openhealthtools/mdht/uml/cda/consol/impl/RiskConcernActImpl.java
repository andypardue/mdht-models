/**
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
import org.openhealthtools.mdht.uml.cda.consol.operations.RiskConcernActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RiskConcernActImpl extends ActImpl implements RiskConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RISK_CONCERN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1590(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1590(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1592(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1592(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1594(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1594(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1596(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1596(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1598(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1598(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1600(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1600(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1602(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1602(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1604(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1604(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1606(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1606(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1608(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1608(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1610(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1610(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1612(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1612(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1614(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1614(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1616(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1616(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1618(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1618(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1620(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1620(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1622(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1622(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1624(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1624(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1626(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1626(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1628(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1628(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1630(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1630(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1632(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1632(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1634(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1634(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1636(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1636(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1638(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1638(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1640(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1640(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1642(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1642(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1644(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1644(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1646(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1646(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1648(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1648(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1650(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1650(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1652(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1652(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1654(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1654(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1656(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1656(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1658(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1658(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1660(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1660(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryRelationship1662(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryRelationship1662(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReferenceExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation21591(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActAllergyObservation2EntryRelationshipAllergyObservation21593(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceRelatesTo1595(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHasComponent1597(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation1599(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation21601(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSelfCareActivitiesEntryRelationshipSelfCareActivities1603(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2B1605(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSmokingStatusMeaningfulUse2EntryRelationshipSmokingStatusMeaningfulUse21607(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEncounterDiagnosis2EntryRelationshipEncounterDiagnosis21609(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActFamilyHistoryOrganizer2EntryRelationshipFamilyHistoryOrganizer21611(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActFunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation21613(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActHospitalAdmissionDiagnosis2EntryRelationshipHospitalAdmissionDiagnosis21615(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2EntryRelationshipMentalStatusObservation2C1617(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessment1619(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActNutritionAssessmentEntryRelationshipNutritionAssessmentB1621(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPostprocedureDiagnosis2EntryRelationshipPostprocedureDiagnosis21623(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPregnancyObservationEntryRelationshipPregnancyObservation1625(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPreoperativeDiagnosis2EntryRelationshipPreoperativeDiagnosis21627(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReactionObservation2EntryRelationshipReactionObservation21629(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActResultObservation2EntryRelationshipResultObservation21631(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSensoryStatusEntryRelationshipSensoryStatus1633(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSocialHistoryObservation2EntryRelationshipSocialHistoryObservation21635(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSubstanceOrDeviceAllergyObservation2EntryRelationshipSubstanceOrDeviceAllergyObservation21637(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActTobaccoUse2EntryRelationshipTobaccoUse21639(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActVitalSignObservation2EntryRelationshipVitalSignObservation21641(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActLongitudinalCareWoundObservationEntryRelationshipWoundObservation1643(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActProblemObservation2EntryRelationshipProblemObservation2HasSupport1645(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics1647(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCulturalAndReligiousObservationEntryRelationshipCulturalAndReligiousObservation1649(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCharacteristicsOfHomeEnvironmentEntryRelationshipCharacteristicsOfHomeEnvironment1651(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActNutritionalStatusObservationEntryRelationshipNutritionalStatusObservation1653(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActResultOrganizer2EntryRelationshipResultOrganizer21655(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferencePatient1657(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPriorityPreferenceEntryRelationshipPriorityPreferenceProvider1659(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActProblemConcernAct2EntryRelationshipProblemConcernAct21661(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryReferenceEntryRelationshipEntryReferenceHealthConcern1663(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskConcernAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RiskConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // RiskConcernActImpl
