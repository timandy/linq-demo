package org.linq.demo;

import com.bestvike.linq.Linq;
import org.junit.jupiter.api.Test;
import org.linq.demo.bean.Point;

/**
 * Created by 许崇雷 on 2020-05-29.
 */
public class OrderByTest {
    @Test
    void orderByThenBy() {
        var source = Linq.of(new Point(3, 1), new Point(2, 1), new Point(1, 2), new Point(2, 2), new Point(1, 1));
        var result = source.orderBy(a -> a.getX()).thenBy(a -> a.getY()).toList();
        System.out.println(result);
    }
}
