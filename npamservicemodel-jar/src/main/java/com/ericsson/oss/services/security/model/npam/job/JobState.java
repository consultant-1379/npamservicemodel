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

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "JobState", version = NPamModelsConstants.VERSION, description = "State of the Job")
@EdtDefinition
public enum JobState {

    @EdtMember(value = 1, description = "Created")
    CREATED,

    @EdtMember(value = 2, description = "Submitted")
    SUBMITTED,

    @EdtMember(value = 3, description = "Scheduled")
    SCHEDULED,

    @EdtMember(value = 4, description = "Running")
    RUNNING,

    @EdtMember(value = 5, description = "Finished")
    COMPLETED,

    @EdtMember(value = 6, description = "User Cancelled")
    USER_CANCELLED
}