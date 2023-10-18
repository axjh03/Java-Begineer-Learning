import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args)
    {
        LinkedList <String> linkdlst = new LinkedList<String>();
        linkdlst.add("A");
        linkdlst.add("B");
        linkdlst.addLast("C");
        linkdlst.addFirst("D");

        // Iterating through the list in forward direction
        for(int i=0; i < linkdlst.size(); i++){
            System.out.println(linkdlst.get(i));
        }

        // Iterating through the list in backward direction
        for(int i = linkdlst.size()-1; i >= 0; i--){
            System.out.println(linkdlst.get(i));
        }

        // Removing
        linkdlst.removeFirst();
        linkdlst.removeLast();
        linkdlst.remove(1);
        System.out.println(linkdlst);

        // .set() method
        linkdlst.set(0, "E");
    }
}
