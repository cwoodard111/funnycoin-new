/*
 * Copyright © 2014-2015 CodeBrig, LLC.
 * http://www.codebrig.com/
 *
 * Beam - Client/Server & P2P Networking Library
 *
 * ====
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * ====
 */
package com.codebrig.beam.system.messages;

import com.codebrig.beam.messages.BeamMessage;
import com.codebrig.beam.messages.SystemMessageType;
import com.codebrig.beam.messages.SystemMessage;

/**
 * @author Brandon Fergerson <brandon.fergerson@codebrig.com>
 */
public class HandshakeMessage extends SystemMessage
{

    public HandshakeMessage (String clientVersion, long currentTime, boolean clientTunneled) {
        super (SystemMessageType.BEAM_HANDSHAKE);

        setString ("version", clientVersion);
        setLong ("local_time", currentTime);
        setBoolean ("tunnel_connection", clientTunneled);
    }

    public HandshakeMessage (BeamMessage beamMessage) {
        super (beamMessage, false, true);
    }

    public String getVersion () {
        return getString ("version");
    }

    public long getLocalTime () {
        return getLong ("local_time");
    }

    public boolean isTunnelConnection () {
        return getBoolean ("tunnel_connection");
    }

}
