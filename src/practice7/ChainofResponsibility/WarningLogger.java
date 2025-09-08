package practice7.ChainofResponsibility;

public class WarningLogger extends Logger {
    @Override
    public void log(String level, String message) {
        if (level.equals("WARNING")) {
            System.out.println("WARNING: " + message);
        } else {
            super.log(level, message);
        }
    }
}
