package cn.designPattern.dp.structure._5_Chain.demo2;

/**
 * create by Freedom on 2021/3/8
 */
public abstract class Handler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;
    //�ܴ���ĵȼ�
    private int level = 0;
    //���δ���,��һ����������˭
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    //һ��Ů�ԣ�Ů�������ӻ�����ĸ�ף�Ҫ���֣���Ҫ�����������
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("û�˴����������");
            }
        }
    }

    /*
     * ����������㴦���������Ӧ����������һ�����ڵ��ˣ���Ů�������ˣ�
     * ��������ʾ�Ƿ���Թ�֣��Ǹ��׾�Ӧ�ø���Ů����Ӧ�����ɷ���ʾ
     */
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
