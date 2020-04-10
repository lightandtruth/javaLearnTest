package com.cdsxt.ego.beans;


public class TreeNode {
    //商品类目的id
    private Long id;
    //商品类目的名称
    private String text;
    //商品类目的状态
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
