package cn.designPattern.dp.structure._4_composite.demo1;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 * <p>
 * �۾���˵����������ӣ���˾�����¹�������һ�����͵���״�ṹ�����뿴�㹫˾����֯�ܹ�
 * <p>
 * ����ߵ��ϴ�����һ��һ��Ĺ���������������С�������ܵ��͵���״�ṹ��˵
 * ��һ�£��ⲻ�Ƕ��������йض������Ķ�����Է�����ǰ�Ľ̿��飩�����ǽ�����������
 * Ҫ�������״�ṹʵ�ֳ��������һ�Ҫ��������һ�飬���������Ķ��㹫˾����Ա�����ᡣ
 * <p>
 * <p>
 * �Ӹ���״�ṹ�Ϸ����������ֲ�ͬ���ʵĽڵ㣺�з�֧�Ľڵ㣨���з������������޷�
 * ֧�Ľڵ㣨��Ա��A��Ա��D�ȣ�����������һ��ѧ��������ȥ���ܾ����������ڵ�(�ǲ���
 * �뵽XML�е��Ǹ����ڵ�root���ǾͶ���)�������з��������з�֧�Ľڵ������֦�ڵ㣬��
 * ��Ա��A���޷�֧�Ľڵ������Ҷ�ڵ㣬���������������͵Ľڵ㣬���ǲ��Ƕ���������
 * �Ϳ��ԣ�
 * <p>
 * <p>
 * ������ڵ�Ķ���������ǵ��ܾ���
 */
public interface IRoot {
    //�õ��ܾ�������Ϣ
    public String getInfo();

    //�ܾ����±�Ҫ��С������Ҫ������С���������з����ܾ��������Ǹ���֦�ڵ�
    public void add(IBranch branch);

    //��Ҫ��������Ҷ�ڵ�
    public void add(ILeaf leaf);

    //��Ȼ�����ӣ��ǻ�Ҫ�ܹ��������������ܾ�����֪������������Щ��
    public ArrayList getSubordinateInfo();

}