/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server.cluster.listener;

import java.time.Clock;
import org.springframework.context.ApplicationEvent;

/**
 * @author funkye
 */
public class ClusterChangeEvent extends ApplicationEvent {

    private String group;

    private boolean leader;

    private long term;

    public ClusterChangeEvent(Object source, String group, long term, boolean leader) {
        super(source);
        this.group = group;
        this.term = term;
        this.leader = leader;
    }

    public ClusterChangeEvent(Object source, String group) {
        super(source);
        this.group = group;
    }

    public ClusterChangeEvent(Object source, Clock clock) {
        super(source, clock);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public long getTerm() {
        return term;
    }

    public void setTerm(long term) {
        this.term = term;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }
}
