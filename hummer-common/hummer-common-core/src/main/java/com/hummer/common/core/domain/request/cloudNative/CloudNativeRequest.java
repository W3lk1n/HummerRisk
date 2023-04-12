package com.hummer.common.core.domain.request.cloudNative;

import com.hummer.common.core.utils.FuzzyQuery;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

/**
 * harris
 */
public class CloudNativeRequest {

    @ApiModelProperty("ID")
    private String id;

    @ApiModelProperty(value = "云原生账号名称,模糊匹配")
    @FuzzyQuery
    private String name;

    @ApiModelProperty("插件ID")
    private String pluginId;

    @ApiModelProperty("插件名称")
    private String pluginName;

    @ApiModelProperty(value = "状态", allowableValues = "VALID,INVALID,DELETED")
    private String status;

    @ApiModelProperty(value = "排序key", hidden = true)
    private String sort;

    @ApiModelProperty("创建时间")
    private Integer createTimeStart;

    @ApiModelProperty("创建时间")
    private Integer createTimeEnd;

    @ApiModelProperty("更新时间")
    private Integer updateTimeStart;

    @ApiModelProperty("更新时间")
    private Integer updateTimeEnd;

    private String userName;

    private Map<String, Object> combine;

    private String resultId;

    private List<String> k8sGroups;

    private List<Integer> ruleGroups;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Integer createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Integer getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Integer createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Integer getUpdateTimeStart() {
        return updateTimeStart;
    }

    public void setUpdateTimeStart(Integer updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
    }

    public Integer getUpdateTimeEnd() {
        return updateTimeEnd;
    }

    public void setUpdateTimeEnd(Integer updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public Map<String, Object> getCombine() {
        return combine;
    }

    public void setCombine(Map<String, Object> combine) {
        this.combine = combine;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getK8sGroups() {
        return k8sGroups;
    }

    public void setK8sGroups(List<String> k8sGroups) {
        this.k8sGroups = k8sGroups;
    }

    public List<Integer> getRuleGroups() {
        return ruleGroups;
    }

    public void setRuleGroups(List<Integer> ruleGroups) {
        this.ruleGroups = ruleGroups;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }
}
