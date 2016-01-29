/**
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
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.LongitudinalCareWoundObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Longitudinal Care Wound Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LongitudinalCareWoundObservationImpl extends ProblemObservation2Impl implements
		LongitudinalCareWoundObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongitudinalCareWoundObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LONGITUDINAL_CARE_WOUND_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationEntryRelationship738(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship738(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationEntryRelationship740(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship740(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationEntryRelationship742(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship742(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationEntryRelationship744(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship744(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCDCRCDValueTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRCDValueTerminology(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCDCRCDCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCDCRName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCDCRNameP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRNameP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCDCRValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationCDQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LongitudinalCareWoundObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongitudinalCareWoundObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public LongitudinalCareWoundObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // LongitudinalCareWoundObservationImpl
