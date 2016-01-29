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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalEquipmentOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Has Non Med Sup Act Xor Proc Act Proc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2597(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity2597</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2599(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure2599</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicalEquipmentOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProc() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProcTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProc",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_HAS_NON_MED_SUP_ACT_XOR_PROC_ACT_PROC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProc(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProcTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerTemplateId() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerTemplateIdTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerTemplateId(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerClassCode() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerClassCodeTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerClassCode(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerMoodCode() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerMoodCodeTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerMoodCode(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerId() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerIdTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerId(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerCode() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerCodeTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerCode(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerStatusCodeP() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerStatusCodePTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerStatusCodeP(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerStatusCode() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerStatusCodeTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(MedicalEquipmentOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerStatusCode(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerEffectiveTime() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerEffectiveTimeTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerEffectiveTime(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerIVLTSLow() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerIVLTSLowTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerIVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerIVLTSLow(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentOrganizerIVLTSHigh() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerIVLTSHighTestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerIVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerIVLTSHigh(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2597() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2597TestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2597",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2597__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2597(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2597TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicalEquipmentOrganizerProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2599() {
		OperationsTestCase<MedicalEquipmentOrganizer> validateMedicalEquipmentOrganizerProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2599TestCase = new OperationsTestCase<MedicalEquipmentOrganizer>(
			"validateMedicalEquipmentOrganizerProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2599",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2599__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentOrganizer target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2599(
					(MedicalEquipmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentOrganizerProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2599TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicalEquipmentOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalEquipmentOrganizer> {
		@Override
		public MedicalEquipmentOrganizer create() {
			return ConsolFactory.eINSTANCE.createMedicalEquipmentOrganizer();
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
	private static class ConstructorTestClass extends MedicalEquipmentOrganizerOperations {
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

} // MedicalEquipmentOrganizerOperations
