package com.luomor.coco.db.dao;

import com.luomor.coco.db.domain.CocoCategory;
import com.luomor.coco.db.domain.CocoCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CocoCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    long countByExample(CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int deleteByExample(CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int insert(CocoCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int insertSelective(CocoCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    CocoCategory selectOneByExample(CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    CocoCategory selectOneByExampleSelective(@Param("example") CocoCategoryExample example, @Param("selective") CocoCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    List<CocoCategory> selectByExampleSelective(@Param("example") CocoCategoryExample example, @Param("selective") CocoCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    List<CocoCategory> selectByExample(CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    CocoCategory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CocoCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    CocoCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    CocoCategory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CocoCategory record, @Param("example") CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CocoCategory record, @Param("example") CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CocoCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CocoCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") CocoCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_category
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}