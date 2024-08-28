package com.ericsson.oss.services.security.model.npam.pib;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinition;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinitions;
import com.ericsson.oss.itpf.modeling.annotation.configparam.Scope;

@EModel(namespace = "ModeledConfiguration", description = "ignore")
@ConfParamDefinitions
public class NpamServicePibParameters {
    @ConfParamDefinition(description = "NPAM Service Job housekeeping days", scope = Scope.GLOBAL)
    @DefaultValue("180")
    public Integer houseKeepingDays;
}
