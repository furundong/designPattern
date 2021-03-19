package cn.designPattern.dp.structure._3_adapter.demo1;

import cn.designPattern.dp.structure._3_adapter.demo1.myCompany.IUserInfo;
import cn.designPattern.dp.structure._3_adapter.demo1.outCompany.OuterUser;

import java.util.Map;

/**
 * create by Freedom on 2021/2/7
 * <p>
 * �̳�OuterUser����Ҫ�Խ������˾��ϵͳ, ��ʵ��IUserInfo,����Ϊ��������Ҫ��Լ��
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo(); //Ա���Ļ�����Ϣ
    private Map homeInfo = super.getUserHomeInfo(); //Ա���ļ�ͥ��Ϣ
    private Map officeInfo = super.getUserOfficeInfo(); //������Ϣ

    /*
     * ��ͥ��ַ
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /*
     * ��ͥ�绰����
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /*
     *ְλ��Ϣ
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /*
     * �ֻ�����
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /*
     * �칫�绰
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /*
     * Ա��������
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

}
