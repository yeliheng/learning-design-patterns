package com.yeliheng.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点：文件夹
 */
public class Directory implements TreeComponent{
    //文件夹名
    private String name;
    //列表
    private List<TreeComponent> list = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public TreeComponent add(TreeComponent node) {
        list.add(node);
        return this;
    }

    @Override
    public List<TreeComponent> getChildren() {
        return list;
    }

    @Override
    public void remove(TreeComponent node) {
        list.remove(node);
    }
}
