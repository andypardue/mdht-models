/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pharmacokinetic Concentration Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Pharmacokinetics Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Pharmacokinetics Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PharmacokineticConcentrationFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PharmacokineticConcentrationFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.41')";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingFastingAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingFastingAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingFastingAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingFastingAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingFastingAssociation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingFastingAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingAssayQuantitationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Pharmacokinetics Test Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Pharmacokinetics Test Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Pharmacokinetics Test Result Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Pharmacokinetics Test Result Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationfastingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationfastingStatusValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Fasting Status</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Fasting Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingfastingAssociationFastingStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::DEF)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::IVL_PQ))))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Type Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject((typeId.oclIsUndefined() or typeId.isNullFlavorUndefined()) implies (not typeId.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Type Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationTypeId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticConcentrationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingassayQuantitationAssociationObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
             new Object [] { pharmacokineticConcentrationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(PharmacokineticConcentrationFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(PharmacokineticConcentrationFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(95));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(pharmacokineticConcentrationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(PharmacokineticConcentrationFinding) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(PharmacokineticConcentrationFinding) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(96));
      try
      {
        GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
    return (SpecimenInformation) query.evaluate(pharmacokineticConcentrationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(PharmacokineticConcentrationFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(PharmacokineticConcentrationFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(97));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(pharmacokineticConcentrationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(PharmacokineticConcentrationFinding) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(PharmacokineticConcentrationFinding) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(98));
      try
      {
        GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
    return (PlannedStudyDay) query.evaluate(pharmacokineticConcentrationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionReason(PharmacokineticConcentrationFinding) <em>Get Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionReason(PharmacokineticConcentrationFinding) <em>Get Exclusion Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(PharmacokineticConcentrationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding)
  {
    if (GET_EXCLUSION_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(99));
      try
      {
        GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
    return (ExclusionReason) query.evaluate(pharmacokineticConcentrationFinding);
  }

} // PharmacokineticConcentrationFindingOperations