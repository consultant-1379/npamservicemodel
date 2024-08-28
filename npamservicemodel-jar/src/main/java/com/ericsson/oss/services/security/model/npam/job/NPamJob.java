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
import com.ericsson.oss.itpf.modeling.annotation.Sensitive;
import com.ericsson.oss.itpf.modeling.annotation.UserExposure;
import com.ericsson.oss.itpf.modeling.annotation.UserExposureType;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Min;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;
import com.ericsson.oss.itpf.modeling.annotation.constraints.RealMax;
import com.ericsson.oss.itpf.modeling.annotation.constraints.RealMin;
import com.ericsson.oss.itpf.modeling.annotation.constraints.RealMinMaxRanges;
import com.ericsson.oss.services.security.model.npam.NPamModelsConstants;

import java.util.Date;
import java.util.List;

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "NPamJob", version = NPamModelsConstants.VERSION, description = "A Persistent Job Object")
@PrimaryTypeDefinition
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@SystemCreated
public class NPamJob extends NPamAbstractJob {
    @EModelAttribute(description = "Job Type")
    @PrimaryTypeAttribute
    @NotNull
    @UserExposure(UserExposureType.READ_ONLY)
    public JobType jobType;

    @EModelAttribute(description = "Execution Index")
    @PrimaryTypeAttribute
    @NotNull
    @DefaultValue("0")
    @Min(value = 0L)
    @UserExposure(UserExposureType.READ_ONLY)
    public int executionIndex;

    @EModelAttribute(description = "Selected NEs")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public NEInfo selectedNEs;

    @EModelAttribute(description = "Template Job ID")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public long templateJobId;

    @EModelAttribute(description = "Number of Network Elements")
    @PrimaryTypeAttribute
    @NotNull
    @DefaultValue("0")
    @Min(value = 0)
    @UserExposure(UserExposureType.READ_ONLY)
    public int numberOfNetworkElements;

    @EModelAttribute(description = "Scheduled Time")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public Date scheduledTime;

    @EModelAttribute(description = "List of Job Properties")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    @Sensitive
    public List<JobProperty> jobProperties;

    @EModelAttribute(description = "Progress Percentage")
    @PrimaryTypeAttribute
    @NotNull
    @DefaultValue("0.0d")
    @RealMinMaxRanges(minValues = @RealMin(value = 0.0), maxValues = @RealMax(value = 100.0))
    @UserExposure(UserExposureType.READ_ONLY)
    public double progressPercentage;

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
}
