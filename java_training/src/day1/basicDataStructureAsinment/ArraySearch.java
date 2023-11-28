package day1.basicDataStructureAsinment;
import java.util.Arrays;
public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {14, 78, 19, 1, 23, 26, 35, 37, 7, 52, 26, 47};
        int valueToSearch = 19;
        System.out.println("Value " + valueToSearch + " found in array: " + ArraySearch.searchInArray(array, valueToSearch));
    }
    public static boolean searchInArray(int[] array, int value) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, value);
        return index >= 0;
    }
}
