package cn.designPattern.dp.behavior._2_Iterator.bean;

/**
 * create by Freedom on 2020/7/2
 * <p>
 * 此时我们有一个菜单列表， 那么旗下有许多的餐饮店，此时就需要一个菜单类。
 * 比我们有早餐店，
 * 午餐店
 */
public class MenuItem {
    private String name;
    private String description;
    private Boolean vegetarian;
    private Double price;

    /**
     * 一个菜单列表需要有名字，表述，是否素食，价格
     */
    public MenuItem(String name, String description, Boolean vegetarian, Double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
