package decorator;

// used where we have to start from a base and have to add things on top of it

// if we have entity which is both base and also a addition then we have 2 constructor



public class client {

    public static void main(String[] agrs){
        icecreamCone cone = new StrawberryScoop(new chocolateScoop(new StrawberryScoop(new orangeCone())));

        System.out.println(cone.getPrice());
    }
}
