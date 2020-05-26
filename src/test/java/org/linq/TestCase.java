package org.linq;

import com.bestvike.collections.generic.Comparer;
import com.bestvike.linq.IEnumerable;
import org.junit.jupiter.api.Assertions;

import java.util.Comparator;

/**
 * Created by 许崇雷 on 2019-10-17.
 */
public class TestCase extends Assertions {
    protected static <T> void assertEmpty(IEnumerable<T> enumerable) {
        if (enumerable == null)
            fail("enumerable is null");
        if (enumerable.count() == 0)
            return;
        fail("enumerable is not empty");
    }

    protected static <T> void assertNotEmpty(IEnumerable<T> enumerable) {
        if (enumerable == null)
            fail("enumerable is null");
        if (enumerable.count() != 0)
            return;
        fail("enumerable is empty");
    }

    protected static <T> void assertInRange(T actual, T low, T high) {
        Comparator<T> comparer = Comparer.Default();
        if (comparer.compare(low, actual) > 0 || comparer.compare(actual, high) > 0)
            fail(String.format("%s should in range [%s, %s]", actual, low, high));
    }

    protected static <T> void assertIsAssignableFrom(Class<T> expectedType, Object obj) {
        if (expectedType == null)
            fail("expectedType is null");
        if (obj != null && expectedType.isAssignableFrom(obj.getClass()))
            return;
        fail("expectedType " + expectedType.getName() + ", but got " + (obj == null ? "null" : obj.getClass().getName()));
    }

    protected static <T> void assertIsType(Class<T> expectedType, Object obj) {
        if (expectedType == null)
            fail("expectedType is null");
        if (obj != null && expectedType == obj.getClass())
            return;
        fail("expectedType " + expectedType.getName() + ", but got " + (obj == null ? "null" : obj.getClass().getName()));
    }
}
