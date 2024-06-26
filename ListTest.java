/** Tests the methods of the List class.  */
public class ListTest {

    private static List list;

    private static MemBlock fb1 = new MemBlock(208, 10);
    private static MemBlock fb2 = new MemBlock(352, 12);
    private static MemBlock fb3 = new MemBlock(250, 20);

    private static MemBlock ab1 = new MemBlock(50, 3);
    private static MemBlock ab2 = new MemBlock(370, 2);

    public static void main(String[] args) {
        // Uncomment the tests you want to run
        //testAddLast();
        //testAddFirst();
        //testGetNode();
        //testGetBlock();
        //testIndexOf();
        //testAdd1();
        //testAdd2();
        //testRemoveFirst();
        //testRemove();
    }

    private static void testAddLast() {
        list = new List();
        System.out.println("Initial list: " + list);

        list.addLast(fb1);
        System.out.println("After adding fb1: " + list);

        list.addLast(fb2);
        System.out.println("After adding fb2: " + list);

        list.addLast(fb3);
        System.out.println("After adding fb3: " + list);
    }

    private static void testAddFirst() {
        list = new List();
        System.out.println("Initial list: " + list);

        list.addFirst(ab1);
        System.out.println("After adding ab1 first: " + list);

        list.addFirst(ab2);
        System.out.println("After adding ab2 first: " + list);
    }

    private static void testGetNode() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.addLast(fb3);

        System.out.println("Get node at index 2: " + list.getNode(2));
    }

    private static void testGetBlock() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.addLast(fb3);

        System.out.println("Get block at index 2: " + list.getBlock(2));
    }

    private static void testIndexOf() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.addLast(fb3);

        System.out.println("Index of fb2: " + list.indexOf(fb2));
    }

    private static void testAdd1() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.add(1, fb3);
        System.out.println("List after adding fb3 at index 1: " + list);
    }

    private static void testAdd2() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.add(0, ab1);
        System.out.println("List after adding ab1 at index 0: " + list);
    }

    private static void testRemoveFirst() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.addLast(fb3);
        list.removeFirst();
        System.out.println("List after removing first element: " + list);
    }

    private static void testRemove() {
        list = new List();
        list.addLast(fb1);
        list.addLast(fb2);
        list.addLast(fb3);
        list.remove(fb2);
        System.out.println("List after removing fb2: " + list);
    }
}
