package basics;

import java.util.stream.Stream;

public class DataProviders {
    public static Stream<Object[]> dataProviderForAdd() {
        return Stream.of(
                new Object[]{1, 2, 3},
                new Object[]{2, 4, 6},
                new Object[]{-1, 1, 0},
                new Object[]{11, 2, 13}
        );
    }
}