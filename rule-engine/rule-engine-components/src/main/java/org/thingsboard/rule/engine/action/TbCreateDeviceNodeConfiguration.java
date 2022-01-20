/**
 * Copyright © 2016-2021 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.rule.engine.action;

import lombok.Data;
import org.thingsboard.rule.engine.api.NodeConfiguration;

@Data
public class TbCreateDeviceNodeConfiguration extends TbAbstractCreateEntityNodeConfiguration implements NodeConfiguration<TbCreateDeviceNodeConfiguration> {

    private boolean gateway;
    private boolean overwriteActivityTime;

    @Override
    public TbCreateDeviceNodeConfiguration defaultConfiguration() {
        TbCreateDeviceNodeConfiguration configuration = new TbCreateDeviceNodeConfiguration();
        configuration.setName("");
        configuration.setType("");
        configuration.setLabel("");
        configuration.setDescription("");
        configuration.setGateway(false);
        configuration.setOverwriteActivityTime(false);
        return configuration;
    }
}