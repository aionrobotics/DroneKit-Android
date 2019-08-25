package org.droidplanner.services.android.impl.core.mission.commands;

import com.mavlink.common.msg_mission_item;
import com.mavlink.enums.MAV_CMD;

import org.droidplanner.services.android.impl.core.mission.Mission;
import org.droidplanner.services.android.impl.core.mission.MissionItemImpl;
import org.droidplanner.services.android.impl.core.mission.MissionItemType;

import java.util.List;

/**
 * Created by Tom on 8/6/2019.
 */
public class EngineControlImpl extends MissionCMD{
    private int starter_control;
    private int cold_start;
    private int height_delay_cm;
    private int gear_state;

    public EngineControlImpl(MissionItemImpl item){
        super(item);
    }

    public EngineControlImpl(Mission mission) {
        super(mission);
    }

    public EngineControlImpl(msg_mission_item mavMsg, Mission mission){
        super(mission);
        unpackMAVMessage(mavMsg);
    }

    public EngineControlImpl(Mission mission, int starter_control, int cold_start, int height_delay_cm, int gear_state) {
        super(mission);
        this.starter_control = starter_control;
        this.cold_start = cold_start;
        this.height_delay_cm  = height_delay_cm;
        this.gear_state = gear_state;
    }

    public int getStarterControl() {
        return starter_control;
    }

    public void setStarterControl(int starter_control) {
        this.starter_control = starter_control;
    }

    public int getHeightDelayCm() {
        return height_delay_cm;
    }

    public void setHeightDelayCm(int height_delay_cm) {
        this.height_delay_cm = height_delay_cm;
    }

    public int getColdStart() {
        return cold_start;
    }

    public void setColdStart(int cold_start) { this.cold_start = cold_start; }

    public int getGearState() { return gear_state; }

    public void setGearState(int cold_start) { this.gear_state = gear_state; }

    @Override
    public void unpackMAVMessage(msg_mission_item mavMsg) {
        starter_control = (int)mavMsg.param1;
        cold_start = (int)mavMsg.param2;
        height_delay_cm = (int)mavMsg.param3;
        gear_state = (int)mavMsg.param4;
    }

    @Override
    public List<msg_mission_item> packMissionItem() {
        List<msg_mission_item> list = super.packMissionItem();
        msg_mission_item mavMsg = list.get(0);
        mavMsg.command = MAV_CMD.MAV_CMD_DO_ENGINE_CONTROL;
        mavMsg.param1 = starter_control;
        mavMsg.param2 = cold_start;
        mavMsg.param3 = height_delay_cm;
        mavMsg.param4 = gear_state;
        return list;
    }

    @Override
    public MissionItemType getType() {
        return MissionItemType.ENGINE_CONTROL;
    }
}
