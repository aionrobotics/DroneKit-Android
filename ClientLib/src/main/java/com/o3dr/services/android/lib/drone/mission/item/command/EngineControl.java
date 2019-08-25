package com.o3dr.services.android.lib.drone.mission.item.command;

import android.os.Parcel;

import com.o3dr.services.android.lib.drone.mission.MissionItemType;
import com.o3dr.services.android.lib.drone.mission.item.MissionItem;

/**
 * Created by Tom on 8/6/2019.
 */
public class EngineControl extends MissionItem implements MissionItem.Command, android.os.Parcelable {
    private int starter_control;
    private int cold_start;
    private int height_delay_cm;
    private int gear_state;

    public EngineControl(){ super(MissionItemType.ENGINE_CONTROL); }

    public EngineControl(int starter_control, int cold_start, int height_delay_cm, int gear_state) {
        super(MissionItemType.ENGINE_CONTROL);
        this.starter_control = starter_control;
        this.cold_start = cold_start;
        this.height_delay_cm = height_delay_cm;
        this.gear_state = gear_state;
    }

    public EngineControl(EngineControl copy){
        this();
        this.starter_control = copy.starter_control;
        this.cold_start = copy.cold_start;
        this.height_delay_cm = copy.height_delay_cm;
        this.gear_state = copy.gear_state;
    }

    protected EngineControl(Parcel in) {
        super(in);
        starter_control = in.readInt();
        cold_start = in.readInt();
        height_delay_cm = in.readInt();
        gear_state = in.readInt();
    }

    @Override
    public String toString() {
        return "EngineControl{" +
                "starter_control=" + starter_control +
                ", cold_start=" + cold_start +
                ", height_delay_cm=" + height_delay_cm +
                ", gear_state=" + gear_state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EngineControl)) return false;
        if (!super.equals(o)) return false;

        EngineControl engineControl = (EngineControl) o;

        if (starter_control != engineControl.starter_control) return false;
        if (cold_start != engineControl.cold_start) return false;
        if (gear_state != engineControl.gear_state) return false;
        return height_delay_cm == engineControl.height_delay_cm;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + starter_control;
        result = 31 * result + cold_start;
        result = 31 * result + height_delay_cm;
        result = 31 * result + gear_state;
        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(starter_control);
        dest.writeInt(cold_start);
        dest.writeInt(height_delay_cm);
        dest.writeInt(gear_state);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public int getStarterControl() {
        return starter_control;
    }

    public void setStarterControl(int starter_control) {
        this.starter_control = starter_control;
    }

    public int getColdStart() { return cold_start; }

    public void setColdStart(int cold_start) {
        this.cold_start = cold_start;
    }

    public int getHeightDelayCm() {
        return height_delay_cm;
    }

    public void setHeightDelayCm(int height_delay_cm) { this.height_delay_cm = height_delay_cm; }

    public int getGearState() {
        return gear_state;
    }

    public void setGearState(int gear_state) { this.gear_state = gear_state; }

    public static final Creator<EngineControl> CREATOR = new Creator<EngineControl>() {
        @Override
        public EngineControl createFromParcel(Parcel in) {
            return new EngineControl(in);
        }

        @Override
        public EngineControl[] newArray(int size) {
            return new EngineControl[size];
        }
    };

    @Override
    public MissionItem clone() {
        return new EngineControl(this);
    }
}
