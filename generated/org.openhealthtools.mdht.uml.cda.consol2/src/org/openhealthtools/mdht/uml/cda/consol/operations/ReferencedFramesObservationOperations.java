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
import org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referenced Frames Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationEntryRelationship546(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Entry Relationship546</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation Entry Relationship Boundary Observation547</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencedFramesObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedFramesObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferencedFramesObservationTemplateId(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationReferencedFramesObservationTemplateId"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::ROIBND";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferencedFramesObservationClassCode(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationReferencedFramesObservationClassCode"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferencedFramesObservationMoodCode(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationReferencedFramesObservationMoodCode"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '121190' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReferencedFramesObservationCode(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationReferencedFramesObservationCode"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationEntryRelationship546(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Entry Relationship546</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationEntryRelationship546(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationEntryRelationship546(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Entry Relationship546</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationEntryRelationship546(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReferencedFramesObservationEntryRelationship546(ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP546,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationReferencedFramesObservationEntryRelationship546"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation Entry Relationship Boundary Observation547</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::BoundaryObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation Entry Relationship Boundary Observation547</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547(ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(referencedFramesObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION_ENTRY_RELATIONSHIP_BOUNDARY_OBSERVATION547,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationReferencedFramesObservationBoundaryObservationEntryRelationshipBoundaryObservation547"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ReferencedFramesObservationOperations
