package practice7.ChainofResponsibility;

public class CriticalLogger extends Logger {
    @Override
    public void log(String level, String message) {
        if (level.equals("CRITICAL")) {
            System.out.println("CRITICAL: " + message);
        } else {
            super.log(level, message);
        }
    }
}