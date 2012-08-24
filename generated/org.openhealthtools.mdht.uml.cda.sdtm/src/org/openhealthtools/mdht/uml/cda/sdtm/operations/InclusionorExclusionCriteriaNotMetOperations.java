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

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Inclusion Exclusion Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Inclusion Exclusion Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InclusionorExclusionCriteriaNotMetOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InclusionorExclusionCriteriaNotMetOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.30')";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Inclusion Exclusion Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Inclusion Exclusion Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Inclusion Exclusion Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Inclusion Exclusion Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
      try
      {
        VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
             new Object [] { inclusionorExclusionCriteriaNotMet }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(InclusionorExclusionCriteriaNotMet) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(InclusionorExclusionCriteriaNotMet)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(InclusionorExclusionCriteriaNotMet) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(InclusionorExclusionCriteriaNotMet)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(73));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(inclusionorExclusionCriteriaNotMet);
  }

} // InclusionorExclusionCriteriaNotMetOperations