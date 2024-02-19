import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

 /**Не использовать циклы (for/while/do-while).
  * Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
  * Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100.
  * Отсортировать по возрастанию. Пропустив первые 3 числа произвести следующие операции:
  Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).
  */

public class Task1 {
    public static void main(String[] args) {
        List<Long> numbers = new Random()
                .longs(100, 0, 100)
                .mapToObj(num -> (long) (num * Math.PI - 20))
                .filter(num -> num < 100)
                .sorted()
                .skip(3)
                .collect(Collectors.toList());

        Map<Long, String> numberMap = numbers.stream()
                .collect(Collectors.toMap(
                        num -> num,
                        num -> "Number: " + num,
                        (existingValue, newValue) -> existingValue
                ));

        System.out.println(numberMap);
    }
}


