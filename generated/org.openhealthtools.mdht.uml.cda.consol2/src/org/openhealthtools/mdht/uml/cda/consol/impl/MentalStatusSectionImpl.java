/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MentalStatusSectionImpl extends SectionImpl implements MentalStatusSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MENTAL_STATUS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMentalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMentalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMentalStatusSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMentalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMentalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionEntry756(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionEntry756(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionEntry758(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionEntry758(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionEntry760(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionEntry760(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public MentalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MentalStatusSectionImpl
