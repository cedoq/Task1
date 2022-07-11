import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i;
        int[] List = new int[10];
        for(i = 0; i<= List.length-1;i++){
            List[i] = (int)( Math.random()*10);
        }
        int[] l1 = new int[5];
        Integer[] l2 = new Integer[5];
        for(i=0;i<=l1.length-1;i++){
            l1[i] = List[i];
        }
        for(i=0;i<=l2.length-1;i++){
            l2[i] = List[i+l1.length];
        }
        Arrays.sort(l1);
        Arrays.sort(l2, Collections.reverseOrder());
        System.out.println(Arrays.toString(List));
        System.out.println(Arrays.toString(l1));
        System.out.println(Arrays.toString(l2));
    }
}