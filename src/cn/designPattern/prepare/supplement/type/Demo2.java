package cn.designPattern.prepare.supplement.type;

/**
 * create by Freedom on 2021/1/28
 */
public class Demo2 {
}

//���磬���Ǳ�д��һ��������Pair<T>�����Ǳ����������Ĵ��룺
class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }
}

//�������������֪�����͡����������ִ�еĴ��룺

class Pair2 {
    private Object first;
    private Object last;

    public Pair2(Object first, Object last) {
        this.first = first;
        this.last = last;
    }

    public Object getFirst() {
        return first;
    }

    public Object getLast() {
        return last;
    }
}

/*
    ��ˣ�Javaʹ�ò��÷�ʵ�ַ��ͣ������ˣ�
        ������������<T>��ΪObject��
        ����������<T>ʵ�ְ�ȫ��ǿ��ת�͡�
        ʹ�÷��͵�ʱ�����Ǳ�д�Ĵ���Ҳ�Ǳ����������Ĵ��룺

        Pair<String> p = new Pair<>("Hello", "world");
        String first = p.getFirst();
        String last = p.getLast();

    �������ִ�еĴ��벢û�з��ͣ�

        Pair p = new Pair("Hello", "world");
        String first = (String) p.getFirst();
        String last = (String) p.getLast();

    ���ԣ�Java�ķ������ɱ������ڱ���ʱʵ�еģ��������ڲ���Զ����������T��ΪObject����
    ���ǣ�����Ҫת�͵�ʱ�򣬱����������T�������Զ�Ϊ����ʵ�а�ȫ��ǿ��ת��
*/


//ok ok , ��ô����֪���˱������ڲ���Զ����������T��ΪObject����, ����˵T,����Object, ���Ǿ�֪����Java���͵ľ��ޣ�
/*
    1. ����һ��<T>�����ǻ������ͣ�����int����Ϊʵ��������Object��Object�����޷����л������ͣ�
        Pair<int> p = new Pair<>(1, 2); // compile error!

    2. ���޶����޷�ȡ�ô����͵�Class���۲����´��룺
        public class Main {
            public static void main(String[] args) {
                Pair<String> p1 = new Pair<>("Hello", "world");
                Pair<Integer> p2 = new Pair<>(123, 456);
                Class c1 = p1.getClass();
                Class c2 = p2.getClass();
                System.out.println(c1==c2); // true
                System.out.println(c1==Pair.class); // true
            }
        }
        ��ΪT��Object�����Ƕ�Pair<String>��Pair<Integer>���ͻ�ȡClassʱ����ȡ������ͬһ��Class��Ҳ����Pair���Class�� , ����Pair.class
        ���仰˵�����з���ʵ��������T��������ʲô��getClass()����ͬһ��Classʵ������Ϊ���������ȫ������Pair<Object>��

    3. �޷��жϴ����͵����ͣ�
        Pair<Integer> p = new Pair<>(123, 456);
        // Compile error:
        if (p instanceof Pair<String>) {
        }
        ԭ���ǰ��һ������������Pair<String>.class������ֻ��Ψһ��Pair.class��

    4. �����ģ�����ʵ����T���ͣ�
        public class Pair<T> {
            private T first;
            private T last;
            public Pair() {
                // Compile error:
                first = new T();
                last = new T();
            }
        }

        ���������޷�ͨ�����룬��Ϊ���췽����������䣺

        first = new T();
        last = new T();
        ���ú�ʵ���ϱ���ˣ�

        first = new Object();
        last = new Object();
        ����һ��������new Pair<String>()�ʹ���new Pair<Integer>()��ȫ������Object����Ȼ������Ҫ��ֹ�������Ͳ��ԵĴ��롣
        ������first��String , ��ô���� String s = new Object(); ������, ������Ҫת����

        Ҫʵ����T���ͣ����Ǳ�����������Class<T>������

        public class Pair<T> {
            private T first;
            private T last;
            public Pair(Class<T> clazz) {
                first = clazz.newInstance();
                last = clazz.newInstance();
            }
        }
        �����������Class<T>������ͨ��������ʵ����T���ͣ�ʹ�õ�ʱ��Ҳ���봫��Class<T>�����磺

        Pair<String> pair = new Pair<>(String.class);
        ��Ϊ������Class<String>��ʵ�����������ǽ���String.class�Ϳ���ʵ����String���͡�

    5. ��ǡ���ĸ�д����
        ��Щʱ��һ��������ȷ����ķ������޷�ͨ�����롣���磺

        public class Pair<T> {
            public boolean equals(T t) {
                return this == t;
            }
        }
        ������Ϊ�������equals(T t)����ʵ���ϻᱻ���ó�equals(Object t)������������Ǽ̳���Object�ģ�����������ֹһ��ʵ���ϻ��ɸ�д�ķ��ͷ������塣

        �������������ܿ���Object.equals(Object)�ĳ�ͻ�Ϳ��Գɹ����룺

        public class Pair<T> {
            public boolean same(T t) {
                return this == t;
            }
        }
 */
