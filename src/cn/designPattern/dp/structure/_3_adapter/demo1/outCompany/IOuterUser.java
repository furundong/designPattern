package cn.designPattern.dp.structure._3_adapter.demo1.outCompany;

import java.util.Map;

public interface IOuterUser {
    //������Ϣ���������ơ��Ա��ֻ������
    public Map getUserBaseInfo();
    //����������Ϣ
    public Map getUserOfficeInfo();
    //�û��ļ�ͥ��Ϣ
    public Map getUserHomeInfo();
}
