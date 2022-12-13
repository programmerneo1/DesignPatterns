package FacadeDesignPattern;

public class LaptopOnSwitch {
    SoftWareChecks softWareChecks;
    HardWareChecks hardWareChecks;
    public LaptopOnSwitch() {
        this.hardWareChecks = new HardWareChecks();
        this.softWareChecks = new SoftWareChecks();
    }

    void switchOnLaptop() {
        if ( softWareChecks.checkSoftWareOnBoot() && hardWareChecks.checkHarWareOnBoot() ) {
            System.out.println("Switching the Laptop On");
        }
    }
}
