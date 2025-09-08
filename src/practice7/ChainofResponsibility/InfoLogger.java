package practice7.ChainofResponsibility;

public class InfoLogger extends Logger {
    @Override
    public void log(String level, String message) {
        if (level.equals("INFO")) {
            System.out.println("INFO: " + message);
        } else {
            super.log(level, message);
        }
    }
}
