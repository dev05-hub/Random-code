import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class Solution{
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        Vector<Integer> v = new Vector<>();
        for(int i = 1;i<=5 ;i++){
            a.add(i);
            v.add(i);
            l.add(i);
        }
        for(int i = 1;i<=5 ;i++){
            System.out.println(v.get(i));
            System.out.println(l.get(i));

            System.out.println(a.get(i));

        }

    }
}
