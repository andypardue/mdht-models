/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reason For Referral Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getReasonForReferralSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ReasonForReferralSectionTemplateId ReasonForReferralSectionCode ReasonForReferralSectionCodeP ReasonForReferralSection2Entry1156' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.1' templateId.extension='2014-06-09' code.code='42349-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Reason for Referral' constraints.validation.dependOn.ReasonForReferralSectionCode='ReasonForReferralSectionCodeP' constraints.validation.info='ReasonForReferralSection2PatientReferralActEntryPatientReferralAct1157' constraints.validation.query='ReasonForReferralSection2PatientReferralActEntryPatientReferralAct1157'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReasonForReferralSection2PatientReferralActEntry constraints.validation.info='ReasonForReferralSection2PatientReferralActEntryPatientReferralAct1157'"
 * @generated
 */
public interface ReasonForReferralSection2 extends ReasonForReferralSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateReasonForReferralSection2Entry1156(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientReferralAct)))'"
	 * @generated
	 */
	boolean validateReasonForReferralSection2PatientReferralActEntryPatientReferralAct1157(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ReasonForReferralSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ReasonForReferralSection2
