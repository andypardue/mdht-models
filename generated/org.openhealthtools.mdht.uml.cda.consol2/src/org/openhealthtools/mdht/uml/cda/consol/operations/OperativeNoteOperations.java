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
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
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
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponent396(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component396</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Anesthesia Section399</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Complications Section401</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Postoperative Diagnosis Section403</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Preoperative Diagnosis Section405</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Estimated Blood Loss Section407</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Findings Section409</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Specimens Taken Section411</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Description Section413</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Implants Section415</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Fluid Section417</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Surgical Procedure Section419</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Plan Of Care Section421</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Planned Procedure Section423</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Disposition Section425</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Indications Section427</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Surgical Drains Section429</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Anesthesia Section398</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComplicationsSection400(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Complications Section400</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Postoperative Diagnosis Section402</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Preoperative Diagnosis Section404</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Estimated Blood Loss Section406</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Findings Section408</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Specimens Taken Section410</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Description Section412</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Implants Section414</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Fluid Section416</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Surgical Procedure Section418</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Plan Of Care Section420</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Planned Procedure Section422</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Disposition Section424</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Indications Section426</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Surgical Drains Section428</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBody397(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body397</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCodeP(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteGeneralHeaderConstraintsCodeP"),
						 new Object [] { operativeNote }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
				}
				passToken.add(operativeNote);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOf(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNoteDocumentationOf(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOf"),
						 new Object [] { operativeNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponent396(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component396</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponent396(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponent396(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component396</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponent396(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOperativeNoteComponent396(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT396,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponent396"),
						 new Object [] { operativeNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventProcedureCodes(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventProcedureCodes"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.low.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 8))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPreciseToTheDay"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 12))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPreciseToTheMinute"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 14))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPreciseToTheSecond"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() > 8 implies effectiveTime.low.value.size() >= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() > 8 implies effectiveTime.high.value.size() >= 15))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
			OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventCode(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTime(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))->select(typeCode = vocab::x_ServiceEventPerformer::PPRF)->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEventPrimaryPerformer"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteDocumentationOfServiceEvent(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOperativeNoteDocumentationOfServiceEvent(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteDocumentationOfServiceEvent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Anesthesia Section399</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Anesthesia Section399</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Complications Section401</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Complications Section401</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentComplicationsSection401"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Postoperative Diagnosis Section403</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Postoperative Diagnosis Section403</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Preoperative Diagnosis Section405</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Preoperative Diagnosis Section405</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Estimated Blood Loss Section407</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Estimated Blood Loss Section407</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Findings Section409</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Findings Section409</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Specimens Taken Section411</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Specimens Taken Section411</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Description Section413</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Description Section413</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Implants Section415</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Implants Section415</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Fluid Section417</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Fluid Section417</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Surgical Procedure Section419</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Surgical Procedure Section419</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Plan Of Care Section421</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Plan Of Care Section421</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Planned Procedure Section423</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Planned Procedure Section423</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Disposition Section425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Disposition Section425</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Indications Section427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Indications Section427</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Surgical Drains Section429</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Surgical Drains Section429</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Anesthesia Section398</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Anesthesia Section398</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyAnesthesiaSection398"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyComplicationsSection400(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Complications Section400</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComplicationsSection400(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyComplicationsSection400(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Complications Section400</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyComplicationsSection400(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyComplicationsSection400(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyComplicationsSection400"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Postoperative Diagnosis Section402</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Postoperative Diagnosis Section402</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Preoperative Diagnosis Section404</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Preoperative Diagnosis Section404</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Estimated Blood Loss Section406</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Estimated Blood Loss Section406</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Findings Section408</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Findings Section408</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureFindingsSection408"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Specimens Taken Section410</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Specimens Taken Section410</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Description Section412</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Description Section412</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureDescriptionSection412"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Implants Section414</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Implants Section414</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureImplantsSection414"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Fluid Section416</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Fluid Section416</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Surgical Procedure Section418</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Surgical Procedure Section418</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Plan Of Care Section420</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Plan Of Care Section420</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyPlanOfCareSection420"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Planned Procedure Section422</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Planned Procedure Section422</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyPlannedProcedureSection422"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Disposition Section424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Disposition Section424</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureDispositionSection424"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Indications Section426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Indications Section426</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodyProcedureIndicationsSection426"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Surgical Drains Section428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Surgical Drains Section428</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBodySurgicalDrainsSection428"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteComponentStructuredBody397(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body397</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBody397(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteComponentStructuredBody397(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body397</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteComponentStructuredBody397(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateOperativeNoteComponentStructuredBody397(OperativeNote operativeNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(operativeNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteOperativeNoteComponentStructuredBody397"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteGeneralHeaderConstraintsTemplateId"),
						 new Object [] { operativeNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11504-8' or value.code = '34137-0' or value.code = '28583-3' or value.code = '28624-5' or value.code = '28573-4' or value.code = '34877-1' or value.code = '34874-8' or value.code = '34870-6' or value.code = '34868-0' or value.code = '34818-5'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(OperativeNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNote The receiving '<em><b>Operative Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCode(OperativeNote operativeNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(operativeNote)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operativeNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OPERATIVE_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("OperativeNoteGeneralHeaderConstraintsCode"),
						 new Object [] { operativeNote }));
			}
			 
			return false;
		}
		return true;
	}

} // OperativeNoteOperations
