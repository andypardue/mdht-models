/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smoking Status Meaningful Use2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSmokingStatusMeaningfulUse2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SmokingStatusObservationTemplateId SmokingStatusMeaningfulUse2Id SmokingStatusObservationCode SmokingStatusObservationCodeP SmokingStatusObservationValue SmokingStatusObservationValueP' templateId.root='2.16.840.1.113883.10.20.22.4.78' templateId.extension='2014-06-09' code.code='72166-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Tobacco smoking status NHIS' constraints.validation.dependOn.SmokingStatusObservationCode='SmokingStatusObservationCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.SmokingStatusObservationValue='SmokingStatusObservationValueP' constraints.validation.warning='SmokingStatusMeaningfulUse2AuthorParticipation' constraints.validation.info='SmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc' constraints.validation.query='SmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSmokingStatusMeaningfulUse2CD constraints.validation.info='SmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc'"
 * @generated
 */
public interface SmokingStatusMeaningfulUse2 extends SmokingStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )'"
	 * @generated
	 */
	boolean validateSmokingStatusMeaningfulUse2Id(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSmokingStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateSmokingStatusMeaningfulUse2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject(true)'"
	 * @generated
	 */
	boolean validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusMeaningfulUse2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusMeaningfulUse2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SmokingStatusMeaningfulUse2
