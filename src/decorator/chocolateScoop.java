package decorator;

public class chocolateScoop implements icecreamCone{

    icecreamCone obj;

    @Override
    public int getPrice() {
        return 30 + obj.getPrice();
    }

    public chocolateScoop(icecreamCone cone){
        this.obj=cone;
    }
}
