package com.evmtv.epg.entity;

public class TNodeStatus extends TNode{
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = 4574980780260690822L;


    private String userName;//用户名
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FNodeId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fnodeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FUserId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FStatus
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private String fstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FCreateTime
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private String fcreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FContractAdvId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fcontractadvid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FContractId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fcontractid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FSourceId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fsourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FContractAdvResourceId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fcontractadvresourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FBranchId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fbranchid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FReleaseVersionId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long freleaseversionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FParentId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private Long fparentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FNodeTitle
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private String fnodetitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_node_status.FRemark
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    private String fremark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FNodeId
     *
     * @return the value of t_node_status.FNodeId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFnodeid() {
        return fnodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FNodeId
     *
     * @param fnodeid the value for t_node_status.FNodeId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFnodeid(Long fnodeid) {
        this.fnodeid = fnodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FUserId
     *
     * @return the value of t_node_status.FUserId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFuserid() {
        return fuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FUserId
     *
     * @param fuserid the value for t_node_status.FUserId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFuserid(Long fuserid) {
        this.fuserid = fuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FStatus
     *
     * @return the value of t_node_status.FStatus
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public String getFstatus() {
        return fstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FStatus
     *
     * @param fstatus the value for t_node_status.FStatus
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFstatus(String fstatus) {
        this.fstatus = fstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FCreateTime
     *
     * @return the value of t_node_status.FCreateTime
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public String getFcreatetime() {
        return fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FCreateTime
     *
     * @param fcreatetime the value for t_node_status.FCreateTime
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFcreatetime(String fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FContractAdvId
     *
     * @return the value of t_node_status.FContractAdvId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFcontractadvid() {
        return fcontractadvid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FContractAdvId
     *
     * @param fcontractadvid the value for t_node_status.FContractAdvId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFcontractadvid(Long fcontractadvid) {
        this.fcontractadvid = fcontractadvid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FContractId
     *
     * @return the value of t_node_status.FContractId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFcontractid() {
        return fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FContractId
     *
     * @param fcontractid the value for t_node_status.FContractId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFcontractid(Long fcontractid) {
        this.fcontractid = fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FSourceId
     *
     * @return the value of t_node_status.FSourceId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFsourceid() {
        return fsourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FSourceId
     *
     * @param fsourceid the value for t_node_status.FSourceId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFsourceid(Long fsourceid) {
        this.fsourceid = fsourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FContractAdvResourceId
     *
     * @return the value of t_node_status.FContractAdvResourceId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFcontractadvresourceid() {
        return fcontractadvresourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FContractAdvResourceId
     *
     * @param fcontractadvresourceid the value for t_node_status.FContractAdvResourceId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFcontractadvresourceid(Long fcontractadvresourceid) {
        this.fcontractadvresourceid = fcontractadvresourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FBranchId
     *
     * @return the value of t_node_status.FBranchId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFbranchid() {
        return fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FBranchId
     *
     * @param fbranchid the value for t_node_status.FBranchId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFbranchid(Long fbranchid) {
        this.fbranchid = fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FReleaseVersionId
     *
     * @return the value of t_node_status.FReleaseVersionId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFreleaseversionid() {
        return freleaseversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FReleaseVersionId
     *
     * @param freleaseversionid the value for t_node_status.FReleaseVersionId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFreleaseversionid(Long freleaseversionid) {
        this.freleaseversionid = freleaseversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FParentId
     *
     * @return the value of t_node_status.FParentId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public Long getFparentid() {
        return fparentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FParentId
     *
     * @param fparentid the value for t_node_status.FParentId
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFparentid(Long fparentid) {
        this.fparentid = fparentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FNodeTitle
     *
     * @return the value of t_node_status.FNodeTitle
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public String getFnodetitle() {
        return fnodetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FNodeTitle
     *
     * @param fnodetitle the value for t_node_status.FNodeTitle
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFnodetitle(String fnodetitle) {
        this.fnodetitle = fnodetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_node_status.FRemark
     *
     * @return the value of t_node_status.FRemark
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public String getFremark() {
        return fremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_node_status.FRemark
     *
     * @param fremark the value for t_node_status.FRemark
     *
     * @mbggenerated Mon Dec 02 13:40:29 CST 2013
     */
    public void setFremark(String fremark) {
        this.fremark = fremark;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}