package cn.designPattern.dp.structure._3_adapter.demo1;

import cn.designPattern.dp.structure._3_adapter.demo1.myCompany.IUserInfo;
import cn.designPattern.dp.structure._3_adapter.demo1.myCompany.UserInfo;

/**
 * create by Freedom on 2021/2/7
 * <p>
 * 此时我们的公司的人力资源信息管理系统, 在mycompany包里面,
 * 外包公司的人结构在 outcompany包中,
 *
 * 这个时候我们公司需要记录外包公司人员信息 , 因为在一起需要一起管理, 但是此时外包公司的大佬用的是map, 导致了结构不一样.
 *
 * 看到这里，咱不好说他们系统设计得不好，问题是咱的系统要和他们的系统进行交互，
 * 怎么办？我们不可能为了这一小小的功能而对我们已经运行良好系统进行大手术，那怎么
 * 办？我们可以转化，先拿到对方的数据对象，然后转化为我们自己的数据对象，中间加一层
 * 转换处理，
 */
public class Client {
    public static void main2(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

    }

    public static void main(String[] args) {
        //老板一想不对呀，兔子不吃窝边草，还是找借用人员好点
//我们只修改了这句话
        IUserInfo youngGirl = new OuterUserInfo();
//从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}

/*
大家看，使用了适配器模式只修改了一句话，其他的业务逻辑都不用修改就解决了系统
对接的问题，而且在我们实际系统中只是增加了一个业务类的继承，就实现了可以查本公司
的员工信息，也可以查人力资源公司的员工信息，尽量少的修改，通过扩展的方式解决了该
问题。这就是适配模式。

但是这个只是一个简单的适配 , 其实适配器模式并非这么简单，上面我们看到的是类适配器, 如果现在有这么一个需要,

如果劳
动服务公司提供的人员接口不止一个，也就是说，用户基本信息是一个接口，工作信息是一
个接口，家庭信息是一个接口，总共有三个接口三个实现类，想想看如何处理呢？不能再使
用我们上面的方法了，为什么呢？Java是不支持多继承的，你难道想让OuterUserInfo继承三
个实现类？此路不通，再想一个办法，对哦，可以使用类关联的办法嘛！声明一个
OuterUserInfo实现类，实现IUserInfo接口，通过再关联其他三个实现类不就可以解决这个问
题了吗？是的，是的，好方法.

那就是实现Iuserinfo , 再关联三个接口 , 所以我们重新写一个. 以上例子来自设计模式之禅
 */
