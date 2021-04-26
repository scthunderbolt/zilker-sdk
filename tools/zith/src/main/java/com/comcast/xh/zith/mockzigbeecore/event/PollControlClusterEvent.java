/*
 * Copyright 2021 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */


package com.comcast.xh.zith.mockzigbeecore.event;

//
// created by jwatt on 7/1/19
//

import com.comcast.xh.zith.device.cluster.MockPollControlCluster;

public class PollControlClusterEvent extends ClusterCommandEvent
{
    private static final int POLL_CONTROL_CHECKIN_COMMAND_ID = 0x00;

    public PollControlClusterEvent(MockPollControlCluster cluster)
    {
        super(cluster.getEui64(), cluster.getEndpointId(), cluster.getClusterId(), cluster.isServer(), POLL_CONTROL_CHECKIN_COMMAND_ID);
    }
}