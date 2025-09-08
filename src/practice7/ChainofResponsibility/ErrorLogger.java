package practice7.ChainofResponsibility;

public class ErrorLogger extends Logger {
    @Override
    public void log(String level, String message) {
        if (level.equals("ERROR")) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(level, message);
        }
    }
}