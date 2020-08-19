package cn.designPattern.dp.structure._7_proxy.example2;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    //���캯�������û���
    public GamePlayerProxy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }
    //����ɱ��
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //������¼
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //��������
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
    //����Ĵ�����ʱ��û�У������Լ�
    public IGamePlayer getProxy(){
        return this;
    }
}
