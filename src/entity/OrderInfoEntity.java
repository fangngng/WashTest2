package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by fangng on 2015/7/9.
 */
@Entity
@Table(name = "OrderInfo", schema = "dbo", catalog = "WashRoom")
public class OrderInfoEntity {
    private int orderId;
    private Timestamp orderCreateDate;
    private Integer userId;
    private Timestamp orderEndDate;
    private String orderStatus;
    private String orderIsPayed;
    private BigDecimal orderMoney;
    private BigDecimal orderPayedMoney;
    private BigDecimal orderCoupons;
    private String payMethod;
    private String isActive;
    private Timestamp createTime;

    @Basic
    @Column(name = "OrderID")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "OrderCreateDate")
    public Timestamp getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setOrderCreateDate(Timestamp orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "OrderEndDate")
    public Timestamp getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Timestamp orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    @Basic
    @Column(name = "OrderStatus")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "OrderIsPayed")
    public String getOrderIsPayed() {
        return orderIsPayed;
    }

    public void setOrderIsPayed(String orderIsPayed) {
        this.orderIsPayed = orderIsPayed;
    }

    @Basic
    @Column(name = "OrderMoney")
    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    @Basic
    @Column(name = "OrderPayedMoney")
    public BigDecimal getOrderPayedMoney() {
        return orderPayedMoney;
    }

    public void setOrderPayedMoney(BigDecimal orderPayedMoney) {
        this.orderPayedMoney = orderPayedMoney;
    }

    @Basic
    @Column(name = "OrderCoupons")
    public BigDecimal getOrderCoupons() {
        return orderCoupons;
    }

    public void setOrderCoupons(BigDecimal orderCoupons) {
        this.orderCoupons = orderCoupons;
    }

    @Basic
    @Column(name = "PayMethod")
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
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

        OrderInfoEntity that = (OrderInfoEntity) o;

        if (orderId != that.orderId) return false;
        if (orderCreateDate != null ? !orderCreateDate.equals(that.orderCreateDate) : that.orderCreateDate != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (orderEndDate != null ? !orderEndDate.equals(that.orderEndDate) : that.orderEndDate != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (orderIsPayed != null ? !orderIsPayed.equals(that.orderIsPayed) : that.orderIsPayed != null) return false;
        if (orderMoney != null ? !orderMoney.equals(that.orderMoney) : that.orderMoney != null) return false;
        if (orderPayedMoney != null ? !orderPayedMoney.equals(that.orderPayedMoney) : that.orderPayedMoney != null)
            return false;
        if (orderCoupons != null ? !orderCoupons.equals(that.orderCoupons) : that.orderCoupons != null) return false;
        if (payMethod != null ? !payMethod.equals(that.payMethod) : that.payMethod != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderCreateDate != null ? orderCreateDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (orderEndDate != null ? orderEndDate.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (orderIsPayed != null ? orderIsPayed.hashCode() : 0);
        result = 31 * result + (orderMoney != null ? orderMoney.hashCode() : 0);
        result = 31 * result + (orderPayedMoney != null ? orderPayedMoney.hashCode() : 0);
        result = 31 * result + (orderCoupons != null ? orderCoupons.hashCode() : 0);
        result = 31 * result + (payMethod != null ? payMethod.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
