package org.droidplanner.services.android.impl.core.mission.commands;

import com.mavlink.common.msg_mission_item;
import com.mavlink.enums.MAV_CMD;

import org.droidplanner.services.android.impl.core.mission.Mission;
import org.droidplanner.services.android.impl.core.mission.MissionItemImpl;
import org.droidplanner.services.android.impl.core.mission.MissionItemType;

import java.util.List;

/**
 * Created by Tom on 8/7/2019.
 */
public class DelayImpl extends MissionCMD {
    private float seconds = 1;
    private int UTChour = -1;
    private int UTCminute = -1;
    private int UTCsecond = -1;

    public DelayImpl(MissionItemImpl item){
        super(item);
    }

    public DelayImpl(Mission mission) {
        super(mission);
    }

    public DelayImpl(msg_mission_item mavMsg, Mission mission){
        super(mission);
        unpackMAVMessage(mavMsg);
    }

    public DelayImpl(Mission mission, float seconds, int UTChour, int UTCminute, int UTCsecond) {
        super(mission);
        this.seconds = seconds;
        this.UTChour = UTChour;
        this.UTCminute = UTCminute;
        this.UTCsecond = UTCsecond;
    }
    public float getSeconds() { return seconds; }
    public void setSeconds(final float seconds) { this.seconds = seconds; }

    public int getUTChour() {
        return UTChour;
    }
    public void setUTChour(int UTChour) { this.UTChour = UTChour; }

    public int getUTCminute() {
        return UTCminute;
    }
    public void setUTCminute(int UTCminute) { this.UTCminute = UTCminute; }

    public int getUTCsecond() {
        return UTCsecond;
    }
    public void setUTCsecond(int UTCsecond) { this.UTCsecond = UTCsecond; }

    @Override
    public void unpackMAVMessage(msg_mission_item mavMsg) {
        this.seconds = mavMsg.param1;
        this.UTChour = (int)mavMsg.param2;
        this.UTCminute = (int)mavMsg.param3;
        this.UTCsecond = (int)mavMsg.param4;
    }

    @Override
    public List<msg_mission_item> packMissionItem() {
        List<msg_mission_item> list = super.packMissionItem();
        msg_mission_item mavMsg = list.get(0);
        mavMsg.command = MAV_CMD.MAV_CMD_NAV_DELAY;
        mavMsg.param1 = this.seconds;
        mavMsg.param2 = this.UTChour;
        mavMsg.param3 = this.UTCminute;
        mavMsg.param4 = this.UTCsecond;
        return list;
    }

    @Override
    public MissionItemType getType() {
        return MissionItemType.DELAY;
    }
}
