package practice7.ChainofResponsibility;

public class DebugLogger extends Logger {
    @Override
    public void log(String level, String message) {
        if (level.equals("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(level, message);
        }
    }
}
