package models;

import java.util.Date;

public class Meter extends BaseEntity{
    private Date startTime;
    private Date endTime;
    private int unitConsumed;
    private int ratePerUnit;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }

    public int getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(int ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }
}
