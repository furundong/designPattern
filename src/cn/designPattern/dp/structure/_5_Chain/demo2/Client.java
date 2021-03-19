package cn.designPattern.dp.structure._5_Chain.demo2;

import java.util.ArrayList;
import java.util.Random;

/**
 * create by Freedom on 2021/3/8
 */
public class Client {
    public static void main(String[] args) {
        //�����ѡ����Ů��
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4),
                    "��Ҫ��ȥ���"));
        }
//����������ʾ����
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
//������ʾ˳��
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
/*
���Ҳ��ȷ��ҵ�������ClientҲ����ȥ���жϵ�������Ҫ˭ȥ��������Handler����
���������Լ���������ȥ��ֻ��Ҫ��չ���������ѣ���������Բ����˽�仯���̣�����
��˭�ڴ���������󶼲���֪����������ģʽ�£���ʹ�ִ�����һ��С̫�ô�Խ���Ŵ�
���������ʱ�����������ʱ��ͻȻŤת��������ͻȻħ�����飩���ԡ������ĵ¡�û���κ�
�˽�Ҳ�������ɵ�Ӧ��������ֻҪ��ʾ���׾Ϳ����ˣ��ø��״���͸��״������ø��״�
������´��ݡ������������ģʽ��

�Ż���:
    �ͻ��˻������Ż����     husband.setNext(son);
    ������������û�в��ü���, ���Խ���Ҫ�������������, �Զ�ȥ����, (servlet����Ĺ��������������ʽ)
    ���Ĵ��������,
 */
