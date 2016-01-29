/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DICOMObjectCatalogSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>DICOM Object Catalog Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionEntry296(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Entry296</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionStudyActEntryStudyAct297(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Study Act Entry Study Act297</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DICOMObjectCatalogSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDICOMObjectCatalogSectionTemplateId() {
		OperationsTestCase<DICOMObjectCatalogSection> validateDICOMObjectCatalogSectionTemplateIdTestCase = new OperationsTestCase<DICOMObjectCatalogSection>(
			"validateDICOMObjectCatalogSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DICOMObjectCatalogSection target) {

			}

			@Override
			protected void updateToPass(DICOMObjectCatalogSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionTemplateId(
					(DICOMObjectCatalogSection) objectToTest, diagnostician, map);
			}

		};

		validateDICOMObjectCatalogSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDICOMObjectCatalogSectionCode() {
		OperationsTestCase<DICOMObjectCatalogSection> validateDICOMObjectCatalogSectionCodeTestCase = new OperationsTestCase<DICOMObjectCatalogSection>(
			"validateDICOMObjectCatalogSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DICOMObjectCatalogSection target) {

			}

			@Override
			protected void updateToPass(DICOMObjectCatalogSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionCode(
					(DICOMObjectCatalogSection) objectToTest, diagnostician, map);
			}

		};

		validateDICOMObjectCatalogSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDICOMObjectCatalogSectionCodeP() {
		OperationsTestCase<DICOMObjectCatalogSection> validateDICOMObjectCatalogSectionCodePTestCase = new OperationsTestCase<DICOMObjectCatalogSection>(
			"validateDICOMObjectCatalogSectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DICOMObjectCatalogSection target) {

			}

			@Override
			protected void updateToPass(DICOMObjectCatalogSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionCodeP(
					(DICOMObjectCatalogSection) objectToTest, diagnostician, map);
			}

		};

		validateDICOMObjectCatalogSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDICOMObjectCatalogSectionEntry296() {
		OperationsTestCase<DICOMObjectCatalogSection> validateDICOMObjectCatalogSectionEntry296TestCase = new OperationsTestCase<DICOMObjectCatalogSection>(
			"validateDICOMObjectCatalogSectionEntry296", operationsForOCL.getOCLValue(
				"VALIDATE_DICOM_OBJECT_CATALOG_SECTION_ENTRY296__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DICOMObjectCatalogSection target) {

			}

			@Override
			protected void updateToPass(DICOMObjectCatalogSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionEntry296(
					(DICOMObjectCatalogSection) objectToTest, diagnostician, map);
			}

		};

		validateDICOMObjectCatalogSectionEntry296TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDICOMObjectCatalogSectionStudyActEntryStudyAct297() {
		OperationsTestCase<DICOMObjectCatalogSection> validateDICOMObjectCatalogSectionStudyActEntryStudyAct297TestCase = new OperationsTestCase<DICOMObjectCatalogSection>(
			"validateDICOMObjectCatalogSectionStudyActEntryStudyAct297",
			operationsForOCL.getOCLValue(
				"VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT_ENTRY_STUDY_ACT297__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DICOMObjectCatalogSection target) {

			}

			@Override
			protected void updateToPass(DICOMObjectCatalogSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionStudyActEntryStudyAct297(
					(DICOMObjectCatalogSection) objectToTest, diagnostician, map);
			}

		};

		validateDICOMObjectCatalogSectionStudyActEntryStudyAct297TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DICOMObjectCatalogSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DICOMObjectCatalogSection> {
		@Override
		public DICOMObjectCatalogSection create() {
			return ConsolFactory.eINSTANCE.createDICOMObjectCatalogSection();
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
	private static class ConstructorTestClass extends DICOMObjectCatalogSectionOperations {
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

} // DICOMObjectCatalogSectionOperations
