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
package org.openhealthtools.mdht.uml.cda.phcr.tss.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage
 * @generated
 */
public class tssAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static tssPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public tssAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = tssPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected tssSwitch<Adapter> modelSwitch =
		new tssSwitch<Adapter>()
    {
      @Override
      public Adapter caseToxicShockSyndromeCaseReport(ToxicShockSyndromeCaseReport object)
      {
        return createToxicShockSyndromeCaseReportAdapter();
      }
      @Override
      public Adapter caseTssPhcrClinicalInformationSection(TssPhcrClinicalInformationSection object)
      {
        return createTssPhcrClinicalInformationSectionAdapter();
      }
      @Override
      public Adapter caseTssCaseObservation(TssCaseObservation object)
      {
        return createTssCaseObservationAdapter();
      }
      @Override
      public Adapter caseTssSignsAndSymptomsObservation(TssSignsAndSymptomsObservation object)
      {
        return createTssSignsAndSymptomsObservationAdapter();
      }
      @Override
      public Adapter caseTssPhcrRelevantDxTestsSection(TssPhcrRelevantDxTestsSection object)
      {
        return createTssPhcrRelevantDxTestsSectionAdapter();
      }
      @Override
      public Adapter caseTssResultOrganizer(TssResultOrganizer object)
      {
        return createTssResultOrganizerAdapter();
      }
      @Override
      public Adapter caseTssResultObservation(TssResultObservation object)
      {
        return createTssResultObservationAdapter();
      }
      @Override
      public Adapter caseInfrastructureRoot(InfrastructureRoot object)
      {
        return createInfrastructureRootAdapter();
      }
      @Override
      public Adapter caseAct(Act object)
      {
        return createActAdapter();
      }
      @Override
      public Adapter caseClinicalDocument(ClinicalDocument object)
      {
        return createClinicalDocumentAdapter();
      }
      @Override
      public Adapter casePublicHealthCaseReport(PublicHealthCaseReport object)
      {
        return createPublicHealthCaseReportAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter casePhcrClinicalInformationSection(PhcrClinicalInformationSection object)
      {
        return createPhcrClinicalInformationSectionAdapter();
      }
      @Override
      public Adapter caseClinicalStatement(ClinicalStatement object)
      {
        return createClinicalStatementAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter caseProblemObservation(ProblemObservation object)
      {
        return createProblemObservationAdapter();
      }
      @Override
      public Adapter caseCaseObservation(CaseObservation object)
      {
        return createCaseObservationAdapter();
      }
      @Override
      public Adapter caseSignsAndSymptomsObservation(SignsAndSymptomsObservation object)
      {
        return createSignsAndSymptomsObservationAdapter();
      }
      @Override
      public Adapter caseResultsSection(ResultsSection object)
      {
        return createResultsSectionAdapter();
      }
      @Override
      public Adapter casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object)
      {
        return createPhcrRelevantDxTestsSectionAdapter();
      }
      @Override
      public Adapter caseOrganizer(Organizer object)
      {
        return createOrganizerAdapter();
      }
      @Override
      public Adapter caseResultOrganizer(ResultOrganizer object)
      {
        return createResultOrganizerAdapter();
      }
      @Override
      public Adapter casePhcr_ResultOrganizer(org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer object)
      {
        return createPhcr_ResultOrganizerAdapter();
      }
      @Override
      public Adapter caseResultObservation(ResultObservation object)
      {
        return createResultObservationAdapter();
      }
      @Override
      public Adapter casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object)
      {
        return createPhcr_ResultObservationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport <em>Toxic Shock Syndrome Case Report</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport
   * @generated
   */
	public Adapter createToxicShockSyndromeCaseReportAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection <em>Tss Phcr Clinical Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection
   * @generated
   */
	public Adapter createTssPhcrClinicalInformationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssCaseObservation <em>Tss Case Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.TssCaseObservation
   * @generated
   */
	public Adapter createTssCaseObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssSignsAndSymptomsObservation <em>Tss Signs And Symptoms Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.TssSignsAndSymptomsObservation
   * @generated
   */
	public Adapter createTssSignsAndSymptomsObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection <em>Tss Phcr Relevant Dx Tests Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection
   * @generated
   */
	public Adapter createTssPhcrRelevantDxTestsSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer <em>Tss Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer
   * @generated
   */
	public Adapter createTssResultOrganizerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation <em>Tss Result Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation
   * @generated
   */
	public Adapter createTssResultObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
   * @generated
   */
	public Adapter createInfrastructureRootAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.Act
   * @generated
   */
	public Adapter createActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
   * @generated
   */
	public Adapter createClinicalDocumentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport <em>Public Health Case Report</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport
   * @generated
   */
	public Adapter createPublicHealthCaseReportAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Section
   * @generated
   */
	public Adapter createSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection <em>Clinical Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection
   * @generated
   */
	public Adapter createPhcrClinicalInformationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
   * @generated
   */
	public Adapter createClinicalStatementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Observation
   * @generated
   */
	public Adapter createObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation <em>Problem Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation
   * @generated
   */
	public Adapter createProblemObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation <em>Case Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.CaseObservation
   * @generated
   */
	public Adapter createCaseObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation
   * @generated
   */
	public Adapter createSignsAndSymptomsObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection <em>Results Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ccd.ResultsSection
   * @generated
   */
	public Adapter createResultsSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection
   * @generated
   */
	public Adapter createPhcrRelevantDxTestsSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Organizer
   * @generated
   */
	public Adapter createOrganizerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer <em>Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer
   * @generated
   */
	public Adapter createResultOrganizerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer <em>Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer
   * @generated
   */
	public Adapter createPhcr_ResultOrganizerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation <em>Result Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ccd.ResultObservation
   * @generated
   */
	public Adapter createResultObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation <em>Result Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.ResultObservation
   * @generated
   */
	public Adapter createPhcr_ResultObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //tssAdapterFactory
