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
@Table(name = "LoginUser", schema = "dbo", catalog = "WashRoom")
public class LoginUserEntity {
    private int loginId;
    private String loginName;
    private String loginPwd;
    private String isActive;
    private Timestamp lastLogintime;
    private Integer loginCount;
    private Timestamp createTime;
    private String createBy;

    @Basic
    @Column(name = "LoginID")
    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    @Basic
    @Column(name = "LoginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "LoginPwd")
    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
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
    @Column(name = "LastLogintime")
    public Timestamp getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Timestamp lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    @Basic
    @Column(name = "LoginCount")
    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "CreateBy")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginUserEntity that = (LoginUserEntity) o;

        if (loginId != that.loginId) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (loginPwd != null ? !loginPwd.equals(that.loginPwd) : that.loginPwd != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (lastLogintime != null ? !lastLogintime.equals(that.lastLogintime) : that.lastLogintime != null)
            return false;
        if (loginCount != null ? !loginCount.equals(that.loginCount) : that.loginCount != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loginId;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (loginPwd != null ? loginPwd.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (lastLogintime != null ? lastLogintime.hashCode() : 0);
        result = 31 * result + (loginCount != null ? loginCount.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        return result;
    }
}
