package practice7.ChainofResponsibility;

public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.createLogger();

        logger.log("INFO", "Created new user");
        logger.log("WARNING", "This password is simple - recommended to use another");
        logger.log("ERROR", "Invalid email");
    }



}
