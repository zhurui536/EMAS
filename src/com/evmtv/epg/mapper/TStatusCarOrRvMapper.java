package com.evmtv.epg.mapper;

import com.evmtv.epg.entity.TStatusCarOrRv;
import com.evmtv.epg.entity.TStatusCarOrRvExample;
import com.evmtv.epg.response.MyTask;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TStatusCarOrRvMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int countByExample(TStatusCarOrRvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int deleteByExample(TStatusCarOrRvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int insert(TStatusCarOrRv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int insertSelective(TStatusCarOrRv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    List<TStatusCarOrRv> selectByExample(TStatusCarOrRvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    TStatusCarOrRv selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int updateByExampleSelective(@Param("record") TStatusCarOrRv record, @Param("example") TStatusCarOrRvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int updateByExample(@Param("record") TStatusCarOrRv record, @Param("example") TStatusCarOrRvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int updateByPrimaryKeySelective(TStatusCarOrRv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_status_car_or_rv
     *
     * @mbggenerated Mon Dec 02 18:03:31 CST 2013
     */
    int updateByPrimaryKey(TStatusCarOrRv record);
    /**
     * 我的任务
     * @param record
     * @return
     */
    List<MyTask> selectMyTask(TStatusCarOrRv record);

	/**
	 * @param record
	 * @return
	 */
	int countMyTask(TStatusCarOrRv record);
}