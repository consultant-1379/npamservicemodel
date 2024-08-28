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

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.*;
import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.UserExposure;
import com.ericsson.oss.itpf.modeling.annotation.UserExposureType;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;
import com.ericsson.oss.services.security.model.npam.NPamModelsConstants;

import java.util.Date;
import java.util.List;

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "NPamAbstractJob", version = NPamModelsConstants.VERSION, description = "Abstract Job Object")
@PrimaryTypeDefinition
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@SystemCreated
public class NPamAbstractJob {

    @EModelAttribute(description = "Job State")
    @PrimaryTypeAttribute
    @NotNull
    @DefaultValue("CREATED")
    @UserExposure(UserExposureType.READ_ONLY)
    public JobState state;

    @EModelAttribute(description = "Job Result")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public JobResult result;

    @EModelAttribute(description = "Start Time")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public Date startTime;

    @EModelAttribute(description = "End Time")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public Date endTime;

    @EModelAttribute(description = "Creation Time")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public Date creationTime;

    @EModelAttribute(description = "Error Details")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public String errorDetails;
}
