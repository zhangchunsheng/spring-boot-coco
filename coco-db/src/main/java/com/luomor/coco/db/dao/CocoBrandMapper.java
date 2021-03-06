package com.luomor.coco.db.dao;

import com.luomor.coco.db.domain.CocoBrand;
import com.luomor.coco.db.domain.CocoBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CocoBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    long countByExample(CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int deleteByExample(CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int insert(CocoBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int insertSelective(CocoBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    CocoBrand selectOneByExample(CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    CocoBrand selectOneByExampleSelective(@Param("example") CocoBrandExample example, @Param("selective") CocoBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    List<CocoBrand> selectByExampleSelective(@Param("example") CocoBrandExample example, @Param("selective") CocoBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    List<CocoBrand> selectByExample(CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    CocoBrand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CocoBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    CocoBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    CocoBrand selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CocoBrand record, @Param("example") CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CocoBrand record, @Param("example") CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CocoBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CocoBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") CocoBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}