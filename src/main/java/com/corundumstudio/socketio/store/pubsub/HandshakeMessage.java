/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.corundumstudio.socketio.store.pubsub;

import java.util.UUID;

public class HandshakeMessage extends PubSubMessage {

    private static final long serialVersionUID = 5767127795325210150L;

    private UUID sessionId;

    public HandshakeMessage() {
    }

    public HandshakeMessage(UUID sessionId) {
        super();
        this.sessionId = sessionId;
    }

    public UUID getSessionId() {
        return sessionId;
    }

}
