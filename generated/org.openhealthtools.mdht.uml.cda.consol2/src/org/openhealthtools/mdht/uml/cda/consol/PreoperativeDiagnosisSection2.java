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
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preoperative Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPreoperativeDiagnosisSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PreoperativeDiagnosisSectionTemplateId PreoperativeDiagnosisSectionCode PreoperativeDiagnosisSectionCodeP PreoperativeDiagnosisSection2Entry1144' templateId.root='2.16.840.1.113883.10.20.22.2.34' templateId.extension='2015-08-01' code.code='10219-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Preoperative Diagnosis' constraints.validation.dependOn.PreoperativeDiagnosisSectionCode='PreoperativeDiagnosisSectionCodeP' constraints.validation.warning='PreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis21145' constraints.validation.query='PreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis21145'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPreoperativeDiagnosisSection2PreoperativeDiagnosis2Entry constraints.validation.warning='PreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis21145'"
 * @generated
 */
public interface PreoperativeDiagnosisSection2 extends PreoperativeDiagnosisSection {
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
	boolean validatePreoperativeDiagnosisSection2Entry1144(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2)))'"
	 * @generated
	 */
	boolean validatePreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis21145(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PreoperativeDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PreoperativeDiagnosisSection2
