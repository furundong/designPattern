package cn.designPattern.dp.structure._3_adapter.demo1.myCompany;

/**
 * create by Freedom on 2021/2/7
 */
public class UserInfo implements IUserInfo {
    /*
     * ��ü�ͥ��ַ����������Ҳ�����ҵ��ط�
     */
    public String getHomeAddress() {
        System.out.println("������Ա���ļ�ͥ��ַ... ");
        return null;
    }

    /*
     * ��ü�ͥ�绰����
     */
    public String getHomeTelNumber() {
        System.out.println("Ա���ļ�ͥ�绰��... ");
        return null;
    }

    /*
     * Ա����ְλ���ǲ��ž�������ְͨԱ
     */
    public String getJobPosition() {
        System.out.println("����˵�ְλ��BOSS... ");
        return null;
    }

    /*
     * �ֻ�����
     */
    public String getMobileNumber() {
        System.out.println("����˵��ֻ�������0000... ");
        return null;
    }

    /*
     * �칫�ҵ绰�������ʱ�����"��С��"�ѵ绰���ߵ�
     */
    public String getOfficeTelNumber() {
        System.out.println("�칫�ҵ绰��... ");
        return null;
    }

    /*
     * �������������Ҫ
     */
    public String getUserName() {
        System.out.println("��������...");
        return null;
    }
}
