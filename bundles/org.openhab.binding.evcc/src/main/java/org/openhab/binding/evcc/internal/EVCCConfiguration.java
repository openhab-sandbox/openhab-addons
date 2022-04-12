/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.evcc.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * The {@link EVCCConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Florian Hotze - Initial contribution
 */
@NonNullByDefault
public class EVCCConfiguration {

    /**
     * Hostname or IP address of the evcc instance.
     */
    public @Nullable String host;
    /**
     * Interval for state fetching.
     */
    public int refreshInterval = 600;
}
