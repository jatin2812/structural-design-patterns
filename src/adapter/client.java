package adapter;

public class client  {

    public static void main(String agrs[]){

        IweighingMachineAdapter obj = new ImplWeighingMachineAdapter();

        System.out.println(obj.getWeightInKg());
    }
}
