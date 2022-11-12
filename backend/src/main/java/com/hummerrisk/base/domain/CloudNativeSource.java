package com.hummerrisk.base.domain;

import java.io.Serializable;

public class CloudNativeSource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.id
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.cloud_native_id
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String cloudNativeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.source_name
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String sourceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.source_namespace
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String sourceNamespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.source_type
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.source_node
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String sourceNode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.create_time
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.update_time
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source.creator
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_source
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.id
     *
     * @return the value of cloud_native_source.id
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.id
     *
     * @param id the value for cloud_native_source.id
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.cloud_native_id
     *
     * @return the value of cloud_native_source.cloud_native_id
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getCloudNativeId() {
        return cloudNativeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.cloud_native_id
     *
     * @param cloudNativeId the value for cloud_native_source.cloud_native_id
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setCloudNativeId(String cloudNativeId) {
        this.cloudNativeId = cloudNativeId == null ? null : cloudNativeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.source_name
     *
     * @return the value of cloud_native_source.source_name
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.source_name
     *
     * @param sourceName the value for cloud_native_source.source_name
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.source_namespace
     *
     * @return the value of cloud_native_source.source_namespace
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getSourceNamespace() {
        return sourceNamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.source_namespace
     *
     * @param sourceNamespace the value for cloud_native_source.source_namespace
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setSourceNamespace(String sourceNamespace) {
        this.sourceNamespace = sourceNamespace == null ? null : sourceNamespace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.source_type
     *
     * @return the value of cloud_native_source.source_type
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.source_type
     *
     * @param sourceType the value for cloud_native_source.source_type
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.source_node
     *
     * @return the value of cloud_native_source.source_node
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getSourceNode() {
        return sourceNode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.source_node
     *
     * @param sourceNode the value for cloud_native_source.source_node
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setSourceNode(String sourceNode) {
        this.sourceNode = sourceNode == null ? null : sourceNode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.create_time
     *
     * @return the value of cloud_native_source.create_time
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.create_time
     *
     * @param createTime the value for cloud_native_source.create_time
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.update_time
     *
     * @return the value of cloud_native_source.update_time
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.update_time
     *
     * @param updateTime the value for cloud_native_source.update_time
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source.creator
     *
     * @return the value of cloud_native_source.creator
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source.creator
     *
     * @param creator the value for cloud_native_source.creator
     *
     * @mbg.generated Sun Nov 13 00:25:08 CST 2022
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}