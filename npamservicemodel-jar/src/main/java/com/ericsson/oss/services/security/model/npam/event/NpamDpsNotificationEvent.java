/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2017
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.oss.services.security.model.npam.event;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;

/**
 * Channel for events processed by UlSpectrumAnalyzerNotificationListener in order to manage Uplink Spectrum File Collection.
 */
@EModel(name = "NpamDpsNotificationEvent",
        description = "Channel for events processed by listener")
@ChannelDefinition(channelType = ChannelType.PUBLISH_SUBSCRIBE, channelURI = "jms:/topic/NodePamTopic")
public class NpamDpsNotificationEvent {}