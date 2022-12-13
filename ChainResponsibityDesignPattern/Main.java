package ChainResponsibityDesignPattern;

public class Main {
    public static void main(String args[]) {
        LogProcessor logProcessor = new InfoLogProcessor( new ErrorLogProcessor(null));
//        logProcessor.log(LogProcessor.ERROR, "Exception Happen");
//        logProcessor.log(LogProcessor.DEBUG, "Need to debug this");
        logProcessor.log(LogProcessor.INFO, "Info msg");
    }
}
