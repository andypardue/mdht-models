/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.MedicalHistoryItemOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical History Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicalHistoryItemImpl extends ObservationImpl implements MedicalHistoryItem
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicalHistoryItemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SdtmPackage.Literals.MEDICAL_HISTORY_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemMedicalHistoryCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemMedicalHistoryCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemPreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemActivityEndTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemActivityEndTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return MedicalHistoryItemOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return MedicalHistoryItemOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return MedicalHistoryItemOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return MedicalHistoryItemOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityEndTimingReference getActivityEndTimingReference()
  {
    return MedicalHistoryItemOperations.getActivityEndTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return MedicalHistoryItemOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicalHistoryItem init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MedicalHistoryItem init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MedicalHistoryItemImpl
