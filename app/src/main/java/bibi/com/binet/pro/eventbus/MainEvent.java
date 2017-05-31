package bibi.com.binet.pro.eventbus;

/**
 * Created by bibinet on 2017-5-17.
 */

public class MainEvent {
    private String msg;

    public MainEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
