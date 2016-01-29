/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Component2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Informant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2Component1302(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component1302</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root OI Ds Must Be No More Than64 Characters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2IIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2InFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event Physician Reading Study Performer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document II Oids Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2RelatedDocumentParentDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Related Document Parent Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter Physicianof Record Participant2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject Fetus Subject Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextEntryProcedureContext1309(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Procedure Context Entry Procedure Context1309</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationEntryTextObservation1311(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text Observation Entry Text Observation1311</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsEntryCodeObservations1313(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code Observations Entry Code Observations1313</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationEntryQuantityMeasurementObservation1315(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Quantity Measurement Observation Entry Quantity Measurement Observation1315</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationEntrySOPInstanceObservation1317(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section SOP Instance Observation Entry SOP Instance Observation1317</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Sections Have Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1308(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Entry1308</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1310(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Entry1310</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1312(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Entry1312</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1314(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Entry1314</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1316(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section Entry1316</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3 Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection1305(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component Findings Section1305</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection1307(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Component DICOM Object Catalog Section1307</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyFindingsSection1304(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body Findings Section1304</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBodyDICOMObjectCatalogSection1306(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body DICOM Object Catalog Section1306</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateDiagnosticImagingReport2ComponentStructuredBody1303(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report2 Component Structured Body1303</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticImagingReport2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Id() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2IdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Id",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Id(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2CodeP() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2CodePTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2CodeP(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Code() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2CodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Code",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected void setDependency(DiagnosticImagingReport2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Code(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InformationRecipient() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InformationRecipientTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InformationRecipient(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Participant() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Participant", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Participant(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InFulfillmentOf() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InFulfillmentOfTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InFulfillmentOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOf(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOf() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOf(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocument() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocument",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocument(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOf() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOf", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOf(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Component2() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2Component2TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Component2", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Component2(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2Component2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2Informant() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InformantTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Informant", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Informant(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2Component1302() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2Component1302TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2Component1302", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT1302__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2Component1302(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2Component1302TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64CharactersTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT_OI_DS_MUST_BE_NO_MORE_THAN64_CHARACTERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64Characters(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2IIRootOIDsMustBeNoMoreThan64CharactersTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2IIRoot() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2IIRootTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2IIRoot",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2IIRoot(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2IIRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonNameTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonName(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantAssociatedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPerson(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ParticipantAssociatedEntity() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ParticipantAssociatedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ParticipantAssociatedEntity(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InFulfillmentOfOrderId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InFulfillmentOfOrderIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InFulfillmentOfOrderId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOfOrderId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2InFulfillmentOfOrder() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2InFulfillmentOfOrderTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2InFulfillmentOfOrder",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2InFulfillmentOfOrder(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2InFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventClassCode() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventClassCode(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventCode() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventCodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventCode(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT_PHYSICIAN_READING_STUDY_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventPhysicianReadingStudyPerformer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2DocumentationOfServiceEvent() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2DocumentationOfServiceEventTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2DocumentationOfServiceEvent(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLengthTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_II_OIDS_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLength(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentParentDocumentIIOidsLengthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocumentParentDocumentId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentParentDocumentIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocumentParentDocumentId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocumentId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentParentDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2RelatedDocumentParentDocument() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2RelatedDocumentParentDocumentTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2RelatedDocumentParentDocument",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2RelatedDocumentParentDocument(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2RelatedDocumentParentDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTime(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsibleParty(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PHYSICIANOF_RECORD_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterPhysicianofRecordParticipant2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentOfEncompassingEncounter() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentOfEncompassingEncounter(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT_FETUS_SUBJECT_CONTEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContext(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectFetusSubjectContextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextEntryProcedureContext1309() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextEntryProcedureContext1309TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextEntryProcedureContext1309",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_PROCEDURE_CONTEXT_ENTRY_PROCEDURE_CONTEXT1309__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextEntryProcedureContext1309(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionProcedureContextEntryProcedureContext1309TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationEntryTextObservation1311() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationEntryTextObservation1311TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationEntryTextObservation1311",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT_OBSERVATION_ENTRY_TEXT_OBSERVATION1311__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationEntryTextObservation1311(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextObservationEntryTextObservation1311TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsEntryCodeObservations1313() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsEntryCodeObservations1313TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsEntryCodeObservations1313",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_OBSERVATIONS_ENTRY_CODE_OBSERVATIONS1313__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsEntryCodeObservations1313(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeObservationsEntryCodeObservations1313TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationEntryQuantityMeasurementObservation1315() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationEntryQuantityMeasurementObservation1315TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationEntryQuantityMeasurementObservation1315",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_QUANTITY_MEASUREMENT_OBSERVATION_ENTRY_QUANTITY_MEASUREMENT_OBSERVATION1315__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationEntryQuantityMeasurementObservation1315(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionQuantityMeasurementObservationEntryQuantityMeasurementObservation1315TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationEntrySOPInstanceObservation1317() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationEntrySOPInstanceObservation1317TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationEntrySOPInstanceObservation1317",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SOP_INSTANCE_OBSERVATION_ENTRY_SOP_INSTANCE_OBSERVATION1317__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationEntrySOPInstanceObservation1317(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSOPInstanceObservationEntrySOPInstanceObservation1317TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveTextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveText(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSectionsHaveTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCode(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodePTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodeP(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitleTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitle(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				CDAFactory.eINSTANCE.createStrucDocText();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionText(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubject(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthorTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthor(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1308() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1308TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1308",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_ENTRY1308__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1308(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1308TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1310() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1310TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1310",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_ENTRY1310__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1310(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1310TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1312() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1312TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1312",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_ENTRY1312__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1312(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1312TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1314() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1314TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1314",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_ENTRY1314__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1314(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1314TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1316() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1316TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1316",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION_ENTRY1316__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1316(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionEntry1316TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

				// /* ComponentStructuredBodyComponent3Section */
				// ComponentStructuredBodyComponent3Section section =
				//
				// ConsolFactory.eINSTANCE.createComponentStructuredBodyComponent3Section().init();
				//
				//
				// target.addSection(section);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3Section(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3SectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponent3() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponent3TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponent3",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponent3(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponent3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReport2ComponentStructuredBody() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBody",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBody(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection1305() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection1305TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection1305",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FINDINGS_SECTION1305__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection1305(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponentFindingsSection1305TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection1307() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection1307TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection1307",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_COMPONENT_DICOM_OBJECT_CATALOG_SECTION1307__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection1307(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyComponentDICOMObjectCatalogSection1307TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyFindingsSection1304() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyFindingsSection1304TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyFindingsSection1304",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_FINDINGS_SECTION1304__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyFindingsSection1304(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyFindingsSection1304TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBodyDICOMObjectCatalogSection1306() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBodyDICOMObjectCatalogSection1306TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBodyDICOMObjectCatalogSection1306",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY_DICOM_OBJECT_CATALOG_SECTION1306__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBodyDICOMObjectCatalogSection1306(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBodyDICOMObjectCatalogSection1306TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReport2ComponentStructuredBody1303() {
		OperationsTestCase<DiagnosticImagingReport2> validateDiagnosticImagingReport2ComponentStructuredBody1303TestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateDiagnosticImagingReport2ComponentStructuredBody1303",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT2_COMPONENT_STRUCTURED_BODY1303__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateDiagnosticImagingReport2ComponentStructuredBody1303(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReport2ComponentStructuredBody1303TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DiagnosticImagingReport2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DiagnosticImagingReport2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport2 target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport2Operations.validateGeneralHeaderConstraintsTemplateId(
					(DiagnosticImagingReport2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticImagingReport2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<DiagnosticImagingReport2> {
		public DiagnosticImagingReport2 create() {
			return ConsolFactory.eINSTANCE.createDiagnosticImagingReport2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends DiagnosticImagingReport2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // DiagnosticImagingReport2Operations
