package org.linq.demo;

import com.bestvike.linq.Linq;
import org.junit.jupiter.api.Test;

/**
 * Created by 许崇雷 on 2020-05-26.
 */
class WhereTest {
    @Test
    void test1() {
        var source = Linq.of(0, 1, 2, 3, 4);
        var result = source.where(a -> a > 2).toList();
        System.out.println(result);
    }
}
