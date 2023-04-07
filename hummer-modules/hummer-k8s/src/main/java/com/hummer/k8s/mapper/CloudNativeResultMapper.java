package com.hummer.k8s.mapper;

import com.hummer.common.core.domain.CloudNativeResult;
import com.hummer.common.core.domain.CloudNativeResultExample;
import com.hummer.common.core.domain.CloudNativeResultWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudNativeResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    long countByExample(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int deleteByExample(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int insert(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int insertSelective(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    List<CloudNativeResultWithBLOBs> selectByExampleWithBLOBs(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    List<CloudNativeResult> selectByExample(CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    CloudNativeResultWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int updateByExampleSelective(@Param("record") CloudNativeResultWithBLOBs record, @Param("example") CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") CloudNativeResultWithBLOBs record, @Param("example") CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int updateByExample(@Param("record") CloudNativeResult record, @Param("example") CloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int updateByPrimaryKeySelective(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(CloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result
     *
     * @mbg.generated Sat Apr 08 05:16:39 CST 2023
     */
    int updateByPrimaryKey(CloudNativeResult record);
}
