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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Exam Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicalExamSection2Impl extends PhysicalExamSectionImpl implements PhysicalExamSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2Component(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2Component(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2Entry1110(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1110(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2Entry1112(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1112(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2Entry1114(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1114(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2Entry1116(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1116(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PhysicalExamSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PhysicalExamSection2Impl
