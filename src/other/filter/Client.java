package other.filter;

/**
 * Created by      IDEA
 *
 * @author :       zhuzhenjie
 * Date    :       2018-10-11
 * Time    :       17:23
 * Version :       1.0
 * Company :       Beijing Tepia (Wuhan R&D Center)
 **/
public class Client {

    private FilterManager filterManager;

    public Client(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        this.filterManager.filterRequest(request);
    }
}
