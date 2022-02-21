package com.yeliheng.composite;

import java.util.List;

/**
 * 抽象组件：用于保持树枝和叶子的一致性
 */
public interface TreeComponent {

    TreeComponent add(TreeComponent node);

    List<TreeComponent> getChildren();

    void remove(TreeComponent node);

}
