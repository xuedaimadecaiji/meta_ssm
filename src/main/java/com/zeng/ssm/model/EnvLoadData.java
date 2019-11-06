package com.zeng.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EnvLoadData {

    private Integer id;
    private Integer sceneDataId;
    private Integer envLoadId;
    private Integer unitId;
    private String value;
    private String description;
    private Unit unit;
    private EnvLoad envLoad;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date updatedAt;

    private int deviceId;
    private Device device;
    private int collectReasonId;
    private CollectReason collectReason;
    private int monitorRangeId;
    private MonitorRange monitorRange;
    private String frequency;
    private String location;
    private int collectMethodId;
    private CollectMethod collectMethod;
    private String time;
    private String reliability;

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public int getCollectReasonId() {
        return collectReasonId;
    }

    public void setCollectReasonId(int collectReasonId) {
        this.collectReasonId = collectReasonId;
    }

    public CollectReason getCollectReason() {
        return collectReason;
    }

    public void setCollectReason(CollectReason collectReason) {
        this.collectReason = collectReason;
    }

    public int getMonitorRangeId() {
        return monitorRangeId;
    }

    public void setMonitorRangeId(int monitorRangeId) {
        this.monitorRangeId = monitorRangeId;
    }

    public MonitorRange getMonitorRange() {
        return monitorRange;
    }

    public void setMonitorRange(MonitorRange monitorRange) {
        this.monitorRange = monitorRange;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCollectMethodId() {
        return collectMethodId;
    }

    public void setCollectMethodId(int collectMethodId) {
        this.collectMethodId = collectMethodId;
    }

    public CollectMethod getCollectMethod() {
        return collectMethod;
    }

    public void setCollectMethod(CollectMethod collectMethod) {
        this.collectMethod = collectMethod;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneDataId() {
        return sceneDataId;
    }

    public void setSceneDataId(Integer sceneDataId) {
        this.sceneDataId = sceneDataId;
    }


    public Integer getEnvLoadId() {
        return envLoadId;
    }

    public void setEnvLoadId(Integer envLoadId) {
        this.envLoadId = envLoadId;
    }

    public EnvLoad getEnvLoad() {
        return envLoad;
    }

    public void setEnvLoad(EnvLoad envLoad) {
        this.envLoad = envLoad;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
