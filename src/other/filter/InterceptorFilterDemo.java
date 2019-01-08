package other.filter;

/**
 * Created by      IDEA
 *
 * @author :       zhuzhenjie
 * Date    :       2018-10-11
 * Time    :       17:27
 * Version :       1.0
 * Company :       Beijing Tepia (Wuhan R&D Center)
 **/
public class InterceptorFilterDemo {

    public static void main(String[] args) {
        Target target = new Target();

        FilterManager filterManager = new FilterManager(target);
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client(filterManager);

        client.sendRequest("HOME");
    }

}
