public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Element at index 1: " + list.get(1));

        list.add(1, 15);
        System.out.println("Element at index 1 after insert: " + list.get(1));

        list.remove(2);
        System.out.println("Element at index 2 after remove: " + list.get(2));

        System.out.println("Size: " + list.size());


        for (Integer num : list) {
            System.out.println(num);
        }
    }
}