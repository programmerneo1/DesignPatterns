package FacadeDesignPattern;

public class HardWareChecks {
    MotherBoard motherBoard;
    RAM ram;
    public HardWareChecks() {
        this.motherBoard = new MotherBoard();
        this.ram = new RAM();
    }

    boolean checkHarWareOnBoot() {
        return motherBoard.checkMotherBoardOnBoot() && ram.checkRAMOnBoot();
    }
}
