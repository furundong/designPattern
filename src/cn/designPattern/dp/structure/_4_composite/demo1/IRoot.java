package cn.designPattern.dp.structure._4_composite.demo1;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 * <p>
 * 咱就先说个最常见的例子，公司的人事管理就是一个典型的树状结构，想想看你公司的组织架构
 * <p>
 * 从最高的老大，往下一层一层的管理，最后到我们这层小兵……很典型的树状结构（说
 * 明一下，这不是二叉树，有关二叉树的定义可以翻翻以前的教科书），我们今天的任务就是
 * 要把这个树状结构实现出来，并且还要把它遍历一遍，就类似于阅读你公司的人员花名册。
 * <p>
 * <p>
 * 从该树状结构上分析，有两种不同性质的节点：有分支的节点（如研发部经理）和无分
 * 支的节点（如员工A、员工D等），我们增加一点学术术语上去，总经理叫做根节点(是不是
 * 想到XML中的那个根节点root，那就对了)，类似研发部经理有分支的节点叫做树枝节点，类
 * 似员工A的无分支的节点叫做树叶节点，都很形象，三个类型的节点，那是不是定义三个类
 * 就可以？
 * <p>
 * <p>
 * 这个根节点的对象就是我们的总经理
 */
public interface IRoot {
    //得到总经理的信息
    public String getInfo();

    //总经理下边要有小兵，那要能增加小兵，比如研发部总经理，这是个树枝节点
    public void add(IBranch branch);

    //那要能增加树叶节点
    public void add(ILeaf leaf);

    //既然能增加，那还要能够遍历，不可能总经理不知道他手下有哪些人
    public ArrayList getSubordinateInfo();

}
