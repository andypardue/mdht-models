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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Examination Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Physical Exam Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Physical Exam Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExaminationFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhysicalExaminationFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.33')";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingId(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingValue(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExamResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Physical Exam Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Physical Exam Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Physical Exam Result Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Physical Exam Result Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
      try
      {
        VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExaminationFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
             new Object [] { physicalExaminationFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(PhysicalExaminationFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(PhysicalExaminationFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(PhysicalExaminationFinding physicalExaminationFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(78));
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
    return (GroupIdentifier) query.evaluate(physicalExaminationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(PhysicalExaminationFinding) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(PhysicalExaminationFinding) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(PhysicalExaminationFinding physicalExaminationFinding)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(79));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(physicalExaminationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(PhysicalExaminationFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(PhysicalExaminationFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(PhysicalExaminationFinding physicalExaminationFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(80));
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
    return (NonPerformanceReason) query.evaluate(physicalExaminationFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(PhysicalExaminationFinding) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(PhysicalExaminationFinding) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(PhysicalExaminationFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(PhysicalExaminationFinding physicalExaminationFinding)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(81));
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
    return (DataCollection) query.evaluate(physicalExaminationFinding);
  }

} // PhysicalExaminationFindingOperations