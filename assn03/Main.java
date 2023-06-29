package assn03;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        //System.out.println(list);
        list.merge(list2);
        //System.out.println(list.isEqual(list2));
        //list.reverse();
        System.out.println(list);
        //list.removeAtIndex(4);
        //System.out.println(list);
        //System.out.println(list);
    }
}
