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

@EModel(namespace = NPamModelsConstants.NAME_SPACE, name = "Schedule", version = NPamModelsConstants.VERSION, description = "Scheduling Mode and Attributes")
@CdtDefinition
public class Schedule {	
	
	@EModelAttribute(description = "Execution Mode")
	@CdtAttribute
	public JobExecMode execMode;
	
	@EModelAttribute(description = "Schedule Attributes")
	@CdtAttribute
	public List<ScheduleProperty> scheduleAttributes;

}