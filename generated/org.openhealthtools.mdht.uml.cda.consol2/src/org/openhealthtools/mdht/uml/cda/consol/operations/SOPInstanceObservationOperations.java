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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>SOP Instance Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeNoLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeNoHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEntryRelationship540(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship540</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEntryRelationship542(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship542</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEntryRelationship544(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship544</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation Entry Relationship SOP Instance Observation541</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation Entry Relationship Purposeof Reference Observation543</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation Entry Relationship Referenced Frames Observation545</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOPInstanceObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOPInstanceObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEffectiveTimeHasValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time Has Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTimeHasValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined() implies not self.effectiveTime.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEffectiveTimeHasValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time Has Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTimeHasValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationEffectiveTimeHasValue(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEffectiveTimeHasValue"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEffectiveTimeNoLow(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTimeNoLow(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEffectiveTimeNoLow(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTimeNoLow(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationEffectiveTimeNoLow(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEffectiveTimeNoLow"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEffectiveTimeNoHigh(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTimeNoHigh(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined() implies self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEffectiveTimeNoHigh(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTimeNoHigh(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationEffectiveTimeNoHigh(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEffectiveTimeNoHigh"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationTextMediaType(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Media Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTextMediaType(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text.mediaType = 'application/dicom'";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationTextMediaType(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Media Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTextMediaType(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationTextMediaType(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationTextMediaType"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationTextReference(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTextReference(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text.reference->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationTextReference(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTextReference(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationTextReference(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationTextReference"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationTextReferenceValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTextReferenceValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text.reference.value->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationTextReferenceValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTextReferenceValue(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationTextReferenceValue(
			SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationTextReferenceValue"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationTemplateId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationTemplateId(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationTemplateId"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::DGIMG";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationClassCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationClassCode(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationClassCode"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationEffectiveTime(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEffectiveTime"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationId(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationId(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_ID,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationId"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationMoodCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationMoodCode(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationMoodCode"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationText(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationText(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_TEXT,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationText"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationCodeP(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationCodeP(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationCodeP(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationCodeP(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationCodeP(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationCodeP"),
						 new Object [] { sopInstanceObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservationCodeP", passToken);
				}
				passToken.add(sopInstanceObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '1.2.840.10008.2.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationCode(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSOPInstanceObservationCode(SOPInstanceObservation sopInstanceObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(sopInstanceObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationCode"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEntryRelationship540(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship540</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEntryRelationship540(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEntryRelationship540(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship540</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEntryRelationship540(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSOPInstanceObservationEntryRelationship540(SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEntryRelationship540"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEntryRelationship542(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship542</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEntryRelationship542(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEntryRelationship542(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship542</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEntryRelationship542(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSOPInstanceObservationEntryRelationship542(SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEntryRelationship542"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationEntryRelationship544(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship544</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEntryRelationship544(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationEntryRelationship544(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship544</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationEntryRelationship544(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSOPInstanceObservationEntryRelationship544(SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sopInstanceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationEntryRelationship544"),
						 new Object [] { sopInstanceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation Entry Relationship SOP Instance Observation541</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation Entry Relationship SOP Instance Observation541</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(sopInstanceObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation Entry Relationship Purposeof Reference Observation543</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PurposeofReferenceObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation Entry Relationship Purposeof Reference Observation543</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(sopInstanceObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation Entry Relationship Referenced Frames Observation545</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReferencedFramesObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation Entry Relationship Referenced Frames Observation545</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(SOPInstanceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sopInstanceObservation The receiving '<em><b>SOP Instance Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(SOPInstanceObservation sopInstanceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(sopInstanceObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOP_INSTANCE_OBSERVATION__SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545,
						 ConsolPlugin.INSTANCE.getString("SOPInstanceObservationSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // SOPInstanceObservationOperations
