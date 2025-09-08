package practice7.ChainofResponsibility;

public class LoggerFactory {
    public static Logger createLogger(){
        Logger infoLogger = new InfoLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNext(warningLogger);
        warningLogger.setNext(errorLogger);

        return infoLogger;
    }
}
