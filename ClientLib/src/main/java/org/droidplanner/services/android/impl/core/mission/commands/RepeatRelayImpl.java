package org.droidplanner.services.android.impl.core.mission.commands;

import com.mavlink.common.msg_mission_item;
import com.mavlink.enums.MAV_CMD;

import org.droidplanner.services.android.impl.core.mission.Mission;
import org.droidplanner.services.android.impl.core.mission.MissionItemImpl;
import org.droidplanner.services.android.impl.core.mission.MissionItemType;

import java.util.List;

/**
 * Mavlink message builder for the 'RepeatRelay' mission item.
 * Repeat toggling a Relay pin’s voltage.
 */
public class RepeatRelayImpl extends MissionCMD {

    private int relayNumber;
    private int count;
    private int time;

    public RepeatRelayImpl(MissionItemImpl item){
        super(item);
    }

    public RepeatRelayImpl(msg_mission_item msg, Mission mission){
        super(mission);
        unpackMAVMessage(msg);
    }

    public RepeatRelayImpl(Mission mission, int relayNumber, int count, int time){
        super(mission);
        this.relayNumber = relayNumber;
        this.count = count;
        this.time = time;
    }

    @Override
    public MissionItemType getType(){
        return MissionItemType.SET_RELAY;
    }

    @Override
    public void unpackMAVMessage(msg_mission_item mavMsg){
        relayNumber = (int) mavMsg.param1;
        count = (int) mavMsg.param2;
        relayNumber = (int) mavMsg.param3;
    }

    @Override
    public List<msg_mission_item> packMissionItem(){
        List<msg_mission_item> list = super.packMissionItem();
        msg_mission_item mavMsg = list.get(0);
        mavMsg.command = MAV_CMD.MAV_CMD_DO_REPEAT_RELAY;
        mavMsg.param1 = relayNumber;
        mavMsg.param2 = count;
        mavMsg.param3 = time;
        return list;
    }

    public int getRelayNumber() {
        return relayNumber;
    }
    public int getCount() {
        return count;
    }
    public int getTime() {
        return time;
    }

    public void setRelayNumber(int value) {
        relayNumber = value;
    }
    public void setCount(int value) {
        count = value;
    }
    public void setTime(int value) {
        time = value;
    }
}
