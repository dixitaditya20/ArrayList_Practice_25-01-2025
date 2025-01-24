import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Insert Start
        arr.add(0);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        System.out.println(arr);
        // Insert End

        // Extract Data Start
        System.out.println(arr.get(0));

        // Advanced For loop Start
        for (int i : arr) {
            System.out.println("Data Extraction for advanced for loop -> " + i);
        }
        // Advanced For loop End

        // Extract Data End
    }
}