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
package com.codebrig.beam.unit.connection.traversal.punch.udp;

import com.codebrig.beam.connection.traversal.punch.udp.server.UDPPunchServer;

/**
 * @author Brandon Fergerson <brandon.fergerson@codebrig.com>
 */
public class TestUDPPunchServer
{

    public static final int TEST_PUNCH_SERVER_PORT = 33333;

    public static final String TEST_PUNCH_PEER_IDENTIFIER = "TEST_IDENT";
    public static final String TEST_PUNCH_PEER_ACCESS_CODE = "SECRET";
    public static final int TEST_PUNCH_MESSAGE_TYPE = 1;

    public static void main (String[] args) {
        UDPPunchServer punchServer = new UDPPunchServer ("Test Punch Server", TEST_PUNCH_SERVER_PORT);
        punchServer.start ();
    }

}
