package cn.designPattern.dp.creator._5_Prototype.example2;

public class Mail implements Cloneable { //�ӿ�ֻ��һ���������
    //�ռ���
    private String receiver;
    //��ν
    private String appellation;
    //�ʼ�����
    private String subject;
    //�ʼ�����
    private String contxt;
    //�ʼ���β����һ�㶼�Ǽ���"XXX��Ȩ����"����Ϣ
    private String tail;
    //���캯��
    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
