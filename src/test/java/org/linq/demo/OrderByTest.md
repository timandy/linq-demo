- 每日一条
``` java11
@Data
public class Point {
    private final int x;
    private final int y;
}

var source = Linq.of(new Point(3, 1), new Point(2, 1), new Point(1, 2), new Point(2, 2), new Point(1, 1));
var result = source.orderBy(a -> a.getX()).thenBy(a -> a.getY()).toList();
System.out.println(result);
----print
[Point(x=1, y=1), Point(x=1, y=2), Point(x=2, y=1), Point(x=2, y=2), Point(x=3, y=1)]
```
Powered by [linq](https://github.com/timandy/linq)
