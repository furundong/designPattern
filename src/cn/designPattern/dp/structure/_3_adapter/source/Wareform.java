package cn.designPattern.dp.structure._3_adapter.source;

/**
 * create by Freedom on 2021/2/7
 */
public class Wareform {
    private static  long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Wareform{" +
                "id=" + id +
                '}';
    }
}

