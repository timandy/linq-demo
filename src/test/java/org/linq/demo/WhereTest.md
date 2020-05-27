- 每日一条
``` java11
var source = Linq.of(0, 1, 2, 3, 4);
var result = source.where(a -> a > 2).toList();
System.out.println(result);
----print
[3, 4]
```
Powered by [linq](https://github.com/timandy/linq)

- 每日一条
``` java11
var source = Linq.of(3, 4, 1, 2);
var result = source.where(a -> a % 2 == 0).select(a -> a * 2).toList();
System.out.println(result);
----print
[8, 4]
```
Powered by [linq](https://github.com/timandy/linq)
