package com.luomor.coco.db.dao;

import com.luomor.coco.db.domain.CocoFootprint;
import com.luomor.coco.db.domain.CocoFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CocoFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    long countByExample(CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int insert(CocoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int insertSelective(CocoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    CocoFootprint selectOneByExample(CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    CocoFootprint selectOneByExampleSelective(@Param("example") CocoFootprintExample example, @Param("selective") CocoFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    List<CocoFootprint> selectByExampleSelective(@Param("example") CocoFootprintExample example, @Param("selective") CocoFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    List<CocoFootprint> selectByExample(CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    CocoFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CocoFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    CocoFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    CocoFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CocoFootprint record, @Param("example") CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CocoFootprint record, @Param("example") CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CocoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CocoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") CocoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}