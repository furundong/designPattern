package cn.designPattern.dp.structure._2_Decorator.example2;

/**
 * create by Freedom on 2021/2/4
 */
public abstract class Beverage {
    private String description;

    private boolean milk;

    private boolean soy;

    private boolean mocha;

    public abstract String getDescription();

    public void setDescription(String description) {
        this.description = description;
    }

    public double cost() {
        double total = 0;
        if (milk) {
            total += 0.1;
        }
        if (soy) {
            total += 0.2;
        }
        if (mocha) {
            total += 0.3;
        }
        return total;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
}
