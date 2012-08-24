/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BImmunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection#validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BImmunization Section Acute Hepatitis BImmunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection#getAcuteHepatitisBImmunizationActivities() <em>Get Acute Hepatitis BImmunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBImmunizationSectionOperations extends ImmunizationsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AcuteHepatitisBImmunizationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BImmunization Section Acute Hepatitis BImmunization Activity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hepb::AcuteHepatitisBImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BImmunization Section Acute Hepatitis BImmunization Activity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param acuteHepatitisBImmunizationSection The receiving '<em><b>Acute Hepatitis BImmunization Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION);
      try
      {
        VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBImmunizationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HepbValidator.DIAGNOSTIC_SOURCE,
             HepbValidator.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY,
             HepbPlugin.INSTANCE.getString("AcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity"),
             new Object [] { acuteHepatitisBImmunizationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getAcuteHepatitisBImmunizationActivities(AcuteHepatitisBImmunizationSection) <em>Get Acute Hepatitis BImmunization Activities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAcuteHepatitisBImmunizationActivities(AcuteHepatitisBImmunizationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hepb::AcuteHepatitisBImmunizationActivity)).oclAsType(hepb::AcuteHepatitisBImmunizationActivity)";

	/**
   * The cached OCL query for the '{@link #getAcuteHepatitisBImmunizationActivities(AcuteHepatitisBImmunizationSection) <em>Get Acute Hepatitis BImmunization Activities</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAcuteHepatitisBImmunizationActivities(AcuteHepatitisBImmunizationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITIES__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<AcuteHepatitisBImmunizationActivity> getAcuteHepatitisBImmunizationActivities(AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection) {
    if (GET_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION.getEAllOperations().get(65));
      try
      {
        GET_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AcuteHepatitisBImmunizationActivity> result = (Collection<AcuteHepatitisBImmunizationActivity>) query.evaluate(acuteHepatitisBImmunizationSection);
    return new BasicEList.UnmodifiableEList<AcuteHepatitisBImmunizationActivity>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateImmunizationsSectionTemplateId(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateImmunizationsSectionTemplateId(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.9')";

	/**
   * The cached OCL invariant for the '{@link #validateImmunizationsSectionTemplateId(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateImmunizationsSectionTemplateId(AcuteHepatitisBImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param acuteHepatitisBImmunizationSection The receiving '<em><b>Acute Hepatitis BImmunization Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateImmunizationsSectionTemplateId(AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION);
      try
      {
        VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBImmunizationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HepbValidator.DIAGNOSTIC_SOURCE,
             HepbValidator.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ImmunizationsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBImmunizationSection, context) }),
             new Object [] { acuteHepatitisBImmunizationSection }));
      }
       
      return false;
    }
    return true;
  }

} // AcuteHepatitisBImmunizationSectionOperations