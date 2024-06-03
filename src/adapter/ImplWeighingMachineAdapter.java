package adapter;

public class ImplWeighingMachineAdapter implements IweighingMachineAdapter{

    WeighingMachine obj = new WeighingMachine();

    public int getWeightInKg(){

        return obj.getWeightInPound() / 2 ;
    }
}
