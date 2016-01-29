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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concerns Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionEntry748(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry748</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionEntry750(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry750</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionEntry752(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Entry752</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2 Entry Health Status Observation2749</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act Entry Health Concern Act751</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act Entry Risk Concern Act753</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthConcernsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionTemplateId() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionTemplateIdTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionTemplateId(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionNullFlavor() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionNullFlavorTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionNullFlavor", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionNullFlavor(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionCode() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionCodeTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionCode(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionCodeP() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionCodePTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionCodeP(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionTitle() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionTitleTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionTitle(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionText() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionTextTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionText(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernsSectionEntry748() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionEntry748TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionEntry748",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY748__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionEntry748(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionEntry748TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernsSectionEntry750() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionEntry750TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionEntry750",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY750__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionEntry750(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionEntry750TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernsSectionEntry752() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionEntry752TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionEntry752",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_ENTRY752__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionEntry752(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionEntry752TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2_ENTRY_HEALTH_STATUS_OBSERVATION2749__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2749TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT_ENTRY_HEALTH_CONCERN_ACT751__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionHealthConcernActEntryHealthConcernAct751TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT_ENTRY_RISK_CONCERN_ACT753__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionRiskConcernActEntryRiskConcernAct753TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthConcernsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthConcernsSection> {
		@Override
		public HealthConcernsSection create() {
			return ConsolFactory.eINSTANCE.createHealthConcernsSection();
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
	private static class ConstructorTestClass extends HealthConcernsSectionOperations {
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

} // HealthConcernsSectionOperations
