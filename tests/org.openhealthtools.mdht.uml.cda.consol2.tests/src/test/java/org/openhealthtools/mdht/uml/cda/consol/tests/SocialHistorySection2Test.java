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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistorySection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1160(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1160</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1162(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1162</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1164(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1164</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1166(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1166</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1168(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1168</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2Entry1170(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Entry1170</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Social History Observation2 Entry Social History Observation21161</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Smoking Status Meaningful Use2 Entry Current Smoking Status21163</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Tobacco Use2 Entry Tobacco Use21165</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics Entry Caregiver Characteristics1167</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation Entry Cultural And Religious Observation1169</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment Entry Characteristics Of Home Environment1171</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2Entry1160() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2Entry1160TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2Entry1160",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1160__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2Entry1160(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2Entry1160TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2Entry1162() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2Entry1162TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2Entry1162",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1162__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2Entry1162(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2Entry1162TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2Entry1164() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2Entry1164TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2Entry1164",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1164__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2Entry1164(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2Entry1164TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2Entry1166() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2Entry1166TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2Entry1166",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1166__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2Entry1166(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2Entry1166TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2Entry1168() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2Entry1168TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2Entry1168",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1168__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2Entry1168(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2Entry1168TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2Entry1170() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2Entry1170TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2Entry1170",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION2_ENTRY1170__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2Entry1170(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2Entry1170TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_SOCIAL_HISTORY_OBSERVATION2_ENTRY_SOCIAL_HISTORY_OBSERVATION21161__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2SocialHistoryObservation2EntrySocialHistoryObservation21161TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_SMOKING_STATUS_MEANINGFUL_USE2_ENTRY_CURRENT_SMOKING_STATUS21163__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2SmokingStatusMeaningfulUse2EntryCurrentSmokingStatus21163TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_TOBACCO_USE2_ENTRY_TOBACCO_USE21165__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2TobaccoUse2EntryTobaccoUse21165TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS1167__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2CaregiverCharacteristicsEntryCaregiverCharacteristics1167TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION_ENTRY_CULTURAL_AND_RELIGIOUS_OBSERVATION1169__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2CulturalAndReligiousObservationEntryCulturalAndReligiousObservation1169TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171TestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ENTRY_CHARACTERISTICS_OF_HOME_ENVIRONMENT1171__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySection2CharacteristicsOfHomeEnvironmentEntryCharacteristicsOfHomeEnvironment1171TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionTemplateId(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCodeP() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionCodePTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionCodeP(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<SocialHistorySection2> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<SocialHistorySection2>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection2 target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(SocialHistorySection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySection2Operations.validateSocialHistorySectionCode(
					(SocialHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistorySection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistorySection2> {
		@Override
		public SocialHistorySection2 create() {
			return ConsolFactory.eINSTANCE.createSocialHistorySection2();
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
	private static class ConstructorTestClass extends SocialHistorySection2Operations {
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

} // SocialHistorySection2Operations
