/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICoverageEntry#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getCoverageEntry()
 * @generated
 */
public interface ICoverageEntry {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Act)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getCoverageEntry_CDAType()
	 * @generated
	 */
	Act getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICoverageEntry#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Act value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Coverage Activity SHALL contain at least one [1..*] id (CONF-38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Coverage Activity SHALL contain at least one [1..*] id (CONF-38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICoverageEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::CoverageActivity::policyActivity.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PolicyActivity)).oclAsType(domain::PolicyActivity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IPolicyActivity> getPolicyActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Coverage Activity SHALL contain at least one [1..*] entryRelationship (CONF-43, CONF-45, CONF-46), such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Policy Activity (templateId: 2.16.840.1.113883.10.20.1.26).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPolicyActivity addPolicyActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Coverage Activity SHALL contain at least one [1..*] entryRelationship (CONF-43, CONF-45, CONF-46), such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Policy Activity (templateId: 2.16.840.1.113883.10.20.1.26).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICoverageEntry addPolicyActivity(IPolicyActivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICoverageEntry init();
} // ICoverageEntry
