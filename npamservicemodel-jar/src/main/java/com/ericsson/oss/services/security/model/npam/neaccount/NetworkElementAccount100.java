
package com.ericsson.oss.services.security.model.npam.neaccount;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.*;
import com.ericsson.oss.itpf.modeling.annotation.*;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;
import com.ericsson.oss.services.security.model.npam.job.JobType;

import java.util.Date;

/**
 * <p>
 * Represents information related to NetworkElementAccount
 * </p>
 * <b>Note:</b> Name of this class has a suffix '100' it reflects the version of the emodel which is in this case '1.0.0'. If an update is needed to
 * this emodel which requires the version of the emodel to be stepped then do not change or update this class, create another class with name
 * reflecting the emodel's name and add a suffix to the name which reflects version of the updated emodel.
 */
@EModel(description = "NetworkElementAccount MO", name = "NetworkElementAccount", namespace = "OSS_NE_SEC_DEF", version = "1.0.0")
@PrimaryTypeDefinition
@Hierarchical(parentMoTypeUrn = { "//OSS_NE_SEC_DEF/SecurityFunction/*"}, maxChildren = 3)
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@SystemCreated
public class NetworkElementAccount100 {

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of this NetworkElementAccount", immutable = true, mandatory = true, key = true)
    @NotNull
    @UserExposure(UserExposureType.READ_ONLY)
    private String networkElementAccountId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The current user name", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    @Sensitive
    private String currentUsername;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The current password", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    @Sensitive
    private String currentPassword;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The next user name", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    @Sensitive
    private String nextUsername;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The next password", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    @Sensitive
    private String nextPassword;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The time of last successful password change.", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    private Date lastPasswordChange;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The error details", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    private String errorDetails;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The update status", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    private NetworkElementAccountUpdateStatus100 updateStatus;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The time of last failed password change.", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    private Date lastFailed;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Job Type", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    public JobType jobType;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Main Job ID", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    public Long mainJobId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "NE Job ID", immutable = false, mandatory = false, key = false)
    @UserExposure(UserExposureType.READ_ONLY)
    public Long neJobId;
}
