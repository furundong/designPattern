package cn.designPattern.dp.behavior._3_template;

/**
 * create by Freedom on 2021/2/5
 */
public abstract class TemplateTime {
    //为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
    public final void template() {
        /*
         * 调用基本方法，完成相关的逻辑
         */
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("共花费: " + (end - start));
    }

    //基本方法
    protected abstract void code();
}
/*
抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露
的属性或方法尽量不要设置为protected类型。实现类若非必要，尽量不要扩大父类中的访问
权限。
 */
