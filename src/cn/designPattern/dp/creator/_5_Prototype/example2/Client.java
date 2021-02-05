package cn.designPattern.dp.creator._5_Prototype.example2;

import java.util.Random;

public class Client {
    //�����˵������������ֵ�Ǵ����ݿ��л��
    private static int MAX_COUNT = 6;
    public static void main(String[] args) throws CloneNotSupportedException {
        //ģ�ⷢ���ʼ�
        int i=0;
        //��ģ�嶨�����������Ǵ����ݿ��л��
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX���а�Ȩ����");

        while(i<MAX_COUNT){
            //������ÿ���ʼ���ͬ�ĵط�
            Mail cloneMail = (Mail) mail.clone();   //�����clone��Ķ��󣬶��̲߳��ŵġ�
            cloneMail.setAppellation(getRandString(5)+" ������Ůʿ��");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8) +".com");
            //Ȼ�����ʼ�
            sendMail(cloneMail);
            i++;
        }
    }
    //�����ʼ�
    public static void sendMail(Mail mail){
        System.out.println(mail.getAppellation()+"\t���⣺"+mail.getSubject() + "\t�ռ��ˣ�"+mail.getReceiver()+"\t"+mail.getTail()+"\t...���ͳɹ���");
    }
    //���ָ�����ȵ�����ַ���
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}

/*
���н�����䣬һ������˵��ӹ���ŵķ��͹��ܣ�����sendMail��ʹ�Ƕ��߳�Ҳû��
��ϵ��ע�⣬��Client���еĴ�����mail.clone()����������Ѷ�����һ�ݣ�����һ���µ�
���󣬺�ԭ�ж���һ����Ȼ�����޸�ϸ�ڵ����ݣ������ó�ν�������ռ��˵�ַ�ȡ����ֲ�
ͨ��new�ؼ���������һ�����󣬶���ͨ����������ʵ�ֵ�ģʽ�ͽ���ԭ��ģʽ��
 */

/*
�ŵ㣺
    �� ��������
        ԭ��ģʽ�����ڴ���������Ŀ�����Ҫ��ֱ��newһ���������ܺúܶ࣬�ر���Ҫ��һ
        ��ѭ�����ڲ��������Ķ���ʱ��ԭ��ģʽ���Ը��õ��������ŵ㡣
    �� �ӱܹ��캯����Լ��
        ����������ŵ�Ҳ��ȱ�㣬ֱ�����ڴ��п��������캯���ǲ���ִ�еģ����캯���ǲ���ִ�еģ����캯���ǲ���ִ�еġ�
        Object���clone������ԭ���Ǵ��ڴ��У������˵���Ƕ��ڴ棩�Զ��������ķ�ʽ���п��������·���һ���ڴ�飬�ǹ��캯��û�б�ִ��Ҳ�Ƿǳ��������ˡ�
        �ŵ���Ǽ�����Լ����ȱ��Ҳ�Ǽ�����Լ������Ҫ�����ʵ��Ӧ��ʱ���ǡ�

ԭ��ģʽ��ʹ�ó���
    �� ��Դ�Ż�����
        ���ʼ����Ҫ�����ǳ������Դ�������Դ�������ݡ�Ӳ����Դ�ȡ�
    �� ���ܺͰ�ȫҪ��ĳ���
        ͨ��new����һ��������Ҫ�ǳ�����������׼�������Ȩ�ޣ������ʹ��ԭ��ģʽ��
    �� һ���������޸��ߵĳ���
        һ��������Ҫ�ṩ������������ʣ����Ҹ��������߿��ܶ���Ҫ�޸���ֵʱ�����Կ���
        ʹ��ԭ��ģʽ����������󹩵�����ʹ�á�

 ��ʵ����Ŀ�У�ԭ��ģʽ���ٵ������֣�һ���Ǻ͹�������ģʽһ����֣�ͨ��clone��
��������һ������Ȼ���ɹ��������ṩ�������ߡ�ԭ��ģʽ�Ѿ���Java��Ϊһ�壨Object������ҿ�
����������ʹ�á�


��ô���������ˡ� �������������������ͣ���ôcloneĬ����ǳ��¡�����Ҿ�������Ӧ����clone�����Ӹ��жϣ���������ǳ��¡�������¡���ҾͲ���װ���ˡ���������
��ô���أ����������忴example3
 */
