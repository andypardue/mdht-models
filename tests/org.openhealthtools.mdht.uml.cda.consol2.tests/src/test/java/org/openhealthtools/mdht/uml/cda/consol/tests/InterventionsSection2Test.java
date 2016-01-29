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
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interventions Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2Entry1094(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1094</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2Entry1096(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1096</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2Entry1098(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Entry1098</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2InterventionActEntryInterventionAct1095(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act Entry Intervention Act1095</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication Participants Entry Handoff Communication1097</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act Entry Planned Intervention Act1099</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InterventionsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2Entry1094() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2Entry1094TestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2Entry1094",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION2_ENTRY1094__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2Entry1094(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2Entry1094TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2Entry1096() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2Entry1096TestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2Entry1096",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION2_ENTRY1096__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2Entry1096(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2Entry1096TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2Entry1098() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2Entry1098TestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2Entry1098",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION2_ENTRY1098__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2Entry1098(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2Entry1098TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2InterventionActEntryInterventionAct1095() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2InterventionActEntryInterventionAct1095TestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2InterventionActEntryInterventionAct1095",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT_ENTRY_INTERVENTION_ACT1095__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2InterventionActEntryInterventionAct1095(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2InterventionActEntryInterventionAct1095TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097TestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1097__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2HandoffCommunicationParticipantsEntryHandoffCommunication1097TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099TestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT_ENTRY_PLANNED_INTERVENTION_ACT1099__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2PlannedInterventionActEntryPlannedInterventionAct1099TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionTemplateId() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSectionTemplateIdTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSectionTemplateId(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionCodeP() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSectionCodePTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSectionCodeP(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionCode() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSectionCodeTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(InterventionsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSectionCode(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InterventionsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<InterventionsSection2> {
		@Override
		public InterventionsSection2 create() {
			return ConsolFactory.eINSTANCE.createInterventionsSection2();
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
	private static class ConstructorTestClass extends InterventionsSection2Operations {
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

} // InterventionsSection2Operations
