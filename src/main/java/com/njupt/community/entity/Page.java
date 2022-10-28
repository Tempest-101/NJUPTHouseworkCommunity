package com.njupt.community.entity;

public class Page {
    private int current = 1;
    private int limit = 10;
    private int rows;
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1 && limit < 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getOffset(){
        return limit * (current - 1);
    }

    public int getTotal(){
        if(rows % limit == 0){
            return rows/limit;
        }else {
            return rows/limit + 1;
        }
    }
//获取显示跳转页码栏的起始页码，如4 5 6 7 8，返回4
    public int getFrom(){
        int from = current - 2;
        return (from < 1) ? 1 : from;
    }
//与上一个方法类似
    public int getTo(){
        int to = current + 2;
        return (to > getTotal()) ? getTotal() : to;
    }
}
