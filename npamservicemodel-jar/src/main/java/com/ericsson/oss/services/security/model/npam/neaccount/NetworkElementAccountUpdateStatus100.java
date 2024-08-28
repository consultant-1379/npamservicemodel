/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2022
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.security.model.npam.neaccount;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

/**
 * <p>
 * This ENUM data type represents update status
 * and private key pair.
 * <p>
 * <b>Note:</b> Name of this class has a suffix '100' it reflects the version of the emodel which is in this case '1.0.0'. If an update is needed to
 * this emodel which requires the version of the emodel to be stepped then do not change or update this class, create another class with name
 * reflecting the emodel's name and add a suffix to the name which reflects version of the updated emodel.
 */
@EModel(namespace = "OSS_NE_SEC_DEF", name = "NetworkElementAccountUpdateStatus", version = "1.0.0", description = "This represents update status")
@EdtDefinition
public enum NetworkElementAccountUpdateStatus100 {

	@EdtMember(value = 1, description = "Update status is CONFIGURED")
	CONFIGURED,
	
	@EdtMember(value = 2, description = "Update status is ONGOING")
	ONGOING,
	
	@EdtMember(value = 3, description = "Update status is FAILED")
	FAILED,

	@EdtMember(value = 4, description = "Update status is DETACHED")
	DETACHED
	}
