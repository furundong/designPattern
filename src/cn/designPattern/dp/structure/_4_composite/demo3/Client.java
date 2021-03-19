package cn.designPattern.dp.structure._4_composite.demo3;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Client {
    public static void main(String[] args) {
        Branch gmd = new Branch("总经理", "总经理", 10);
        Branch branch1 = new Branch("副总经理", "副总经理", 9);
        gmd.addSubordinate(branch1);
        Branch branch2 = new Branch("副2总经理", "副2总经理", 9);
        gmd.addSubordinate(branch2);
        Leaf leaf = new Leaf("项目经理", "项目经理", 8);
        branch2.addSubordinate(leaf);
        branch1.addSubordinate(new Leaf("副总经理的秘书", "副总经理的秘书", 5));
        System.out.println(gmd.toString());
        System.out.println(getTreeInfo(gmd));
    }

    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinate();
        StringBuilder info = new StringBuilder();
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) { //是员工就直接获得信息
                info.append(s.getInfo()).append("\n");
            } else { //是个小头目
                info.append(s.getInfo()).append("\n").append(getTreeInfo((Branch) s));
            }
        }
        return info.toString();
    }

}
