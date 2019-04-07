package com.neusoft.bean.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "base_attr_info")
public class BaseAttrInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 属性名称
     */
    @Column(name = "attr_name")
    private String attrName;

    /**
     * 三级分类id
     */
    @Column(name = "catalog3_id")
    private Long catalog3Id;

    /**
     * 是否启用该属性
     */
    @Column(name = "is_enabled")
    private String isEnabled;



    public BaseAttrInfo() {
    }

    public BaseAttrInfo(Long id, String attrName, Long catalog3Id, String isEnabled) {
        this.id = id;
        this.attrName = attrName;
        this.catalog3Id = catalog3Id;
        this.isEnabled = isEnabled;
    }

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取属性名称
     *
     * @return attr_name - 属性名称
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 设置属性名称
     *
     * @param attrName 属性名称
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    /**
     * 获取三级分类id
     *
     * @return catalog3_id - 三级分类id
     */
    public Long getCatalog3Id() {
        return catalog3Id;
    }

    /**
     * 设置三级分类id
     *
     * @param catalog3Id 三级分类id
     */
    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    /**
     * 获取是否启用该属性
     *
     * @return is_enabled - 是否启用该属性
     */
    public String getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用该属性
     *
     * @param isEnabled 是否启用该属性
     */
    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    @Override
    public String toString() {
        return "BaseAttrInfo{" +
                "id=" + id +
                ", attrName='" + attrName + '\'' +
                ", catalog3Id=" + catalog3Id +
                ", isEnabled='" + isEnabled + '\'' +
                '}';
    }
}