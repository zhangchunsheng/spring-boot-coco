package com.luomor.coco.db.dao;

import com.luomor.coco.db.domain.CocoTopic;
import com.luomor.coco.db.domain.CocoTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CocoTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    long countByExample(CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int deleteByExample(CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int insert(CocoTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int insertSelective(CocoTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    CocoTopic selectOneByExample(CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    CocoTopic selectOneByExampleSelective(@Param("example") CocoTopicExample example, @Param("selective") CocoTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    CocoTopic selectOneByExampleWithBLOBs(CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    List<CocoTopic> selectByExampleSelective(@Param("example") CocoTopicExample example, @Param("selective") CocoTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    List<CocoTopic> selectByExampleWithBLOBs(CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    List<CocoTopic> selectByExample(CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    CocoTopic selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CocoTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    CocoTopic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    CocoTopic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CocoTopic record, @Param("example") CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") CocoTopic record, @Param("example") CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CocoTopic record, @Param("example") CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CocoTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CocoTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CocoTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") CocoTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}