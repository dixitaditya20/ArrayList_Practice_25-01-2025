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
        System.out.println("1st Array List is created " + arr);
        // Insert End

        // Extract Data Start
        System.out.println("1st Element is extracted -> " + arr.get(0));
        // Advanced For loop Start
        for (int i : arr) {
            System.out.println("Data Extraction for advanced for loop -> " + i);
        }
        // Advanced For loop End
        // Extract Data End

        //Modify Data Start
        arr.add(0, 9);
        System.out.println("0th position is updated -> " + arr);
        //Modify Data End

        //setting the value at index 1 Start
            arr.set(1, 10);
        System.out.println("1st position is reset -> " + arr);
        //setting the value at index 1 End

        //Delete Data Start
            arr.remove(2);
        System.out.println("2nd position is deleted -> " + arr);
        //Delete Data End

    }
}