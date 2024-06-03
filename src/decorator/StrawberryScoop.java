package decorator;

public class StrawberryScoop implements icecreamCone{

    icecreamCone obj;

    @Override
    public int getPrice() {
        return 20 + obj.getPrice();
    }

    public StrawberryScoop(icecreamCone cone){
        this.obj=cone;
    }
}
