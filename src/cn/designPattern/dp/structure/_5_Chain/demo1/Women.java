package cn.designPattern.dp.structure._5_Chain.demo1;

/**
 * create by Freedom on 2021/3/8
 */
public class Women implements IWomen {
    /*
     * ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״��
     * 1--δ����
     * 2--����
     * 3--����
     */
    private int type = 0;
    //��Ů����ʾ
    private String request = "";

    //���캯�����ݹ�������
    public Women(int _type, String _request) {
        this.type = _type;
        this.request = _request;
    }

    //����Լ���״��
    public int getType() {
        return this.type;
    }

    //��ø�Ů������
    public String getRequest() {
        return this.request;
    }
}
