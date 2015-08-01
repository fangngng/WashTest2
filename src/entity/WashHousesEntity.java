package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by fangng on 2015/7/9.
 */
@Entity
@Table(name = "WashHouses", schema = "dbo", catalog = "WashRoom")
public class WashHousesEntity {
    private int washHouseId;
    private String washHouseName;
    private String summary;
    private String xCoordinate;
    private String yCoordinate;
    private String washHouseAddr;
    private String washHousePhone;
    private String washHouseMiniName;
    private String isActive;
    private Timestamp createTime;

    @Basic
    @Column(name = "WashHouseID")
    public int getWashHouseId() {
        return washHouseId;
    }

    public void setWashHouseId(int washHouseId) {
        this.washHouseId = washHouseId;
    }

    @Basic
    @Column(name = "WashHouseName")
    public String getWashHouseName() {
        return washHouseName;
    }

    public void setWashHouseName(String washHouseName) {
        this.washHouseName = washHouseName;
    }

    @Basic
    @Column(name = "Summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "XCoordinate")
    public String getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(String xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    @Basic
    @Column(name = "YCoordinate")
    public String getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(String yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Basic
    @Column(name = "WashHouseAddr")
    public String getWashHouseAddr() {
        return washHouseAddr;
    }

    public void setWashHouseAddr(String washHouseAddr) {
        this.washHouseAddr = washHouseAddr;
    }

    @Basic
    @Column(name = "WashHousePhone")
    public String getWashHousePhone() {
        return washHousePhone;
    }

    public void setWashHousePhone(String washHousePhone) {
        this.washHousePhone = washHousePhone;
    }

    @Basic
    @Column(name = "WashHouseMiniName")
    public String getWashHouseMiniName() {
        return washHouseMiniName;
    }

    public void setWashHouseMiniName(String washHouseMiniName) {
        this.washHouseMiniName = washHouseMiniName;
    }

    @Basic
    @Column(name = "IsActive")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WashHousesEntity that = (WashHousesEntity) o;

        if (washHouseId != that.washHouseId) return false;
        if (washHouseName != null ? !washHouseName.equals(that.washHouseName) : that.washHouseName != null)
            return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (xCoordinate != null ? !xCoordinate.equals(that.xCoordinate) : that.xCoordinate != null) return false;
        if (yCoordinate != null ? !yCoordinate.equals(that.yCoordinate) : that.yCoordinate != null) return false;
        if (washHouseAddr != null ? !washHouseAddr.equals(that.washHouseAddr) : that.washHouseAddr != null)
            return false;
        if (washHousePhone != null ? !washHousePhone.equals(that.washHousePhone) : that.washHousePhone != null)
            return false;
        if (washHouseMiniName != null ? !washHouseMiniName.equals(that.washHouseMiniName) : that.washHouseMiniName != null)
            return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = washHouseId;
        result = 31 * result + (washHouseName != null ? washHouseName.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (xCoordinate != null ? xCoordinate.hashCode() : 0);
        result = 31 * result + (yCoordinate != null ? yCoordinate.hashCode() : 0);
        result = 31 * result + (washHouseAddr != null ? washHouseAddr.hashCode() : 0);
        result = 31 * result + (washHousePhone != null ? washHousePhone.hashCode() : 0);
        result = 31 * result + (washHouseMiniName != null ? washHouseMiniName.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
