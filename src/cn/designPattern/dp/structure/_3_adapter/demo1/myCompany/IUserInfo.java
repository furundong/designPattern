package cn.designPattern.dp.structure._3_adapter.demo1.myCompany;

/**
 * create by Freedom on 2021/2/7
 */
public interface IUserInfo {
    //����û�����
    public String getUserName();

    //��ü�ͥ��ַ
    public String getHomeAddress();

    //�ֻ����룬���̫��Ҫ���ֻ�����ѽ
    public String getMobileNumber();

    //�칫�绰��һ��������
    public String getOfficeTelNumber();

    //����˵�ְλ��ʲô
    public String getJobPosition();

    //��ü�ͥ�绰�����е㲻�ã��Ҳ�ϲ�����ͥ�绰���۹���
    public String getHomeTelNumber();
}
