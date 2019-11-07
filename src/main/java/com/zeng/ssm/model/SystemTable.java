package com.zeng.ssm.model;

import com.zeng.ssm.common.Model;

import java.util.List;

public class SystemTable implements Model {

    private String tableName;
    private String tableComment;
    private List<SystemColumn> systemColumnList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public List<SystemColumn> getSystemColumnList() {
        return systemColumnList;
    }

    public void setSystemColumnList(List<SystemColumn> systemColumnList) {
        this.systemColumnList = systemColumnList;
    }
}
