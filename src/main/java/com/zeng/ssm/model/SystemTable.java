package com.zeng.ssm.model;

import java.util.List;

public class SystemTable {

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
