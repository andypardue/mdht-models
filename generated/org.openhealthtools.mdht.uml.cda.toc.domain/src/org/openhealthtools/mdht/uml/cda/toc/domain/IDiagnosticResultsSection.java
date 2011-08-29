/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Results Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>The Results section contains the results of observations generated by laboratories, imaging procedures, and other procedures. The scope includes hematology, chemistry, serology, virology, toxicology, microbiology, plain x-ray, ultrasound, CT, MRI, angiography, echocardiography, nuclear medicine, pathology, and procedure observations. The section often includes notable results such as abnormal values or relevant trends, and could contain all results for the period of time being documented.</p>
 * 
 * <p>Laboratory results are typically generated by laboratories providing analytic services in areas such as chemistry, hematology, serology, histology, cytology, anatomic pathology, microbiology, and/or virology. These observations are based on analysis of specimens obtained from the patient and submitted to the laboratory.</p>
 * 
 * <p>Imaging results are typically generated by a clinician reviewing the output of an imaging procedure, such as where a cardiologist reports the left ventricular ejection fraction based on the review of a cardiac echocardiogram.</p>
 * 
 * <p>Procedure results are typically generated by a clinician to provide more granular information about component observations made during  a procedure, such as where a gastroenterologist reports the size of a polyp observed during a colonoscopy.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getDiagnosticResultsSection()
 * @generated
 */
public interface IDiagnosticResultsSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getDiagnosticResultsSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::CodedResultsSection::externalReference.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::ExternalReference)).oclAsType(domain::ExternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IExternalReference> getExternalReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Results Section SHOULD contain at least one [1..*] entry, such that Contains exactly one [1..1] External Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IExternalReference addExternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Results Section SHOULD contain at least one [1..*] entry, such that Contains exactly one [1..1] External Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDiagnosticResultsSection addExternalReference(IExternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::DiagnosticResultsSection::diagnosticProcedure.
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::Procedure)).oclAsType(domain::Procedure)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProcedure> getDiagnosticProcedures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Diagnostic Results Section SHALL contain at least one [1..*] entry (C83-[CT-122-2]), such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addDiagnosticProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Diagnostic Results Section SHALL contain at least one [1..*] entry (C83-[CT-122-2]), such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDiagnosticResultsSection addDiagnosticProcedure(IProcedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::DiagnosticResultsSection::result.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::Result)).oclAsType(domain::Result)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IResult> getResults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Diagnostic Results Section SHALL contain at least one [1..*] entry (C83-[CT-122-2]), such that Contains exactly one [1..1] Result (templateId: 2.16.840.1.113883.3.88.11.83.15).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResult addResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Diagnostic Results Section SHALL contain at least one [1..*] entry (C83-[CT-122-2]), such that Contains exactly one [1..1] Result (templateId: 2.16.840.1.113883.3.88.11.83.15).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDiagnosticResultsSection addResult(IResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::DiagnosticResultsSection::resultOrganizer.
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(domain::ResultOrganizer)).oclAsType(domain::ResultOrganizer)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IResultOrganizer> getResultOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Diagnostic Results Section MAY contain zero or more [0..*] entry, such that Contains exactly one [1..1] Result Organizer (templateId: 2.16.840.1.113883.10.20.1.32).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer addResultOrganizer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Diagnostic Results Section MAY contain zero or more [0..*] entry, such that Contains exactly one [1..1] Result Organizer (templateId: 2.16.840.1.113883.10.20.1.32).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDiagnosticResultsSection addResultOrganizer(IResultOrganizer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagnosticResultsSection init();
} // IDiagnosticResultsSection
