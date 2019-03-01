package cn.eeka.sharedservices.common.entity;

import java.time.LocalDateTime;

/**
 * @ClassName: BaseEntity
 * @Description: 实体类基类，所有实体类必须继承BaseEntity
 * @author: SimonWayne
 * @date: 2019/3/1 10:46
 */
public class BaseEntity {

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private String createUserId;

    private String updateUserId;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
