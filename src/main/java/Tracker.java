public interface Tracker {

    void push(String message);

    boolean has(String message);

    void handle(String message, EventHandler e);
}
