import java.util.ArrayList;

public class minimum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1024);
        list.add(200);
        list.add(34);
        list.add(400);
        System.out.println("Min: " + min(list)+"\nMax: " + max(list));
    }

    // Minimum element in an ArrayList
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E min = list.get(0);
        for(E e : list){
            if(e.compareTo(min) < 0){
                min = e;
            }
        }
        return min;
    }

    // Maximum element in an Array
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max = list.get(0);
        for(E e : list){
            if(e.compareTo(max) > 0){
                max = e;
            }
        }
        return max;
    }
}
