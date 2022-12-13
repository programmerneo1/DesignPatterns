package FacadeDesignPattern;

public class SoftWareChecks {
    OS os;
    Driver driver;
    public SoftWareChecks() {
        this.driver = new Driver();
        this.os = new OS();
    }

    boolean checkSoftWareOnBoot() {
        return os.checkOSOnBoot() && driver.checkDriverOnBoot();
    }
}
