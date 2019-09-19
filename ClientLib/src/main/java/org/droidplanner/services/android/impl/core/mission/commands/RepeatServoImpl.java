package org.droidplanner.services.android.impl.core.mission.commands;

import com.mavlink.common.msg_mission_item;
import com.mavlink.enums.MAV_CMD;

import org.droidplanner.services.android.impl.core.mission.Mission;
import org.droidplanner.services.android.impl.core.mission.MissionItemImpl;
import org.droidplanner.services.android.impl.core.mission.MissionItemType;

import java.util.List;

public class RepeatServoImpl extends MissionCMD {

	private int pwm;
	private int channel;
	private int count;
	private int time;

	public RepeatServoImpl(MissionItemImpl item) {
		super(item);
	}

	public RepeatServoImpl(msg_mission_item msg, Mission mission) {
		super(mission);
		unpackMAVMessage(msg);
	}

	public RepeatServoImpl(Mission mission, int channel, int pwm, int count, int time) {
		super(mission);
		this.channel = channel;
		this.pwm = pwm;
		this.count = count;
		this.time = time;
	}
	

	@Override
	public void unpackMAVMessage(msg_mission_item mavMsg) {
		channel = (int) mavMsg.param1;
		pwm = (int) mavMsg.param2;
		count = (int) mavMsg.param3;
		time = (int) mavMsg.param4;
	}

	@Override
	public MissionItemType getType() {
		return MissionItemType.REPEAT_SERVO;
	}

	@Override
	public List<msg_mission_item> packMissionItem() {
		List<msg_mission_item> list = super.packMissionItem();
		msg_mission_item mavMsg = list.get(0);
		mavMsg.command = MAV_CMD.MAV_CMD_DO_REPEAT_SERVO;
		mavMsg.param1 = channel;
		mavMsg.param2 = pwm;
		mavMsg.param3 = count;
		mavMsg.param4 = time;
		return list;
	}

	public int getPwm() {
		return pwm;
	}
	public int getChannel() {
		return channel;
	}
	public int getCount() { return count; }
	public int getTime() {
		return time;
	}

	public void setPwm(int value) { pwm = value; }
	public void setChannel(int value) { channel = value; }
	public void setCount(int value) { count = value; }
	public void setTime(int value) { time = value; }
}
