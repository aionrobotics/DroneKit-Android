package org.droidplanner.services.android.impl.core.mission.commands;

import com.mavlink.common.msg_mission_item;

import org.droidplanner.services.android.impl.core.mission.Mission;
import org.droidplanner.services.android.impl.core.mission.MissionItemImpl;

import java.util.List;

public abstract class MissionCMD extends MissionItemImpl {

	public MissionCMD(Mission mission) {
		super(mission);
	}

	public MissionCMD(MissionItemImpl item) {
		super(item);
	}

	@Override
	public List<msg_mission_item> packMissionItem() {
		return super.packMissionItem();
	}

}