package entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by fangngng on 2016/1/21.
 */
@Entity
@Table(name = "OrderGoodsAL", schema = "dbo", catalog = "WashRoom")
public class OrderGoodsAlEntity {
    private int alid;
    private int goodsCount;
    private String isActive;
    private Timestamp createTime;

    @Id
    @Column(name = "ALID", nullable = false, insertable = true, updatable = true)
    public int getAlid() {
        return alid;
    }

    public void setAlid(int alid) {
        this.alid = alid;
    }

    @Basic
    @Column(name = "GoodsCount", nullable = false, insertable = true, updatable = true)
    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Basic
    @Column(name = "IsActive", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "CreateTime", nullable = true, insertable = true, updatable = true)
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

        OrderGoodsAlEntity that = (OrderGoodsAlEntity) o;

        if (alid != that.alid) return false;
        if (goodsCount != that.goodsCount) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = alid;
        result = 31 * result + goodsCount;
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
