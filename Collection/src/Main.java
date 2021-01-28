import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> dsNguyen = new ArrayList<Integer>();
        dsNguyen.add(4);
        dsNguyen.add(7);
        dsNguyen.add(1);
        dsNguyen.add(8);
        System.out.println(dsNguyen.toArray().toString());
        for(Integer x : dsNguyen){
            System.out.print("   " + x);
        }
//        Collections.swap(dsNguyen,1, 2);
        Collections.sort(dsNguyen);
        System.out.println("\nSau khi sắp xếp");

        for(Integer x : dsNguyen){
            System.out.print("   " + x);
        }
//        Collections.swap(a, 0, 2);
//        Collections.shuffle(a);
//        Collections.sort(a);
//        Collections.reverse(a);
    }
}
