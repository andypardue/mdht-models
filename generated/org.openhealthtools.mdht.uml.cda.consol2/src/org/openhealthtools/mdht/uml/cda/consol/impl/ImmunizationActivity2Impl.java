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
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImmunizationActivity2Impl extends ImmunizationActivityImpl implements ImmunizationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipForSubAdminAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipForSubAdminAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationship926(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship926(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationship928(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship928(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationship930(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship930(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationship932(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship932(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationship934(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship934(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSequenceNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2Indication2EntryRelationshipIndication2927(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2Indication2EntryRelationshipIndication2927(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityInstructionInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityInstructionInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityConsumableImmunizationMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityConsumableImmunizationMedicationInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityPreconditionTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ImmunizationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ImmunizationActivity2Impl
