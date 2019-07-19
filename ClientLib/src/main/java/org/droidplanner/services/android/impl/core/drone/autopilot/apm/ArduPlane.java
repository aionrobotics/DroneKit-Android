package org.droidplanner.services.android.impl.core.drone.autopilot.apm;

import android.content.Context;
import android.os.Handler;

import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.common.msg_global_position_int;
import com.mavlink.common.msg_vfr_hud;
import com.mavlink.enums.MAV_TYPE;

import org.droidplanner.services.android.impl.communication.model.DataLink;
import org.droidplanner.services.android.impl.core.drone.LogMessageListener;
import org.droidplanner.services.android.impl.core.firmware.FirmwareType;
import org.droidplanner.services.android.impl.core.model.AutopilotWarningParser;

/**
 * Created by Fredia Huya-Kouadio on 7/27/15.
 */
public class ArduPlane extends ArduPilot {
    static final String TAG = ArduPlane.class.getSimpleName();

    public ArduPlane(String droneId, Context context, DataLink.DataLinkProvider<MAVLinkMessage> mavClient, Handler handler, AutopilotWarningParser warningParser, LogMessageListener logListener) {
        super(droneId, context, mavClient, handler, warningParser, logListener);
    }

    @Override
    public int getType(){
        return MAV_TYPE.MAV_TYPE_FIXED_WING;
    }

    @Override
    protected void setType(int type){}

    @Override
    public FirmwareType getFirmwareType() {
        return FirmwareType.ARDU_PLANE;
    }

    @Override
    protected void processVfrHud(msg_vfr_hud vfrHud){
        // Note: Don't use vfrHud altitude, it seems grossly inaccurate.
        setGroundAndAirSpeeds(vfrHud.groundspeed, vfrHud.airspeed, vfrHud.climb);
    }

    /**
     * Used to update the vehicle location, and altitude.
     * @param gpi
     */
    @Override
    protected void processGlobalPositionInt(msg_global_position_int gpi){
        if(gpi == null)
            return;

        super.processGlobalPositionInt(gpi);

        final double relativeAlt = gpi.relative_alt / 1000.0;

//        final double groundSpeedX = gpi.vx / 100.0;
//        final double groundSpeedY = gpi.vy / 100.0;
//        final double groundSpeed = Math.sqrt(Math.pow(groundSpeedX, 2) + Math.pow(groundSpeedY, 2));
//
//        final double climbRate = gpi.vz / 100.0;
        setAltitudes(relativeAlt);
    }
}
