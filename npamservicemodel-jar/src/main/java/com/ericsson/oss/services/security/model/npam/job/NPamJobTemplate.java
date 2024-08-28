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
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.Key;
import com.ericsson.oss.itpf.modeling.annotation.Sensitive;
import com.ericsson.oss.itpf.modeling.annotation.UserExposure;
import com.ericsson.oss.itpf.modeling.annotation.UserExposureType;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;
import com.ericsson.oss.services.security.model.npam.NPamModelsConstants;

import java.util.Date;
import java.util.List;

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "NPamJobTemplate", version = NPamModelsConstants.VERSION, description = "A Job Template Object")
@PrimaryTypeDefinition
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@SystemCreated
public class NPamJobTemplate {

    @EModelAttribute(description = "Name")
    @PrimaryTypeAttribute
    @NotNull
    @UserExposure(UserExposureType.READ_ONLY)
    public String name;

    @EModelAttribute(description = "Owner")
    @PrimaryTypeAttribute
    @NotNull
    @UserExposure(UserExposureType.READ_ONLY)
    public String owner;

    @EModelAttribute(description = "Creation Time")
    @PrimaryTypeAttribute
    @NotNull
    @UserExposure(UserExposureType.READ_ONLY)
    public Date creationTime;

    @EModelAttribute(description = "Description")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public String description;

    @EModelAttribute(description = "Job Type")
    @PrimaryTypeAttribute
    @NotNull
    @UserExposure(UserExposureType.READ_ONLY)
    public JobType jobType;

    @EModelAttribute(description = "List of job properties")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    @Sensitive
    public List<JobProperty> jobProperties;

    @EModelAttribute(description = "Selected NEs")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public NEInfo selectedNEs;

    @EModelAttribute(description = "Main Schedule")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public Schedule mainSchedule;
}
