package cz.misina.miniserver;

public class Result {
    private final long id;
    private final String message;

    public Result(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
