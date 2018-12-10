/*
*Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/
package org.apache.ode.scheduler.simple;

import java.util.List;

public interface ODECluster {
    /*
    Provides clustering related operations
    This will be implemented by BPEL server.
    Added to fix BPS-675
     */
    public boolean isClusterEnabled();

    public List<String> getKnownNodes();

    public boolean isLeader();

    /**
     * Remove member from the cluster
     *
     * @param nodeId
     */
    public void removeMember(String nodeId);

    /**
     * Check whether this node is the Manager Node of the cluster
     *
     * @return
     */
    public boolean isManager();

    /**
     * Retrieve leader node of the cluster
     *
     * @return
     */
    public String getLeader();
}
