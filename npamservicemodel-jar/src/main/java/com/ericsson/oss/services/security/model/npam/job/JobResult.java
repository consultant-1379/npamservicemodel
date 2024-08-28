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

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "JobResult", version = NPamModelsConstants.VERSION, description = "Result of the Job")
@EdtDefinition
public enum JobResult {
	
	@EdtMember(value = 1, description = "success")
	SUCCESS, 
	
	@EdtMember(value = 2, description = "fail")
	FAILED,

	@EdtMember(value = 3, description = "skipped")
	SKIPPED

}
