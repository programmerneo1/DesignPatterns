package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeighMachineForBabies;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImp;

public class Main {
    public static void main(String args[]) {
        WeightMachineAdapterImp weightMachineAdapterImp = new WeightMachineAdapterImp(new WeighMachineForBabies());
        System.out.println(weightMachineAdapterImp.getWeightInKG());
    }
}
