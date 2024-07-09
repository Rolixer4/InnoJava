package ru.inno.ru.inno.IntermediateCertification.Task3;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {1,5,7,3,2,0,4,9,6,16,6,11,2,32,64,14};
        int largest = 0;
        int secondLargest = 0;

        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else {
                if (j > secondLargest) {
                    secondLargest = j;
                }
            }
        }
        System.out.println(largest + " " + secondLargest);
    }
}
