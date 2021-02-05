package cn.designPattern.dp.creator._6_Bulider.demo1;

public class Director {
    private Builder builder ;
    Director(Builder builder){
        this.builder = builder;
    }

    //构建不同的产品
    public Product getAProduct(){
        builder.setPart();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
