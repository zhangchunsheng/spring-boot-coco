package com.luomor.coco.db.dao;

import com.luomor.coco.db.domain.CocoKeyword;
import com.luomor.coco.db.domain.CocoKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CocoKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    long countByExample(CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int insert(CocoKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int insertSelective(CocoKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    CocoKeyword selectOneByExample(CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    CocoKeyword selectOneByExampleSelective(@Param("example") CocoKeywordExample example, @Param("selective") CocoKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    List<CocoKeyword> selectByExampleSelective(@Param("example") CocoKeywordExample example, @Param("selective") CocoKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    List<CocoKeyword> selectByExample(CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    CocoKeyword selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CocoKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    CocoKeyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    CocoKeyword selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CocoKeyword record, @Param("example") CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CocoKeyword record, @Param("example") CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CocoKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CocoKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") CocoKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coco_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}