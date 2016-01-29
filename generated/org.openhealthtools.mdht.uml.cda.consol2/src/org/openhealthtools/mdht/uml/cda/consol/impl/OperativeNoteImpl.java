/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperativeNoteImpl extends GeneralHeaderConstraintsImpl implements OperativeNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponent396(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponent396(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventProcedureCodes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyComplicationsSection400(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComplicationsSection400(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteComponentStructuredBody397(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComponentStructuredBody397(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public OperativeNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // OperativeNoteImpl
