package cn.designPattern.dp.structure._7_proxy.example2;

public interface IGamePlayer {
    //��¼��Ϸ
    public void login(String user, String password);
    //ɱ�֣�����������Ϸ����Ҫ��ɫ
    public void killBoss();
    //����
    public void upgrade();
    //ÿ���˶�������һ���Լ��Ĵ���
    public IGamePlayer getProxy();
}
