//1.Создать массив с набором слов(10-20слов,должны встречаться повторяющиеся).
//Найти и вывести список уникальных слов,из которых состоит массив
//(дубликаты не считаем).Посчитать сколько раз встречается каждое слово.
//
//2.Написать простой класс ТелефонныйСправочник,который хранит в себе список фамилий и телефонных номеров.
//В этот телефонный справочник с помощью метода add()можно добавлять записи.
//С помощью метода get()искать номер телефона по фамилии.
//Следует учесть,что под одной фамилией может быть несколько телефонов
//(в случае однофамильцев),тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

//        п.1

        ArrayList<String> list = new ArrayList<>(10);
        list.add("Слово");
        list.add("раз");
        list.add("Слово");
        list.add("да");
        list.add("раз");
        list.add("зачем");
        list.add("этот");
        list.add("Список");
        list.add("раз");
        list.add("нет");

        HashMap<String, Integer> countWords = new HashMap<>();

        System.out.println("Оригинальный список:");

        for (String word : list) {
            System.out.println(word);
        }

        for (String word : list) {
            if (!countWords.containsKey(word)) {
                countWords.put(word, 1);
            } else {
                countWords.put(word, countWords.get(word) + 1);
            }
        }
        System.out.println();


        System.out.println("Список с уникальными значениями и количеством повторений:");

        for (Map.Entry<String, Integer> word : countWords.entrySet()) {
            System.out.println(word.getKey() + " повторяется " + word.getValue() + " раз.");
        }

        System.out.println();

//        п.2

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", 123455L);
        phoneBook.add("Петров", 123123L);
        phoneBook.add("Сидоров", 122111L);
        phoneBook.add("Иванов", 199999L);

        System.out.println(phoneBook.get("Иванов"));


    }

}
