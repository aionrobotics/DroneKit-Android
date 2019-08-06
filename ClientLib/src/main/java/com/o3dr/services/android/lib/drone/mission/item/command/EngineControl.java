package com.o3dr.services.android.lib.drone.mission.item.command;

import android.os.Parcel;

import com.o3dr.services.android.lib.drone.mission.MissionItemType;
import com.o3dr.services.android.lib.drone.mission.item.MissionItem;

/**
 * Created by Toby on 7/31/2015.
 */
public class EngineControl extends MissionItem implements MissionItem.Command, android.os.Parcelable {
    private int starter_control;
    private int unused;
    private int height_delay_cm;

    public EngineControl(){ super(MissionItemType.ENGINE_CONTROL); }

    public EngineControl(int starter_control, int unused, int height_delay_cm) {
        super(MissionItemType.ENGINE_CONTROL);
        this.starter_control = starter_control;
        this.unused = unused;
        this.height_delay_cm = height_delay_cm;
    }

    public EngineControl(EngineControl copy){
        this();
        this.starter_control = copy.starter_control;
        this.unused = copy.unused;
        this.height_delay_cm = copy.height_delay_cm;
    }

    protected EngineControl(Parcel in) {
        super(in);
        starter_control = in.readInt();
        unused = in.readInt();
        height_delay_cm = in.readInt();
    }

    @Override
    public String toString() {
        return "EngineControl{" +
                "starter_control=" + starter_control +
                ", unused=" + unused +
                ", height_delay_cm=" + height_delay_cm +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EngineControl)) return false;
        if (!super.equals(o)) return false;

        EngineControl engineControl = (EngineControl) o;

        if (starter_control != engineControl.starter_control) return false;
        if (unused != engineControl.unused) return false;
        return height_delay_cm == engineControl.height_delay_cm;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + starter_control;
        result = 31 * result + unused;
        result = 31 * result + height_delay_cm;
        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(starter_control);
        dest.writeInt(unused);
        dest.writeInt(height_delay_cm);
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

    public int getUnused() {
        return unused;
    }

    public void setUnused(int unused) {
        this.unused = unused;
    }

    public int getHeightDelayCm() {
        return height_delay_cm;
    }

    public void setHeightDelayCm(int height_delay_cm) { this.height_delay_cm = height_delay_cm; }

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
