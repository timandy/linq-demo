package org.linq.demo;

import com.bestvike.linq.Linq;
import org.junit.jupiter.api.Test;

/**
 * Created by 许崇雷 on 2020-05-26.
 */
class WhereTest {
    @Test
    void where() {
        var source = Linq.of(0, 1, 2, 3, 4);
        var result = source.where(a -> a > 2).toList();
        System.out.println(result);
    }

    @Test
    void whereSelect() {
        var source = Linq.of(3, 4, 1, 2);
        var result = source.where(a -> a % 2 == 0).select(a -> a * 2).toList();
        System.out.println(result);
    }
}
