/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedSupply2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Supply2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2MedInfoXorImmunXorProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Quantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Product(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductRecommended(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship990(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship990</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship992(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship992</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship994(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship994</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EntryRelationship996(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Entry Relationship996</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference Entry Relationship Priority Preference991</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Indication2EntryRelationshipIndication2993(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2 Entry Relationship Indication2993</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2 Entry Relationship Instruction2995</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage Entry Relationship Planned Coverage997</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedSupply2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2MedInfoXorImmunXorProductInstance() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2MedInfoXorImmunXorProductInstanceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2MedInfoXorImmunXorProductInstance",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2MedInfoXorImmunXorProductInstance(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2MedInfoXorImmunXorProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2StatusCode() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2StatusCodeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2StatusCode(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2StatusCodeP() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2StatusCodePTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2StatusCodeP(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePlannedSupply2EffectiveTime() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EffectiveTimeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

				// IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
				// target.setEffectiveTime(ts );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EffectiveTime(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2RepeatNumber() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2RepeatNumberTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2RepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2RepeatNumber(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2RepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2Quantity() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2QuantityTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Quantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Quantity(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2QuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2Product() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Product",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Product(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2Performer() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PerformerTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Performer(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2AuthorParticipation() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2AuthorParticipationTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2AuthorParticipation(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2ProductInstance() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductInstanceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductInstance(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2ProductRecommended() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductRecommendedTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductRecommended", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductRecommended(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductRecommendedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2EntryRelationship990() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EntryRelationship990TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EntryRelationship990", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP990__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EntryRelationship990(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EntryRelationship990TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2EntryRelationship992() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EntryRelationship992TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EntryRelationship992", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP992__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EntryRelationship992(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EntryRelationship992TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2EntryRelationship994() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EntryRelationship994TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EntryRelationship994", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP994__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EntryRelationship994(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EntryRelationship994TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2EntryRelationship996() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EntryRelationship996TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EntryRelationship996", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP996__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EntryRelationship996(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EntryRelationship996TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2ProductManufacturedProduct() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductManufacturedProductTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductManufacturedProduct",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductManufacturedProduct(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductManufacturedProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE991__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PriorityPreferenceEntryRelationshipPriorityPreference991TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2Indication2EntryRelationshipIndication2993() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2Indication2EntryRelationshipIndication2993TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Indication2EntryRelationshipIndication2993",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2993__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Indication2EntryRelationshipIndication2993(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2Indication2EntryRelationshipIndication2993TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2Instruction2EntryRelationshipInstruction2995() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2Instruction2EntryRelationshipInstruction2995TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Instruction2EntryRelationshipInstruction2995",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2995__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Instruction2EntryRelationshipInstruction2995(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2Instruction2EntryRelationshipInstruction2995TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE997__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PlannedCoverageEntryRelationshipPlannedCoverage997TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyTemplateId() {
		OperationsTestCase<PlannedSupply2> validatePlanOfCareActivitySupplyTemplateIdTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlanOfCareActivitySupplyTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlanOfCareActivitySupplyTemplateId(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyMoodCode() {
		OperationsTestCase<PlannedSupply2> validatePlanOfCareActivitySupplyMoodCodeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlanOfCareActivitySupplyMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlanOfCareActivitySupplyMoodCode(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedSupply2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedSupply2> {
		@Override
		public PlannedSupply2 create() {
			return ConsolFactory.eINSTANCE.createPlannedSupply2();
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
	private static class ConstructorTestClass extends PlannedSupply2Operations {
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

} // PlannedSupply2Operations
