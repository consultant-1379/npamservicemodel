/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.security.model.npam.job;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;
import com.ericsson.oss.services.security.model.npam.NPamModelsConstants;

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "JobExecMode", version = NPamModelsConstants.VERSION, description = "Execution Mode of the Job")
@EdtDefinition
public enum JobExecMode {

	@EdtMember(value = 1, description = "immediate")
	IMMEDIATE,

	@EdtMember(value = 2, description = "manual")
	MANUAL,

	@EdtMember(value = 3, description = "scheduled")
	SCHEDULED

}