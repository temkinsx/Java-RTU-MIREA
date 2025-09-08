package practice7.ChainofResponsibility;

abstract public class Logger {
    protected Logger next;

    public void setNext(Logger next) {
        if (next != null) {
            this.next = next;
        }
    }

    public void log(String level, String message) {
        if (next != null) {
            next.log(level, message);
        }
    }
}
