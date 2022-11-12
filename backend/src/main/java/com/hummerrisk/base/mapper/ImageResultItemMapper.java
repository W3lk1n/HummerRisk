package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.ImageResultItem;
import com.hummerrisk.base.domain.ImageResultItemExample;
import com.hummerrisk.base.domain.ImageResultItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageResultItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    long countByExample(ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int deleteByExample(ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int insert(ImageResultItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int insertSelective(ImageResultItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    List<ImageResultItemWithBLOBs> selectByExampleWithBLOBs(ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    List<ImageResultItem> selectByExample(ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    ImageResultItemWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int updateByExampleSelective(@Param("record") ImageResultItemWithBLOBs record, @Param("example") ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") ImageResultItemWithBLOBs record, @Param("example") ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int updateByExample(@Param("record") ImageResultItem record, @Param("example") ImageResultItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int updateByPrimaryKeySelective(ImageResultItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(ImageResultItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_item
     *
     * @mbg.generated Sat Nov 12 19:37:41 CST 2022
     */
    int updateByPrimaryKey(ImageResultItem record);
}