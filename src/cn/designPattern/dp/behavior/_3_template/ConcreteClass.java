package cn.designPattern.dp.behavior._3_template;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/2/5
 */
public class ConcreteClass extends TemplateTime {
    @Override
    protected void code() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 300000; i++) {
            list.add(0, 1);
        }
    }
}
