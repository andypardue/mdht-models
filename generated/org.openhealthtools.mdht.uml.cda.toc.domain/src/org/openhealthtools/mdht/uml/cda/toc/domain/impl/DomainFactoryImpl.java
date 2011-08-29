/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IComment;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainFactory;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedication;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IResult;
import org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistoryStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements IDomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDomainFactory init() {
		try {
			IDomainFactory theDomainFactory = (IDomainFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/toc/domain"); 
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IDomainPackage.DISCHARGE_SUMMARY: return (EObject)createDischargeSummary();
			case IDomainPackage.ALLERGIES_REACTIONS_SECTION: return (EObject)createAllergiesReactionsSection();
			case IDomainPackage.ALLERGY_DRUG_SENSITIVITY: return (EObject)createAllergyDrugSensitivity();
			case IDomainPackage.EPISODE_OBSERVATION: return (EObject)createEpisodeObservation();
			case IDomainPackage.ALLERGY_INTOLERANCE: return (EObject)createAllergyIntolerance();
			case IDomainPackage.PROBLEM_ENTRY: return (EObject)createProblemEntry();
			case IDomainPackage.AGE_OBSERVATION: return (EObject)createAgeObservation();
			case IDomainPackage.SEVERITY: return (EObject)createSeverity();
			case IDomainPackage.PROBLEM_STATUS_OBSERVATION: return (EObject)createProblemStatusObservation();
			case IDomainPackage.STATUS_OBSERVATION: return (EObject)createStatusObservation();
			case IDomainPackage.HEALTH_STATUS_OBSERVATION: return (EObject)createHealthStatusObservation();
			case IDomainPackage.COMMENT: return (EObject)createComment();
			case IDomainPackage.CAUSE_OF_DEATH_OBSERVATION: return (EObject)createCauseOfDeathObservation();
			case IDomainPackage.FAMILY_HISTORY_OBSERVATION: return (EObject)createFamilyHistoryObservation();
			case IDomainPackage.SIMPLE_OBSERVATION: return (EObject)createSimpleObservation();
			case IDomainPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER: return (EObject)createProblemEntryReactionObservationContainer();
			case IDomainPackage.PROBLEM_LIST_SECTION: return (EObject)createProblemListSection();
			case IDomainPackage.CONDITION: return (EObject)createCondition();
			case IDomainPackage.HOSPITAL_COURSE_SECTION: return (EObject)createHospitalCourseSection();
			case IDomainPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: return (EObject)createHospitalDischargeMedicationsSection();
			case IDomainPackage.MEDICATION: return (EObject)createMedication();
			case IDomainPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: return (EObject)createMedicationSeriesNumberObservation();
			case IDomainPackage.MEDICATION_STATUS_OBSERVATION: return (EObject)createMedicationStatusObservation();
			case IDomainPackage.REACTION_OBSERVATION: return (EObject)createReactionObservation();
			case IDomainPackage.SEVERITY_OBSERVATION: return (EObject)createSeverityObservation();
			case IDomainPackage.PRODUCT_INSTANCE: return (EObject)createProductInstance();
			case IDomainPackage.INTERNAL_REFERENCE: return (EObject)createInternalReference();
			case IDomainPackage.PATIENT_MEDICAL_INSTRUCTIONS: return (EObject)createPatientMedicalInstructions();
			case IDomainPackage.MEDICATION_TYPE: return (EObject)createMedicationType();
			case IDomainPackage.MEDICATION_ORDER_INFORMATION: return (EObject)createMedicationOrderInformation();
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS: return (EObject)createMedicationFullfillmentInstructions();
			case IDomainPackage.DISCHARGE_DIAGNOSIS_SECTION: return (EObject)createDischargeDiagnosisSection();
			case IDomainPackage.PLAN_OF_CARE_SECTION: return (EObject)createPlanOfCareSection();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_ACT: return (EObject)createPlanOfCareActivityAct();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY: return (EObject)createPlanOfCareActivity();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: return (EObject)createPlanOfCareActivityEncounter();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: return (EObject)createPlanOfCareActivityObservation();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: return (EObject)createPlanOfCareActivityProcedure();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: return (EObject)createPlanOfCareActivitySubstanceAdministration();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: return (EObject)createPlanOfCareActivitySupply();
			case IDomainPackage.IMMUNIZATION: return (EObject)createImmunization();
			case IDomainPackage.PATIENT_INSTRUCTION: return (EObject)createPatientInstruction();
			case IDomainPackage.ENCOUNTER: return (EObject)createEncounter();
			case IDomainPackage.PROCEDURE: return (EObject)createProcedure();
			case IDomainPackage.SURGERIES_SECTION: return (EObject)createSurgeriesSection();
			case IDomainPackage.EXTERNAL_REFERENCE: return (EObject)createExternalReference();
			case IDomainPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE: return (EObject)createProcedureEntryProcedureActivityProcedure();
			case IDomainPackage.PROCEDURE_ENTRY: return (EObject)createProcedureEntry();
			case IDomainPackage.ENCOUNTER_LOCATION: return (EObject)createEncounterLocation();
			case IDomainPackage.MEDICATION_ACTIVITY: return (EObject)createMedicationActivity();
			case IDomainPackage.CHIEF_COMPLAINT_SECTION: return (EObject)createChiefComplaintSection();
			case IDomainPackage.DISCHARGE_DIET: return (EObject)createDischargeDiet();
			case IDomainPackage.FAMILY_HISTORY_SECTION: return (EObject)createFamilyHistorySection();
			case IDomainPackage.FAMILY_HISTORY: return (EObject)createFamilyHistory();
			case IDomainPackage.FUNCTIONAL_STATUS_SECTION: return (EObject)createFunctionalStatusSection();
			case IDomainPackage.HISTORY_OF_PRESENT_ILLNESS: return (EObject)createHistoryOfPresentIllness();
			case IDomainPackage.HOSPITAL_DISCHARGE_PHYSICAL: return (EObject)createHospitalDischargePhysical();
			case IDomainPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION: return (EObject)createHospitalDischargeStudiesSummarySection();
			case IDomainPackage.IMMUNIZATIONS_SECTION: return (EObject)createImmunizationsSection();
			case IDomainPackage.SUPPLY_ACTIVITY: return (EObject)createSupplyActivity();
			case IDomainPackage.FULFILLMENT_INSTRUCTION: return (EObject)createFulfillmentInstruction();
			case IDomainPackage.REVIEW_OF_SYSTEMS_SECTION: return (EObject)createReviewOfSystemsSection();
			case IDomainPackage.SOCIAL_HISTORY_SECTION: return (EObject)createSocialHistorySection();
			case IDomainPackage.SOCIAL_HISTORY: return (EObject)createSocialHistory();
			case IDomainPackage.SOCIAL_HISTORY_STATUS_OBSERVATION: return (EObject)createSocialHistoryStatusObservation();
			case IDomainPackage.VITAL_SIGNS_SECTION: return (EObject)createVitalSignsSection();
			case IDomainPackage.VITAL_SIGNS_ORGANIZER: return (EObject)createVitalSignsOrganizer();
			case IDomainPackage.VITAL_SIGN_OBSERVATION: return (EObject)createVitalSignObservation();
			case IDomainPackage.DISCHARGE_INSTRUCTIONS: return (EObject)createDischargeInstructions();
			case IDomainPackage.ADVANCE_DIRECTIVES_SECTION: return (EObject)createAdvanceDirectivesSection();
			case IDomainPackage.ADVANCE_DIRECTIVE: return (EObject)createAdvanceDirective();
			case IDomainPackage.ADVANCE_DIRECTIVE_VERIFICATION: return (EObject)createAdvanceDirectiveVerification();
			case IDomainPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: return (EObject)createAdvanceDirectiveStatusObservation();
			case IDomainPackage.ADVANCE_DIRECTIVE_REFERENCE: return (EObject)createAdvanceDirectiveReference();
			case IDomainPackage.MEDICAL_EQUIPMENT_SECTION: return (EObject)createMedicalEquipmentSection();
			case IDomainPackage.CONSULTATION_SUMMARY: return (EObject)createConsultationSummary();
			case IDomainPackage.MEDICATIONS_SECTION: return (EObject)createMedicationsSection();
			case IDomainPackage.DIAGNOSTIC_RESULTS_SECTION: return (EObject)createDiagnosticResultsSection();
			case IDomainPackage.RESULT: return (EObject)createResult();
			case IDomainPackage.RESULT_ORGANIZER: return (EObject)createResultOrganizer();
			case IDomainPackage.ENCOUNTERS_SECTION: return (EObject)createEncountersSection();
			case IDomainPackage.ENCOUNTERS_ACTIVITY: return (EObject)createEncountersActivity();
			case IDomainPackage.PAYERS_SECTION: return (EObject)createPayersSection();
			case IDomainPackage.COVERAGE_ENTRY: return (EObject)createCoverageEntry();
			case IDomainPackage.POLICY_ACTIVITY: return (EObject)createPolicyActivity();
			case IDomainPackage.PAYER_ENTITY: return (EObject)createPayerEntity();
			case IDomainPackage.COVERED_PARTY: return (EObject)createCoveredParty();
			case IDomainPackage.POLICY_SUBSCRIBER: return (EObject)createPolicySubscriber();
			case IDomainPackage.CONSULTATION_REQUEST: return (EObject)createConsultationRequest();
			case IDomainPackage.ASSESSMENT_AND_PLAN_SECTION: return (EObject)createAssessmentAndPlanSection();
			case IDomainPackage.PHYSICAL_EXAM_SECTION: return (EObject)createPhysicalExamSection();
			case IDomainPackage.REASON_FOR_REFERRAL_SECTION: return (EObject)createReasonForReferralSection();
			case IDomainPackage.GENERAL_STATUS_SECTION: return (EObject)createGeneralStatusSection();
			case IDomainPackage.HISTORY_OF_PAST_ILLNESS_SECTION: return (EObject)createHistoryOfPastIllnessSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary createDischargeSummary() {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection createAllergiesReactionsSection() {
		AllergiesReactionsSectionImpl allergiesReactionsSection = new AllergiesReactionsSectionImpl();
		return allergiesReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyDrugSensitivity createAllergyDrugSensitivity() {
		AllergyDrugSensitivityImpl allergyDrugSensitivity = new AllergyDrugSensitivityImpl();
		return allergyDrugSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry createProblemEntry() {
		ProblemEntryImpl problemEntry = new ProblemEntryImpl();
		return problemEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity createSeverity() {
		SeverityImpl severity = new SeverityImpl();
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemStatusObservation createProblemStatusObservation() {
		ProblemStatusObservationImpl problemStatusObservation = new ProblemStatusObservationImpl();
		return problemStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatusObservation createStatusObservation() {
		StatusObservationImpl statusObservation = new StatusObservationImpl();
		return statusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation createCauseOfDeathObservation() {
		CauseOfDeathObservationImpl causeOfDeathObservation = new CauseOfDeathObservationImpl();
		return causeOfDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntryReactionObservationContainer createProblemEntryReactionObservationContainer() {
		ProblemEntryReactionObservationContainerImpl problemEntryReactionObservationContainer = new ProblemEntryReactionObservationContainerImpl();
		return problemEntryReactionObservationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection createProblemListSection() {
		ProblemListSectionImpl problemListSection = new ProblemListSectionImpl();
		return problemListSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalCourseSection createHospitalCourseSection() {
		HospitalCourseSectionImpl hospitalCourseSection = new HospitalCourseSectionImpl();
		return hospitalCourseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationStatusObservation createMedicationStatusObservation() {
		MedicationStatusObservationImpl medicationStatusObservation = new MedicationStatusObservationImpl();
		return medicationStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverityObservation createSeverityObservation() {
		SeverityObservationImpl severityObservation = new SeverityObservationImpl();
		return severityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientMedicalInstructions createPatientMedicalInstructions() {
		PatientMedicalInstructionsImpl patientMedicalInstructions = new PatientMedicalInstructionsImpl();
		return patientMedicalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationOrderInformation createMedicationOrderInformation() {
		MedicationOrderInformationImpl medicationOrderInformation = new MedicationOrderInformationImpl();
		return medicationOrderInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationFullfillmentInstructions createMedicationFullfillmentInstructions() {
		MedicationFullfillmentInstructionsImpl medicationFullfillmentInstructions = new MedicationFullfillmentInstructionsImpl();
		return medicationFullfillmentInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection createDischargeDiagnosisSection() {
		DischargeDiagnosisSectionImpl dischargeDiagnosisSection = new DischargeDiagnosisSectionImpl();
		return dischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityAct createPlanOfCareActivityAct() {
		PlanOfCareActivityActImpl planOfCareActivityAct = new PlanOfCareActivityActImpl();
		return planOfCareActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivity createPlanOfCareActivity() {
		PlanOfCareActivityImpl planOfCareActivity = new PlanOfCareActivityImpl();
		return planOfCareActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityEncounter createPlanOfCareActivityEncounter() {
		PlanOfCareActivityEncounterImpl planOfCareActivityEncounter = new PlanOfCareActivityEncounterImpl();
		return planOfCareActivityEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityObservation createPlanOfCareActivityObservation() {
		PlanOfCareActivityObservationImpl planOfCareActivityObservation = new PlanOfCareActivityObservationImpl();
		return planOfCareActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityProcedure createPlanOfCareActivityProcedure() {
		PlanOfCareActivityProcedureImpl planOfCareActivityProcedure = new PlanOfCareActivityProcedureImpl();
		return planOfCareActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration() {
		PlanOfCareActivitySubstanceAdministrationImpl planOfCareActivitySubstanceAdministration = new PlanOfCareActivitySubstanceAdministrationImpl();
		return planOfCareActivitySubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivitySupply createPlanOfCareActivitySupply() {
		PlanOfCareActivitySupplyImpl planOfCareActivitySupply = new PlanOfCareActivitySupplyImpl();
		return planOfCareActivitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientInstruction createPatientInstruction() {
		PatientInstructionImpl patientInstruction = new PatientInstructionImpl();
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedureEntryProcedureActivityProcedure createProcedureEntryProcedureActivityProcedure() {
		ProcedureEntryProcedureActivityProcedureImpl procedureEntryProcedureActivityProcedure = new ProcedureEntryProcedureActivityProcedureImpl();
		return procedureEntryProcedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedureEntry createProcedureEntry() {
		ProcedureEntryImpl procedureEntry = new ProcedureEntryImpl();
		return procedureEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationActivity createMedicationActivity() {
		MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
		return medicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiet createDischargeDiet() {
		DischargeDietImpl dischargeDiet = new DischargeDietImpl();
		return dischargeDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistory createFamilyHistory() {
		FamilyHistoryImpl familyHistory = new FamilyHistoryImpl();
		return familyHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPresentIllness createHistoryOfPresentIllness() {
		HistoryOfPresentIllnessImpl historyOfPresentIllness = new HistoryOfPresentIllnessImpl();
		return historyOfPresentIllness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargePhysical createHospitalDischargePhysical() {
		HospitalDischargePhysicalImpl hospitalDischargePhysical = new HospitalDischargePhysicalImpl();
		return hospitalDischargePhysical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeStudiesSummarySection createHospitalDischargeStudiesSummarySection() {
		HospitalDischargeStudiesSummarySectionImpl hospitalDischargeStudiesSummarySection = new HospitalDischargeStudiesSummarySectionImpl();
		return hospitalDischargeStudiesSummarySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupplyActivity createSupplyActivity() {
		SupplyActivityImpl supplyActivity = new SupplyActivityImpl();
		return supplyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFulfillmentInstruction createFulfillmentInstruction() {
		FulfillmentInstructionImpl fulfillmentInstruction = new FulfillmentInstructionImpl();
		return fulfillmentInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistory createSocialHistory() {
		SocialHistoryImpl socialHistory = new SocialHistoryImpl();
		return socialHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistoryStatusObservation createSocialHistoryStatusObservation() {
		SocialHistoryStatusObservationImpl socialHistoryStatusObservation = new SocialHistoryStatusObservationImpl();
		return socialHistoryStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignObservation createVitalSignObservation() {
		VitalSignObservationImpl vitalSignObservation = new VitalSignObservationImpl();
		return vitalSignObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISimpleObservation createSimpleObservation() {
		SimpleObservationImpl simpleObservation = new SimpleObservationImpl();
		return simpleObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions createDischargeInstructions() {
		DischargeInstructionsImpl dischargeInstructions = new DischargeInstructionsImpl();
		return dischargeInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirective createAdvanceDirective() {
		AdvanceDirectiveImpl advanceDirective = new AdvanceDirectiveImpl();
		return advanceDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveVerification createAdvanceDirectiveVerification() {
		AdvanceDirectiveVerificationImpl advanceDirectiveVerification = new AdvanceDirectiveVerificationImpl();
		return advanceDirectiveVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation() {
		AdvanceDirectiveStatusObservationImpl advanceDirectiveStatusObservation = new AdvanceDirectiveStatusObservationImpl();
		return advanceDirectiveStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveReference createAdvanceDirectiveReference() {
		AdvanceDirectiveReferenceImpl advanceDirectiveReference = new AdvanceDirectiveReferenceImpl();
		return advanceDirectiveReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConsultationSummary createConsultationSummary() {
		ConsultationSummaryImpl consultationSummary = new ConsultationSummaryImpl();
		return consultationSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagnosticResultsSection createDiagnosticResultsSection() {
		DiagnosticResultsSectionImpl diagnosticResultsSection = new DiagnosticResultsSectionImpl();
		return diagnosticResultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResult createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncountersActivity createEncountersActivity() {
		EncountersActivityImpl encountersActivity = new EncountersActivityImpl();
		return encountersActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICoverageEntry createCoverageEntry() {
		CoverageEntryImpl coverageEntry = new CoverageEntryImpl();
		return coverageEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPolicyActivity createPolicyActivity() {
		PolicyActivityImpl policyActivity = new PolicyActivityImpl();
		return policyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayerEntity createPayerEntity() {
		PayerEntityImpl payerEntity = new PayerEntityImpl();
		return payerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICoveredParty createCoveredParty() {
		CoveredPartyImpl coveredParty = new CoveredPartyImpl();
		return coveredParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPolicySubscriber createPolicySubscriber() {
		PolicySubscriberImpl policySubscriber = new PolicySubscriberImpl();
		return policySubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConsultationRequest createConsultationRequest() {
		ConsultationRequestImpl consultationRequest = new ConsultationRequestImpl();
		return consultationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGeneralStatusSection createGeneralStatusSection() {
		GeneralStatusSectionImpl generalStatusSection = new GeneralStatusSectionImpl();
		return generalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDomainPackage getDomainPackage() {
		return (IDomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IDomainPackage getPackage() {
		return IDomainPackage.eINSTANCE;
	}

} // DomainFactoryImpl
