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
 * A representation of the model object '<em><b>Procedures Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProceduresSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProceduresSectionEntriesOptionalTemplateId ProceduresSection2HasProcedureActivity ProceduresSectionEntriesOptionalCode ProceduresSectionEntriesOptionalCodeP ProceduresSection2Title ProceduresSection2Text' templateId.root='2.16.840.1.113883.10.20.22.2.7.1.2' code.code='47519-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='History of Procedures' constraints.validation.dependOn.ProceduresSectionEntriesOptionalCode='ProceduresSectionEntriesOptionalCodeP' constraints.validation.info='ProceduresSectionEntriesOptionalProcedureActivityProcedure2 ProceduresSectionEntriesOptionalProcedureActivityObservation2 ProceduresSectionEntriesOptionalProcedureActivityAct2'"
 * @generated
 */
public interface ProceduresSection2 extends ProceduresSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies self.getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::ProcedureActivityAct)) or self.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::ProcedureActivityObservation)) or self.getProcedures()->exists(p : cda::Procedure | p.oclIsKindOf(consol::ProcedureActivityProcedure))'"
	 * @generated
	 */
	boolean validateProceduresSection2HasProcedureActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProceduresSection2Title(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateProceduresSection2Text(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)).oclAsType(consol::ProcedureActivityObservation2)'"
	 * @generated
	 */
	EList<ProcedureActivityObservation2> getConsolProcedureActivityObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)).oclAsType(consol::ProcedureActivityAct2)'"
	 * @generated
	 */
	EList<ProcedureActivityAct2> getConsolProcedureActivityAct2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProceduresSection2
