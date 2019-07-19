package org.droidplanner.services.android.impl.core.MAVLink.connection;

import com.mavlink.MAVLinkPacket;

import com.o3dr.services.android.lib.gcs.link.LinkConnectionStatus;

/**
 * Provides updates about the mavlink connection.
 */
public interface MavLinkConnectionListener {
    /**
     * Called when data is received via the mavlink connection.
     *
     * @param packet received data
     */
    void onReceivePacket(MAVLinkPacket packet);

    /**
     * Provides information about communication error.
     *
     * @param connectionStatus error information
     */
    void onConnectionStatus(LinkConnectionStatus connectionStatus);


    /**
     * Provides information about mavlink stats
     */
    void onMavlinkStatsUpdate(int receivedCount, int crcErrorCount, int lostPacketCount);
}
