package cn.designPattern.dp.creator._5_Prototype.example2;

//�����ģ�����
public class AdvTemplate {
    //���������
    private String advSubject ="XX���й������ÿ��齱�";
    //���������
    private String advContext = "����齱�֪ͨ��ֻҪˢ��������һ����...";
    //ȡ�ù���ŵ�����
    public String getAdvSubject(){
        return this.advSubject;
    }
    //ȡ�ù���ŵ�����
    public String getAdvContext(){
        return this.advContext;
    }
}
