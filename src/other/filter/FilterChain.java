package other.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by      IDEA
 *
 * @author :       zhuzhenjie
 * Date    :       2018-10-11
 * Time    :       17:17
 * Version :       1.0
 * Company :       Beijing Tepia (Wuhan R&D Center)
 **/
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        this.target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
