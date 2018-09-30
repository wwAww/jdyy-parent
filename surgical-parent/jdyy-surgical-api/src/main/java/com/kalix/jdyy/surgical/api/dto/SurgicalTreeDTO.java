package com.kalix.jdyy.surgical.api.dto;

import com.kalix.framework.core.api.web.model.BaseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurgicalTreeDTO extends BaseDTO {
    private String content;  //回复内容
    private Boolean leaf; //是否是叶子节点
    private Long parentId;  // 父节点
    private String parentName; //父节点姓名
    private List<SurgicalTreeDTO> children = new ArrayList<SurgicalTreeDTO>(); //子回复

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public List<SurgicalTreeDTO> getChildren() {
        return children;
    }

    public void setChildren(List<SurgicalTreeDTO> children) {
        this.children = children;
    }
}
