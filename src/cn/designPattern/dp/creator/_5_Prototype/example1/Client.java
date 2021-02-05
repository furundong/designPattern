package cn.designPattern.dp.creator._5_Prototype.example1;

import java.util.Random;

public class Client {
    //�����˵������������ֵ�Ǵ����ݿ��л��
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        //ģ�ⷢ���ʼ�
        int i=0;
        //��ģ�嶨�����������Ǵ����ݿ��л��
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX���а�Ȩ����");

        while(i<MAX_COUNT){
            //������ÿ���ʼ���ͬ�ĵط�
            mail.setAppellation(getRandString(5)+" ������Ůʿ��");
            mail.setReceiver(getRandString(5)+"@"+getRandString(8) +".com");
            //Ȼ�����ʼ�
            sendMail(mail);
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
�������������ÿ�����ж��������죬������ô����������������˵����ͳ����Ǳ�д
�����ˣ�Ҳ���������͡�����������ϸ�����룬��������Ƿ������⣿Look here������һ��
�߳������У�Ҳ�����㷢�͵��ǵ��̵߳ģ��ǰ���һ���ʼ�����ȥ��Ҫ0.02�루��С�ˣ���
��Ҫ�����ݿ���ȡ�����أ���600����ʼ���Ҫ33��Сʱ��Ҳ����һ�����춼���Ͳ��꣬��
���û�����꣬������˵��ֲ����ˣ��ջ����ۣ�����׷���Աһ�ѱ�Թ������ô�죿

�ð죬��sendMail�޸�Ϊ���̣߳�����ֻ��sendMail�޸�Ϊ���̻߳����������ѽ����
����һ���ʼ����󣬷ŵ��߳�1�����У���û�з��ͳ�ȥ���߳�2Ҳ�����ˣ�ֱ�ӾͰ��ʼ���
��mail���ռ��˵�ַ�ͳ�ν�޸ĵ��ˣ��̲߳���ȫ�ˡ�˵��������˵����N���ֽ����
����


����һ����ʹ��һ������ģʽ�����������⣺ͨ������ĸ��ƹ��������������⣬��ͼ�����޸�

 */
