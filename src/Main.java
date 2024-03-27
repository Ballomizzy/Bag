import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        Bag<String> bagOfStrings = new Bag<String>();
        Bag<String> bag2 = new Bag<String>();

        bagOfStrings.add("Pencil");
        bagOfStrings.add("Pen");
        bagOfStrings.add("Eraser");
        bagOfStrings.add("Sharpener");
        bagOfStrings.add("Ruler");
        bagOfStrings.add("Scissors");
        bagOfStrings.add("Phone"); //add items

        bagOfStrings.printItems(); //check

        bagOfStrings.add("Toy");
        bagOfStrings.printItems();

        bagOfStrings.randomOrder(); //randomize

        bagOfStrings.printItems(); //check

        System.out.println(bagOfStrings.remove() + " was just removed!");

        bagOfStrings.printItems(); //check

        bag2 = bagOfStrings.remove(3);

        System.out.println(bagOfStrings.removeAndReplace() + " was just peeked!");

        System.out.println("The size of items in the bag is " + bagOfStrings.getSize());

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList = bagOfStrings.empty();

        System.out.println(arrayList);

        System.out.println("The size of items in the bag after emptying is " + bagOfStrings.getSize());


    }
}