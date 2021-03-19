package cn.designPattern.dp.structure._4_composite.demo3;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Client {
    public static void main(String[] args) {
        Branch gmd = new Branch("�ܾ���", "�ܾ���", 10);
        Branch branch1 = new Branch("���ܾ���", "���ܾ���", 9);
        gmd.addSubordinate(branch1);
        Branch branch2 = new Branch("��2�ܾ���", "��2�ܾ���", 9);
        gmd.addSubordinate(branch2);
        Leaf leaf = new Leaf("��Ŀ����", "��Ŀ����", 8);
        branch2.addSubordinate(leaf);
        branch1.addSubordinate(new Leaf("���ܾ��������", "���ܾ��������", 5));
        System.out.println(gmd.toString());
        System.out.println(getTreeInfo(gmd));
    }

    //����������,ֻҪ���Ҹ��ڵ㣬�Ҿ��ܱ��������еĽڵ�
    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinate();
        StringBuilder info = new StringBuilder();
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) { //��Ա����ֱ�ӻ����Ϣ
                info.append(s.getInfo()).append("\n");
            } else { //�Ǹ�СͷĿ
                info.append(s.getInfo()).append("\n").append(getTreeInfo((Branch) s));
            }
        }
        return info.toString();
    }

}
