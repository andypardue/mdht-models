/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Birth Informationfromaclinicalsettingtovitalrecords</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getReportingBirthInformationfromaclinicalsettingtovitalrecords()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Reporting Birth Information from a clinical setting to vital recordsTemplateId Reporting Birth Information from a clinical setting to vital recordsMoodCode Reporting Birth Information from a clinical setting to vital recordsRealmCode Reporting Birth Information from a clinical setting to vital recordsRealmCodeP Reporting Birth Information from a clinical setting to vital recordsTypeId Reporting Birth Information from a clinical setting to vital recordsId Reporting Birth Information from a clinical setting to vital recordsCode Reporting Birth Information from a clinical setting to vital recordsCodeP Reporting Birth Information from a clinical setting to vital recordsTitle Reporting Birth Information from a clinical setting to vital recordsEffectiveTime Reporting Birth Information from a clinical setting to vital recordsConfidentialityCode Reporting Birth Information from a clinical setting to vital recordsConfidentialityCodeP Reporting Birth Information from a clinical setting to vital recordsLanguageCode Reporting Birth Information from a clinical setting to vital recordsAuthor Reporting Birth Information from a clinical setting to vital recordsCustodian Reporting Birth Information from a clinical setting to vital recordsRecordTarget Reporting Birth Information from a clinical setting to vital recordsPrenatalTestingAndSurveillance Reporting Birth Information from a clinical setting to vital recordsPregnancyHistory Reporting Birth Information from a clinical setting to vital recordsNewbornDeliverySection Reporting Birth Information from a clinical setting to vital recordsLaborAndDeliverySection Reporting Birth Information from a clinical setting to vital recordsHistoryOfInfectionLiveBirthSection' templateId.root='2.16.840.1.113883.10.20.26.1' classCode='DOCCLIN' moodCode='EVN' realmCode.code='USA' code.code='68998-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='U.S. standard certificate of live birth - 2003 revision'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor typeCode='AUT' constraints.validation.error='AuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor constraints.validation.error='AssignedAuthorId AssignedAuthorClassCode' classCode='ASSIGNED'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget typeCode='RCT' constraints.validation.error='RecordTargetTypeCode RecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole classCode='PAT' constraints.validation.error='PatientRoleClassCode PatientRoleId PatientRolePatient' constraints.validation.warning='PatientRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient classCode='PSN' constraints.validation.error='PatientClassCode PatientDeterminerCode PatientName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian typeCode='CST' constraints.validation.error='CustodianTypeCode CustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian classCode='ASSIGNED' constraints.validation.error='AssignedCustodianClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization classCode='ORG' constraints.validation.error='CustodianOrganizationClassCode CustodianOrganizationDeterminerCode CustodianOrganizationId' determinerCode='INSTANCE'"
 * @generated
 */
public interface ReportingBirthInformationfromaclinicalsettingtovitalrecords extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1\')'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = element.oclAsType(datatypes::CS) in \r\nvalue.code = \'USA\'))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'68998-4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.25\')'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Prenatal Testing and Surveillance Section))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Prior Pregnancy History Section))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Newborn Delivery Section))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Section))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::History of Infection: Live Birth Section))'"
	 * @generated
	 */
	boolean validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Prenatal Testing and Surveillance Section))->asSequence()->any(true).oclAsType(vsbr::Prenatal Testing and Surveillance Section)'"
	 * @generated
	 */
	PrenatalTestingandSurveillanceSection getPrenatalTestingAndSurveillance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Prior Pregnancy History Section))->asSequence()->any(true).oclAsType(vsbr::Prior Pregnancy History Section)'"
	 * @generated
	 */
	PriorPregnancyHistorySection getPregnancyHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Newborn Delivery Section))->asSequence()->any(true).oclAsType(vsbr::Newborn Delivery Section)'"
	 * @generated
	 */
	NewbornDeliverySection getNewbornDeliverySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Section))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Section)'"
	 * @generated
	 */
	LaborandDeliverySection getLaborAndDeliverySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::History of Infection: Live Birth Section))->asSequence()->any(true).oclAsType(vsbr::History of Infection: Live Birth Section)'"
	 * @generated
	 */
	HistoryofInfectionLiveBirthSection getHistoryOfInfectionLiveBirthSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingBirthInformationfromaclinicalsettingtovitalrecords init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingBirthInformationfromaclinicalsettingtovitalrecords init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // ReportingBirthInformationfromaclinicalsettingtovitalrecords
