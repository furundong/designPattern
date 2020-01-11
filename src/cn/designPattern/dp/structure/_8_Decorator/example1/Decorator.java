package cn.designPattern.dp.structure._8_Decorator.example1;

/*
一般是一个抽象类，做什么用呢？实现接口或者抽象方法，它里面可不一定有抽象的方
法呀，在它的属性里必然有一个private变量指向Component抽象构件。
 */
public abstract class Decorator extends Component {
    private Component component = null;
    //通过构造函数传递被修饰者
    public Decorator(Component _component){
        this.component = _component;
    }
    //委托给被修饰者执行
    @Override
    public String operate() {
       return this.component.operate();
    }
}
