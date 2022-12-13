package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeighMachine;

public class WeightMachineAdapterImp implements WeightMachineAdapter{
    WeighMachine weighMachine;
    public WeightMachineAdapterImp(WeighMachine weighMachine) {
        this.weighMachine = weighMachine;
    }

    @Override
    public double getWeightInKG() {
        double weightInPound = weighMachine.getWeightInPound();
        return weightInPound*.45;
    }
}
