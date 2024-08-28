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
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtDefinition;
import com.ericsson.oss.services.security.model.npam.NPamModelsConstants;

import java.util.List;

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "NEInfo", version = NPamModelsConstants.VERSION, description = "Information of NEs on which Job has to run")
@CdtDefinition
public class NEInfo {

    @EModelAttribute(description = "List of Collection Names")
    @CdtAttribute
    public List<String> collectionNames;

    @EModelAttribute(description = "List of NE Names")
    @CdtAttribute
    public List<String> neNames;

    @EModelAttribute(description = "List of SavedSearch Ids")
    @CdtAttribute
    public List<String> savedSearchIds;

    //EMARDEP PER ME NON SERVONO
//    @EModelAttribute(description = "List of NeNames With components selected")
//    @CdtAttribute
//    public List<NeWithComponentInfo> neWithComponentInfo;
//
//    @EModelAttribute(description = "List of NE types and it's component activity details")
//    @CdtAttribute
//    public List<NeTypeComponentActivityDetails> neTypeComponentActivityDetails;

}