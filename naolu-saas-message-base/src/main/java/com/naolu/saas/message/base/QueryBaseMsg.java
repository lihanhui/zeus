package com.naolu.saas.message.base;

/**
 * Created by Administrator on 2018/11/26.
 */
public class QueryBaseMsg {
    private UserIdMsg userId;
    private Integer auditStatus;
    private Long createDate;
    private Boolean dateAscending;
    private Integer pageNumber;
    private Integer pageSize;

    public UserIdMsg getUserId() {
        return userId;
    }

    public void setUserId(UserIdMsg userId) {
        this.userId = userId;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Boolean getDateAscending() {
        return dateAscending;
    }

    public void setDateAscending(Boolean dateAscending) {
        this.dateAscending = dateAscending;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

	@Override
	public String toString() {
		return "QueryBaseMsg [userId=" + userId + ", auditStatus=" + auditStatus + ", createDate=" + createDate
				+ ", dateAscending=" + dateAscending + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
	}
}
