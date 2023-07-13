import java.util.*;

public class Main {
    public static void main(String[] args) {
        //collectionTask1();
        //collectionTask2();
        collectionTask3();
    }

    public static void collectionTask1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Oleg", 32);
        map.put("Pasha", 12);
        map.put("Robert", 21);
        map.put("Mateusz", 101);
        map.put("Dima", 1);
        map.put("Denys", 3);
        map.put("Tomasz", 24);
        map.put("Bartek", 13);
        map.put("Vania", 9);
        map.put("Andrey", 10);

        for (Map.Entry<String, Integer> mapping : map.entrySet()) {
            System.out.println(mapping.getKey() + mapping.getValue());
        }

    }

    public static void collectionTask2() {
        Collection<String> array = new ArrayList<>();
        array.add("Java");
        array.add("Python");
        array.add("Perl");
        array.add("C++");
        array.add("Java");
        array.add("C++");
        array.add("C#");

        array = new HashSet<>(array);

        System.out.println(array);
    }



    public static void collectionTask3(){
        //[1,2,3,5,4,3,2,1,2,3,5] -
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(list);

        int count = counterCatch(2,list);

        System.out.println(count);


    }

    public static int counterCatch(int number, List<Integer> list){
     int count = 0;
        for (int num : list ) {
         if(num == number){
             count++;
         }
        }
        return count;
    }
}