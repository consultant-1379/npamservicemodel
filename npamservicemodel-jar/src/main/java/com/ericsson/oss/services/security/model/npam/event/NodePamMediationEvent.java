package com.ericsson.oss.services.security.model.npam.event;
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

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.sdk.event.MediationTaskRequest;

import java.util.Objects;

/**
 * Event that is sent to trigger the mediation flow to apply NETCONF configuration on the node.
 */
@EModel(namespace = "OSS_NPAM", name = "NodePamMediationEvent", version = "1.0.0", description = "Kick off apply NodePamMediationEvent flow in mediation")
@EventTypeDefinition(channelUrn = "//global/ClusteredEventBasedMediationClient")
public class NodePamMediationEvent extends MediationTaskRequest {
    private static final long serialVersionUID = -1373291430527570204L;

    private static final String OBSCURED_STRING = "***********";

    @EModelAttribute(mandatory = true, description = "Unique identifier for this request.")
    @EventAttribute(filterable = true)
    private String nodePamRequestId;

    @EModelAttribute(mandatory = true, description = "MaintenanceUser Fdn.")
    @EventAttribute(filterable = false)
    private String nodePamFdn;

    @EModelAttribute(mandatory = true, description = "Mo Type.")
    @EventAttribute(filterable = false)
    private String nodePamMoType;

    @EModelAttribute(mandatory = true, description = "MaintenanceUser NameSpace.")
    @EventAttribute(filterable = false)
    private String nodePamNameSpace;

    @EModelAttribute(mandatory = true, description = "MaintenanceUser Version.")
    @EventAttribute(filterable = false)
    private String nodePamNameSpaceVersion;

    @EModelAttribute(mandatory = true, description = "MaintenanceUser Operation (CREATE/MODIFY)")
    @EventAttribute(filterable = false)
    private String nodePamOperation;

    @EModelAttribute(mandatory = true, description = "Subject Name.")
    @EventAttribute(filterable = false)
    private String nodePamSubjectName;

    @EModelAttribute(mandatory = true, description = "Username.")
    @EventAttribute(filterable = false)
    private String nodePamUsername;

    @EModelAttribute(mandatory = true, description = "Password.")
    @EventAttribute(filterable = false)
    private String nodePamPassword;

    @EModelAttribute(mandatory = true, description = "Remote Management.")
    @EventAttribute(filterable = false)
    private Boolean nodePamRemoteManagement;

    @EModelAttribute(mandatory = true, description = "Restrict Maintenance User.")
    @EventAttribute(filterable = false)
    private Boolean nodePamRestrictMaintenanceUser;

    @EModelAttribute(mandatory = true, description = "NEJob Id.")
    @EventAttribute(filterable = false)
    private Long neJobId;

    public String getNodePamRequestId() {
        return nodePamRequestId;
    }

    public void setNodePamRequestId(String nodePamRequestId) {
        this.nodePamRequestId = nodePamRequestId;
    }

    public String getNodePamFdn() {
        return nodePamFdn;
    }

    public void setNodePamFdn(String nodePamFdn) {
        this.nodePamFdn = nodePamFdn;
    }

    public String getNodePamNameSpace() {
        return nodePamNameSpace;
    }

    public void setNodePamNameSpace(String nodePamNameSpace) {
        this.nodePamNameSpace = nodePamNameSpace;
    }

    public String getNodePamNameSpaceVersion() {
        return nodePamNameSpaceVersion;
    }

    public void setNodePamNameSpaceVersion(String nodePamNameSpaceVersion) {
        this.nodePamNameSpaceVersion = nodePamNameSpaceVersion;
    }

    public String getNodePamOperation() {
        return nodePamOperation;
    }

    public void setNodePamOperation(String nodePamOperation) {
        this.nodePamOperation = nodePamOperation;
    }

    public String getNodePamUsername() {
        return nodePamUsername;
    }

    public void setNodePamUsername(String nodePamUsername) {
        this.nodePamUsername = nodePamUsername;
    }

    public String getNodePamPassword() {
        return nodePamPassword;
    }

    public void setNodePamPassword(String nodePamPassword) {
        this.nodePamPassword = nodePamPassword;
    }

    public Long getNeJobId() {
        return neJobId;
    }

    public void setNeJobId(Long neJobId) {
        this.neJobId = neJobId;
    }

    public String getNodePamMoType() {
        return nodePamMoType;
    }

    public void setNodePamMoType(String nodePamMoType) {
        this.nodePamMoType = nodePamMoType;
    }

    public String getNodePamSubjectName() {
        return nodePamSubjectName;
    }

    public void setNodePamSubjectName(String nodePamSubjectName) {
        this.nodePamSubjectName = nodePamSubjectName;
    }

    public Boolean getNodePamRemoteManagement() {
        return nodePamRemoteManagement;
    }

    public void setNodePamRemoteManagement(Boolean nodePamRemoteManagement) {
        this.nodePamRemoteManagement = nodePamRemoteManagement;
    }

    public Boolean getNodePamRestrictMaintenanceUser() { return nodePamRestrictMaintenanceUser; }

    public void setNodePamRestrictMaintenanceUser(Boolean nodePamRestrictMaintenanceUser) {
        this.nodePamRestrictMaintenanceUser = nodePamRestrictMaintenanceUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NodePamMediationEvent that = (NodePamMediationEvent) o;
        return Objects.equals(nodePamRequestId, that.nodePamRequestId) && Objects.equals(nodePamFdn, that.nodePamFdn) && Objects.equals(nodePamMoType, that.nodePamMoType) && Objects.equals(nodePamNameSpace, that.nodePamNameSpace) && Objects.equals(nodePamNameSpaceVersion, that.nodePamNameSpaceVersion) && Objects.equals(nodePamOperation, that.nodePamOperation) && Objects.equals(nodePamSubjectName, that.nodePamSubjectName) && Objects.equals(nodePamUsername, that.nodePamUsername) && Objects.equals(nodePamPassword, that.nodePamPassword) && Objects.equals(nodePamRemoteManagement, that.nodePamRemoteManagement) && Objects.equals(nodePamRestrictMaintenanceUser, that.nodePamRestrictMaintenanceUser) && Objects.equals(neJobId, that.neJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nodePamRequestId, nodePamFdn, nodePamMoType, nodePamNameSpace, nodePamNameSpaceVersion, nodePamOperation, nodePamSubjectName, nodePamUsername, nodePamPassword, nodePamRemoteManagement, nodePamRestrictMaintenanceUser, neJobId);
    }

    @Override
    public String toString() {
        return "NodePamMediationEvent{" +
                "nodePamRequestId='" + nodePamRequestId + '\'' +
                ", nodePamFdn='" + nodePamFdn + '\'' +
                ", nodePamNameSpace='" + nodePamNameSpace + '\'' +
                ", nodePamNameSpaceVersion='" + nodePamNameSpaceVersion + '\'' +
                ", nodePamOperation='" + nodePamOperation + '\'' +
                ", nodePamUsername='" + OBSCURED_STRING + '\'' +
                ", nodePamPassword='" + OBSCURED_STRING + '\'' +
                ", neJobId=" + neJobId +
                ", nodePamMoType='" + nodePamMoType + '\'' +
                ", nodePamSubjectName='" + nodePamSubjectName + '\'' +
                ", nodePamRemoteManagement=" + nodePamRemoteManagement +
                ", nodePamRestrictMaintenanceUser=" + nodePamRestrictMaintenanceUser +
                '}';
    }

    public String toStringDebug() {
        return "NodePamMediationEvent{" +
                "nodePamRequestId='" + nodePamRequestId + '\'' +
                ", nodePamFdn='" + nodePamFdn + '\'' +
                ", nodePamNameSpace='" + nodePamNameSpace + '\'' +
                ", nodePamNameSpaceVersion='" + nodePamNameSpaceVersion + '\'' +
                ", nodePamOperation='" + nodePamOperation + '\'' +
                ", nodePamUsername='" + nodePamUsername + '\'' +
                ", nodePamPassword='" + nodePamPassword + '\'' +
                ", neJobId=" + neJobId +
                ", nodePamMoType='" + nodePamMoType + '\'' +
                ", nodePamSubjectName='" + nodePamSubjectName + '\'' +
                ", nodePamRemoteManagement=" + nodePamRemoteManagement +
                ", nodePamRestrictMaintenanceUser=" + nodePamRestrictMaintenanceUser +
                '}';
    }
}
