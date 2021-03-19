package cn.designPattern.dp.structure._5_Chain.demo2;

/**
 * create by Freedom on 2021/3/8
 */
public abstract class Handler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;
    //能处理的等级
    private int level = 0;
    //责任传递,下一个责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    //一个女性（女儿、妻子或者是母亲）要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("没人处理这个请求");
            }
        }
    }

    /*
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了，
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     */
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
