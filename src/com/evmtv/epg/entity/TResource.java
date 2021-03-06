package com.evmtv.epg.entity;

import com.evmtv.epg.request.ResourceExpandRequest;

public class TResource extends ResourceExpandRequest{
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = 1801153409183825843L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.ID
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FCreateTime
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fcreatetime;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FCreateUserId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Long fcreateuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FUpdateTime
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fupdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FUpdateUserId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Long fupdateuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FFreezed
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String ffreezed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FDeleted
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fdeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FChecked
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fchecked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FGUID
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fguid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FType
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String ftype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FWidth
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fwidth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FHeight
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fheight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FPath
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FName
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FFileFormat
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Integer ffileformat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FScrollType
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Integer fscrolltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FSpeed
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fspeed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FBackColor
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fbackcolor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FFontColor
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String ffontcolor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FAdvClassId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Long fadvclassid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FDefinition
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private String fdefinition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FBranchId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Long fbranchid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_resource.FContrackId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    private Long fcontractid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.ID
     *
     * @return the value of t_resource.ID
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.ID
     *
     * @param id the value for t_resource.ID
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FCreateTime
     *
     * @return the value of t_resource.FCreateTime
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFcreatetime() {
        return fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FCreateTime
     *
     * @param fcreatetime the value for t_resource.FCreateTime
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFcreatetime(String fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FCreateUserId
     *
     * @return the value of t_resource.FCreateUserId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Long getFcreateuserid() {
        return fcreateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FCreateUserId
     *
     * @param fcreateuserid the value for t_resource.FCreateUserId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFcreateuserid(Long fcreateuserid) {
        this.fcreateuserid = fcreateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FUpdateTime
     *
     * @return the value of t_resource.FUpdateTime
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFupdatetime() {
        return fupdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FUpdateTime
     *
     * @param fupdatetime the value for t_resource.FUpdateTime
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFupdatetime(String fupdatetime) {
        this.fupdatetime = fupdatetime;
    }


	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FUpdateUserId
     *
     * @return the value of t_resource.FUpdateUserId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Long getFupdateuserid() {
        return fupdateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FUpdateUserId
     *
     * @param fupdateuserid the value for t_resource.FUpdateUserId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFupdateuserid(Long fupdateuserid) {
        this.fupdateuserid = fupdateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FFreezed
     *
     * @return the value of t_resource.FFreezed
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFfreezed() {
        return ffreezed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FFreezed
     *
     * @param ffreezed the value for t_resource.FFreezed
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFfreezed(String ffreezed) {
        this.ffreezed = ffreezed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FDeleted
     *
     * @return the value of t_resource.FDeleted
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFdeleted() {
        return fdeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FDeleted
     *
     * @param fdeleted the value for t_resource.FDeleted
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFdeleted(String fdeleted) {
        this.fdeleted = fdeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FChecked
     *
     * @return the value of t_resource.FChecked
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFchecked() {
        return fchecked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FChecked
     *
     * @param fchecked the value for t_resource.FChecked
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFchecked(String fchecked) {
        this.fchecked = fchecked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FGUID
     *
     * @return the value of t_resource.FGUID
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFguid() {
        return fguid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FGUID
     *
     * @param fguid the value for t_resource.FGUID
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFguid(String fguid) {
        this.fguid = fguid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FType
     *
     * @return the value of t_resource.FType
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FType
     *
     * @param ftype the value for t_resource.FType
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FWidth
     *
     * @return the value of t_resource.FWidth
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFwidth() {
        return fwidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FWidth
     *
     * @param fwidth the value for t_resource.FWidth
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFwidth(String fwidth) {
        this.fwidth = fwidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FHeight
     *
     * @return the value of t_resource.FHeight
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFheight() {
        return fheight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FHeight
     *
     * @param fheight the value for t_resource.FHeight
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFheight(String fheight) {
        this.fheight = fheight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FPath
     *
     * @return the value of t_resource.FPath
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFpath() {
        return fpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FPath
     *
     * @param fpath the value for t_resource.FPath
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFpath(String fpath) {
        this.fpath = fpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FName
     *
     * @return the value of t_resource.FName
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFname() {
        return fname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FName
     *
     * @param fname the value for t_resource.FName
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FFileFormat
     *
     * @return the value of t_resource.FFileFormat
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Integer getFfileformat() {
        return ffileformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FFileFormat
     *
     * @param ffileformat the value for t_resource.FFileFormat
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFfileformat(Integer ffileformat) {
        this.ffileformat = ffileformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FScrollType
     *
     * @return the value of t_resource.FScrollType
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Integer getFscrolltype() {
        return fscrolltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FScrollType
     *
     * @param fscrolltype the value for t_resource.FScrollType
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFscrolltype(Integer fscrolltype) {
        this.fscrolltype = fscrolltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FSpeed
     *
     * @return the value of t_resource.FSpeed
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFspeed() {
        return fspeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FSpeed
     *
     * @param fspeed the value for t_resource.FSpeed
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFspeed(String fspeed) {
        this.fspeed = fspeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FBackColor
     *
     * @return the value of t_resource.FBackColor
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFbackcolor() {
        return fbackcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FBackColor
     *
     * @param fbackcolor the value for t_resource.FBackColor
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFbackcolor(String fbackcolor) {
        this.fbackcolor = fbackcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FFontColor
     *
     * @return the value of t_resource.FFontColor
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFfontcolor() {
        return ffontcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FFontColor
     *
     * @param ffontcolor the value for t_resource.FFontColor
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFfontcolor(String ffontcolor) {
        this.ffontcolor = ffontcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FAdvClassId
     *
     * @return the value of t_resource.FAdvClassId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Long getFadvclassid() {
        return fadvclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FAdvClassId
     *
     * @param fadvclassid the value for t_resource.FAdvClassId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFadvclassid(Long fadvclassid) {
        this.fadvclassid = fadvclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FDefinition
     *
     * @return the value of t_resource.FDefinition
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public String getFdefinition() {
        return fdefinition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FDefinition
     *
     * @param fdefinition the value for t_resource.FDefinition
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFdefinition(String fdefinition) {
        this.fdefinition = fdefinition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FBranchId
     *
     * @return the value of t_resource.FBranchId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Long getFbranchid() {
        return fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FBranchId
     *
     * @param fbranchid the value for t_resource.FBranchId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFbranchid(Long fbranchid) {
        this.fbranchid = fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_resource.FContrackId
     *
     * @return the value of t_resource.FContrackId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public Long getFcontractid() {
        return fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_resource.FContrackId
     *
     * @param fcontrackid the value for t_resource.FContrackId
     *
     * @mbggenerated Fri Jul 12 17:34:02 CST 2013
     */
    public void setFcontractid(Long fcontractid) {
        this.fcontractid = fcontractid;
    }
}