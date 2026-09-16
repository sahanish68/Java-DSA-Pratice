
import java.util.ArrayList;

public class subSetsofNaturalNUmber {

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.println(subset.get(i));

        }
        System.out.println("");

    }
    public static void subsets(int n, ArrayList<Integer> subset){
        if (n < 0){
            return;
        }
        if (n == 0){
            printSubset(subset);
            return;
        }

        // to add
        subset.add(n);
        subsets(n - 1, subset);

        // remove
        subset.remove(subset.size() - 1);
        subsets(n - 1, subset);
    }

    public static void main(String[] args){
        int n = 9;
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n, subset);
    }
}
