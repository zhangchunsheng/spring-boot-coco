package com.luomor.coco.db.dao;

import com.luomor.coco.db.domain.CocoLog;
import com.luomor.coco.db.domain.CocoLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CocoLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    long countByExample(CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int deleteByExample(CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int insert(CocoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int insertSelective(CocoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    CocoLog selectOneByExample(CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    CocoLog selectOneByExampleSelective(@Param("example") CocoLogExample example, @Param("selective") CocoLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    List<CocoLog> selectByExampleSelective(@Param("example") CocoLogExample example, @Param("selective") CocoLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    List<CocoLog> selectByExample(CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    CocoLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CocoLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    CocoLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    CocoLog selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CocoLog record, @Param("example") CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CocoLog record, @Param("example") CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CocoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CocoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") CocoLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_log
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}