package ChainResponsibityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == ERROR) System.out.printf("ERROR: " + msg);
        else super.log(logLevel, msg);
    }
}
