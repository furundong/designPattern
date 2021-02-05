package cn.designPattern.dp.creator._5_Prototype.example1;

import java.util.Random;

public class Client {
    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        //把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方
            mail.setAppellation(getRandString(5)+" 先生（女士）");
            mail.setReceiver(getRandString(5)+"@"+getRandString(8) +".com");
            //然后发送邮件
            sendMail(mail);
            i++;
        }
    }
    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println(mail.getAppellation()+"\t标题："+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t"+mail.getTail()+"\t...发送成功！");
    }
    //获得指定长度的随机字符串
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
由于是随机数，每次运行都有所差异，不管怎么样，我们这个电子账单发送程序是编写
出来了，也能正常发送。我们再来仔细地想想，这个程序是否有问题？Look here，这是一个
线程在运行，也就是你发送的是单线程的，那按照一封邮件发出去需要0.02秒（够小了，你
还要到数据库中取数据呢），600万封邮件需要33个小时，也就是一个整天都发送不完，今
天的没发送完，明天的账单又产生了，日积月累，激起甲方人员一堆抱怨，那怎么办？

好办，把sendMail修改为多线程，但是只把sendMail修改为多线程还是有问题的呀，产
生第一封邮件对象，放到线程1中运行，还没有发送出去；线程2也启动了，直接就把邮件对
象mail的收件人地址和称谓修改掉了，线程不安全了。说到这里，你会说这有N多种解决办
法，


其中一种是使用一种新型模式来解决这个问题：通过对象的复制功能来解决这个问题，类图稍做修改

 */
