package com.evmtv.epg.entity;

import java.util.ArrayList;
import java.util.List;

import com.evmtv.epg.request.BaseRequest;
import com.evmtv.epg.utils.CollectionUtills;

public class TSourceReleaseVersion extends BaseRequest{
	
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = -7928175959468560604L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source_release_version.ID
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    private Long id;
    
    private List<Long> sources;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source_release_version.FReleaseVersionId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    private Long freleaseversionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source_release_version.FSourceId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    private Long fsourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_source_release_version.FBranchId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    private Long fbranchid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_source_release_version.ID
     *
     * @return the value of t_source_release_version.ID
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_source_release_version.ID
     *
     * @param id the value for t_source_release_version.ID
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_source_release_version.FReleaseVersionId
     *
     * @return the value of t_source_release_version.FReleaseVersionId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public Long getFreleaseversionid() {
        return freleaseversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_source_release_version.FReleaseVersionId
     *
     * @param freleaseversionid the value for t_source_release_version.FReleaseVersionId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public void setFreleaseversionid(Long freleaseversionid) {
        this.freleaseversionid = freleaseversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_source_release_version.FSourceId
     *
     * @return the value of t_source_release_version.FSourceId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public Long getFsourceid() {
        return fsourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_source_release_version.FSourceId
     *
     * @param fsourceid the value for t_source_release_version.FSourceId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public void setFsourceid(Long fsourceid) {
        this.fsourceid = fsourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_source_release_version.FBranchId
     *
     * @return the value of t_source_release_version.FBranchId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public Long getFbranchid() {
        return fbranchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_source_release_version.FBranchId
     *
     * @param fbranchid the value for t_source_release_version.FBranchId
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    public void setFbranchid(Long fbranchid) {
        this.fbranchid = fbranchid;
    }

	public List<TSourceReleaseVersion> getSources() {
		
		List<TSourceReleaseVersion> vs = new ArrayList<TSourceReleaseVersion>();
		if(CollectionUtills.hasElements(sources)){
			for(Long sid : sources){
				TSourceReleaseVersion v = new TSourceReleaseVersion();
				v.setFbranchid(fbranchid);
				v.setFreleaseversionid(freleaseversionid);
				v.setFsourceid(sid);
				vs.add(v);
			}
		}
		
		return vs;
	}

	public void setSources(List<Long> sources) {
		this.sources = sources;
	}
}