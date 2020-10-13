import java.util.*;

public class Search {

    public static void main(String[] args) {

        //capacity of array
        int n=0;
        Scanner scan = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Indicate capacity of array: ");
                n = scan.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Capacity must be number more 10!!!");
                scan.next();
            }
            finally {
                if(n>=10) break;
            }
        }

        //fill initial array
        List<Integer> arr = new ArrayList<>(n);
        for(int i=1;i<=n;i++)
            arr.add(i);
        System.out.println("Initial array: "+arr);

        //removed element
        Random rand = new Random();
        int randIndex = rand.nextInt(arr.size());
        arr.remove(arr.get(randIndex));
        System.out.println("Array with removed element: "+arr);

        //shuffle array
        Collections.shuffle(arr);
        System.out.println("Shuffled array: "+arr);

        //find sum of elements in array with deleted element
        int sum = arr.stream().mapToInt(a -> a).sum();
        //find sum of elements in initial array
        int sum2 = n*(n+1)/2;
        int removedElement = sum2-sum;
        System.out.println("Removed element: " + removedElement);
    }
}
