package cn.designPattern.dp.structure._4_composite.demo2;

/*
类图上增加了一个ICorp接口，它是公司所有人员信息的接口类，不管你是经理还是员
工，你都有名字、职位、薪水，这个定义成一个接口没有错，但是你可能对于ILeaf接口持怀
疑状态，空接口有何意义呀？有意义！它是每个树枝节点的代表，系统扩容的时候你就会发
现它是多么“栋梁”

 */
public interface ICorp {
    //每个员工都有信息，你想隐藏，门儿都没有！
    public String getInfo();

}
