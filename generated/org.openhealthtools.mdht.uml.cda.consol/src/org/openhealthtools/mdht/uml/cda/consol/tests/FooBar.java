/*******************************************************************************
 * Copyright (c) 2016 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

/**
 * @author seanmuir
 *
 */
public class FooBar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.currentTimeMillis());
		org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionMedicationOperations.validateAdmissionMedicationCodeP(
			null, null, null);
		System.out.println(System.currentTimeMillis());
		org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionMedicationOperations.validateAdmissionMedicationCodeP(
			null, null, null);
		System.out.println(System.currentTimeMillis());

	}

}
