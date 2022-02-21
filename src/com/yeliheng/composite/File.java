package com.yeliheng.composite;

import java.util.List;

/**
 * 叶子节点：文件
 */
public class File implements TreeComponent{

    //文件名
    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    @Override
    public TreeComponent add(TreeComponent node) {
        //文件下不能新建文件或文件夹
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TreeComponent> getChildren() {
        return null;
    }

    @Override
    public void remove(TreeComponent node) {
        //文件下没有东西可供删除
        throw new UnsupportedOperationException();
    }
}
