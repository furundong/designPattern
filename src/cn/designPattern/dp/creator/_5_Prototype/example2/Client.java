package cn.designPattern.dp.creator._5_Prototype.example2;

import java.util.Random;

public class Client {
    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;
    public static void main(String[] args) throws CloneNotSupportedException {
        //模拟发送邮件
        int i=0;
        //把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方
            Mail cloneMail = (Mail) mail.clone();   //这个是clone后的对象，多线程不慌的。
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
运行结果不变，一样完成了电子广告信的发送功能，而且sendMail即使是多线程也没有
关系。注意，看Client类中的粗体字mail.clone()这个方法，把对象复制一份，产生一个新的
对象，和原有对象一样，然后再修改细节的数据，如设置称谓、设置收件人地址等。这种不
通过new关键字来产生一个对象，而是通过对象复制来实现的模式就叫做原型模式。
 */

/*
优点：
    ● 性能优良
        原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一
        个循环体内产生大量的对象时，原型模式可以更好地体现其优点。
    ● 逃避构造函数的约束
        这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的，构造函数是不会执行的，构造函数是不会执行的。
        Object类的clone方法的原理是从内存中（具体地说就是堆内存）以二进制流的方式进行拷贝，重新分配一个内存块，那构造函数没有被执行也是非常正常的了。
        优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。

原型模式的使用场景
    ● 资源优化场景
        类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
    ● 性能和安全要求的场景
        通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
    ● 一个对象多个修改者的场景
        一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑
        使用原型模式拷贝多个对象供调用者使用。

 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的
方法创建一个对象，然后由工厂方法提供给调用者。原型模式已经与Java融为一体（Object），大家可
以随手拿来使用。


那么又有问题了。 如果类的属性是引用类型，那么clone默认是浅克隆。（我觉得作者应该在clone方法加个判断，告诉我们浅克隆还是深克隆。我就不用装逼了。哈哈哈）
怎么办呢！！！！具体看example3
 */