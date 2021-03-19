package cn.designPattern.dp.structure._4_composite.demo2;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public interface IBranch extends ICorp {
    //�ܹ�����С������Ҷ�ڵ㣩�����Ǿ�����֦�ڵ㣩
    public void addSubordinate(ICorp corp);

    //�һ�Ҫ�ܹ������������Ϣ
    public ArrayList<ICorp> getSubordinate();
    /*������Ӧ����һ������delSubordinate(ICorp corp)��ɾ������
     * �����������û���õ��Ͳ�д������
     */
}
