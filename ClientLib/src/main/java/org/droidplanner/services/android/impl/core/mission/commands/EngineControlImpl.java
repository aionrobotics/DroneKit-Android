package org.droidplanner.services.android.impl.core.mission.commands;

import com.mavlink.common.msg_mission_item;
import com.mavlink.enums.MAV_CMD;

import org.droidplanner.services.android.impl.core.mission.Mission;
import org.droidplanner.services.android.impl.core.mission.MissionItemImpl;
import org.droidplanner.services.android.impl.core.mission.MissionItemType;

import java.util.List;

/**
 * Created by Toby on 7/31/2015.
 */
public class EngineControlImpl extends MissionCMD{
    private int starter_control;
    private int unused;
    private int height_delay_cm;

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

    public EngineControlImpl(Mission mission, int starter_control, int unused, int height_delay_cm){
        super(mission);
        this.starter_control = starter_control;
        this.unused = unused;
        this.height_delay_cm  = height_delay_cm;
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

    public int getUnused() {
        return unused;
    }

    public void setUnused(int unused) { this.unused = unused; }

    @Override
    public void unpackMAVMessage(msg_mission_item mavMsg) {
        starter_control = (int)mavMsg.param1;
        unused = (int)mavMsg.param2;
        height_delay_cm = (int)mavMsg.param3;
    }

    @Override
    public List<msg_mission_item> packMissionItem() {
        List<msg_mission_item> list = super.packMissionItem();
        msg_mission_item mavMsg = list.get(0);
        mavMsg.command = MAV_CMD.MAV_CMD_DO_ENGINE_CONTROL;
        mavMsg.param1 = starter_control;
        mavMsg.param2 = unused;
        mavMsg.param3 = height_delay_cm;
        return list;
    }

    @Override
    public MissionItemType getType() {
        return MissionItemType.ENGINE_CONTROL;
    }
}
