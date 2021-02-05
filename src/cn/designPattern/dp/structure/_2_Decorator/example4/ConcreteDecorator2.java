package cn.designPattern.dp.structure._2_Decorator.example4;

public class ConcreteDecorator2 extends Decorator {
    //定义被修饰者
    public ConcreteDecorator2(Component _component){
        super(_component);
    }
    //定义自己的修饰方法
    private void method2(){
        System.out.println("method2修饰");
    }
    //重写父类的Operation方法
    public String operate(){
        this.method2();
       return super.operate()+" method2修饰";      //这里用了父类的操作
    }
}

/*
原始方法和装饰方法的执行顺序在具体的装饰类是固定的，可以通过方法重载实
现多种执行顺序
 */
