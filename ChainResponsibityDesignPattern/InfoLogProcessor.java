package ChainResponsibityDesignPattern;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == INFO) System.out.printf("INFO: " + msg);
        else super.log(logLevel, msg);
    }
}
