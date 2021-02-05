package cn.designPattern.dp.creator._1_simpleFactory.example3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * �����࣬������������
 */
public class Factory {
    public static Food getFood() throws IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        InputStream in = Factory.class.getResourceAsStream("application.properties");
        //        System.out.println(new File(".").getAbsolutePath()); �����㵱ǰ����Ŀλ��
        //�������ǲ�û��ָ��һ���ض���·����classloader������ֻ�ǽ��ļ���ֱ�Ӵ���������
        // ������ǽ�.properties�ļ���class�ļ�����ͬһ��Ŀ¼�£��������������������ǽ�properties�ŵ������ط��������null�쳣
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in!=null)
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Food food = null;
        Class<?> bean = null;
        try {
            bean = Class.forName(properties.getProperty("bean")); // �����ಢ������Ĭ����true
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        food = (Food) (bean != null ? bean.newInstance() : null);
        return food;
    }
}

/*
��ȡproperties�ļ���

    ͨ�� ResourceBundle.getBundle() ��̬��������ȡ��ResourceBundle��һ�������ࣩ�����ַ�ʽ����ȡproperties�����ļ�����Ҫ��.properties��׺����ֻ��Ҫ�ļ�������

1 ���� properties.getProperty(String key);
2     //configΪ�����ļ��������ڰ�com.test.config�£�����Ƿ���src�£�ֱ����config����
3     ResourceBundle resource = ResourceBundle.getBundle("com/test/config/config");  ע���ˣ�������Ҫд��׺��
4     String key = resource.getString("keyWord");

����
һ����˵��ResourceBundle��ͨ����������Բ�ͬ��������ʹ�õ������ļ���
��������Ӧ�ó����е������ļ�ֻ��һЩ���ã���������Զ�����Ե�Ŀ�ġ���ôʹ��Properties��Ϳ����ˡ�
 */

/*
    ����ط�ʽ��
       1. new Food() ֱ�ӵ�һ�ξͼ���
       2. ͨ��Class.forName()�������࣬Ȼ��������newInstance()����ʵ��������
            Class.forName(className,true,this.getClass.getClassLoader)��
            �ڶ���������ʾ��������Ƿ�������ʼ����
            ������������ǰ���ᵽ�ı�ʾ�ǵ�ǰ���������
       3. classLoader.loadClass()ʵ�ʵ��õ���classLoader.loadClass(className,false)���ڶ���������ʾ������ɺ��Ƿ����ӣ����ô˷��������࣬������ɺ󲻻�ȥ��ʼ����
        ��Class.forName()�����������ɺ���Ա���ʼ�����������ʵ����jdbc��Driver���ַ�ʽ���ͻᱨnull�쳣

    ������ط�ʽ��
        1. ���䡣
        2. new()
        3. Cloneable�ӿڣ�
        4. ���л��������л���  ��һ�����¡��ǳ��¡������ԭ��ģʽ�ὲ������д��ȥû��û���ˡ�

�ռ�һ�£����ǴӰٶ�copy����
1.����ع���
�������ȣ�jvm��ִ��ʱ������һ���µ���ʱ���ᵽ�ڴ��еķ�����ȥ��class�ļ�������ҵ���ֱ�������ã�
���û���ҵ����ͻᵽӲ����ȥ�ҵ����class�ļ��������ļ����ص����������������ʱ����̬��Ա��������
���������ľ�̬���򣬷Ǿ�̬��Ա�������ص��������ķǾ�̬���򣬼��ؾ�̬��Ա������ʱ�򣬻������д��˳��
�����еľ�̬��Ա�������ص���̬��������Ȼ������еľ�̬��Ա������Ĭ��ֵ����Ĭ��ֵ�󣬻���ݾ�̬��Ա
������д��λ�ã�����̬��Ա��������ʾֵ����ִ�о�̬���롣��ִ�������еľ�̬�����ʱ������������ɡ�

    ����ع��̣�
    1.JVM����ȥ������������û����Ӧ���.class���ڡ�����У���ֱ��ʹ�ã����û�У����������.class���ص���������
    2.��.class���ص�������ʱ�����Ϊ�����ּ��أ��ȼ��طǾ�̬���ݣ��ڼ��ؾ�̬���ݡ�
    3.�ڼ��طǾ�̬���ݣ���.class�е����зǾ�̬���ݼ��ص��������µķǾ�̬������
    4.���ؾ�̬���ݣ�
       4.1��.class�����о�̬���ݼ��ص��������µľ�̬�����ڡ�
       4.2��̬���ݼ������֮�󣬶����еľ�̬��������Ĭ�ϳ�ʼ����
       4.3���еľ�̬����Ĭ�ϳ�ʼ�����֮���ٽ�����ʾ��ʼ����
       4.4����̬�����µ����о�̬������ʾ��ʼ�����ִ�о�̬����顣
    5.����̬�����µľ�̬����飬ִ����֮��������ļ��ؾ�����ˡ�

2.���󴴽����̣�
    1.�ڶ��ڴ��п���һ��ռ䡣
    2.�����ٿռ����һ����ַ��
    3.�Ѷ�������зǾ�̬��Ա���ص������ٵĿռ��¡�
    4.���еķǾ�̬��Ա�������֮�󣬶����зǾ�̬��Ա��������Ĭ�ϳ�ʼ����
    5.���зǾ�̬��Ա����Ĭ�ϳ�ʼ�����֮�󣬵��ù��캯����
    6.�ڹ��캯����ջִ��ʱ����Ϊ�����֣���ִ�й��캯���е���ʽ��������ִ�й��캯������д�Ĵ��롣
       6.1��ʽ������
    ����1.ִ��super���
    ����2.�Կ��ٿռ��µ����зǾ�̬��Ա����������ʾ��ʼ��
    ����3.ִ�й�������
    ��6.2����ʽ����ִ����֮��ִ�й��캯������д�Ĵ���
    7.���������캯��ִ���겢��ջ�󣬰ѿռ����ĵ�ַ��ֵ��һ�����ö���
 */
