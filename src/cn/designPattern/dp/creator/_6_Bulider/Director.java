package cn.designPattern.dp.creator._6_Bulider;

public class Director {
    private Builder builder ;
    Director(Builder builder){
        this.builder = builder;
    }

    //������ͬ�Ĳ�Ʒ
    public Product getAProduct(){
        builder.setPart();
        /*
         * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
         */
        return builder.buildProduct();
    }
}
