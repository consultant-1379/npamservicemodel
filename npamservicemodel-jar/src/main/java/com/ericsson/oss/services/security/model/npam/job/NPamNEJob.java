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
import com.ericsson.oss.itpf.modeling.annotation.UserExposure;
import com.ericsson.oss.itpf.modeling.annotation.UserExposureType;
import com.ericsson.oss.services.security.model.npam.NPamModelsConstants;


@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "NPamNEJob", version = NPamModelsConstants.VERSION, description = "NE Job Object")
@PrimaryTypeDefinition
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@SystemCreated
public class NPamNEJob extends NPamAbstractJob {

    @EModelAttribute(description = "NE Name")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public String neName;

    @EModelAttribute(description = "Main Job ID")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public long mainJobId;

    @EModelAttribute(description = "Execution Step")
    @PrimaryTypeAttribute
    @UserExposure(UserExposureType.READ_ONLY)
    public Step step;
}
