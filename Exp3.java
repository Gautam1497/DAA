import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of Array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> frequencyMap = calculateFrequency(arr);

        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Frequency of "+entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    public static HashMap<Integer, Integer> calculateFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        return frequencyMap;
    }
}
