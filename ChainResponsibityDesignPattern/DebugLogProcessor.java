package ChainResponsibityDesignPattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == DEBUG) System.out.printf("ERROR: " + msg);
        else super.log(logLevel, msg);
    }
}
