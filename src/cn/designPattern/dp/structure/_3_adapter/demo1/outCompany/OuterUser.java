package cn.designPattern.dp.structure._3_adapter.demo1.outCompany;

import java.util.HashMap;
import java.util.Map;

/**
 * create by Freedom on 2021/2/7
 */
public class OuterUser implements IOuterUser {
    /*
     * �û��Ļ�����Ϣ
     */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "���Ա���л���ħ��... ");
        baseInfoMap.put("mobileNumber", "���Ա���绰��...  ");
        return baseInfoMap;
    }

    /*
     * Ա���ļ�ͥ��Ϣ
     */
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰��... ");
        homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��...  ");
        return homeInfo;
    }

    /*
     * Ա���Ĺ�����Ϣ�����磬ְλ��
     */
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "����˵�ְλ��BOSS...   ");
        officeInfo.put("officeTelNumber", "Ա���İ칫�绰��... ");
        return officeInfo;
    }
}


