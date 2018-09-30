package com.kalix.jdyy.surgical.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jdyy_surgical")
public class SurgicalBean extends PersistentEntity {
    private String content;  //内容
    private long isLeaf;    //是否是子节点
    private long parentId;    //父节点

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(long isLeaf) {
        this.isLeaf = isLeaf;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
}
