import java.util.*;

public class Bag <T>{
    ArrayList<T> items = new ArrayList<T>();
    public void add(T item){
        items.add(item);
    }

    public T remove(){
        Random rand = new Random();
        int n = rand.nextInt(items.size());
        T itemToReturn = items.get(n);
        items.remove(n);
        return itemToReturn;
    }

    public Bag<T> remove(int num){
        Bag<T> newBag = new Bag<T>();
        for(int i = 0; i < num; i++){
            newBag.add(remove());
        }
        return newBag;
    }

    public void add(Bag<T> items){
        for(T item : items.items){
            add(item);
        }
    }

    public Bag<T> randomOrder(){
        Bag<T> bag = new Bag<T>();
        bag.items = this.items;
        Collections.shuffle(bag.items);
        return bag;
    }

    public ArrayList<T> empty(){ //returns all items in the bag as an array list
        Bag<T> bag = new Bag<T>();
        bag.items = this.items;
        ArrayList<T> newArrayList = new ArrayList<T>(bag.items);
        items.clear();
        return newArrayList;
    }

    public T removeAndReplace(){
        Random rand = new Random();
        int n = rand.nextInt(items.size());
        return items.get(n);
    }

    public int getSize(){
        return items.size();
    }

    public void printItems(){
        for(T item : items){
            System.out.println(item + " \n");
        }
    }

}
