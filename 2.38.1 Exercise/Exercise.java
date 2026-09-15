/*
 * Working with Arrays in Java: From Basics to Enhanced For Loops
 *
 * You are given an array of integers. Your task is to write a Java program
 * that finds and prints the smallest and largest numbers from the array
 * using an enhanced for loop (also known as a for-each loop).
 *
 * This will help you practice iterating through arrays efficiently
 * while tracking values.
 *
 * Instructions:

 * 1. Use the following array in your program:
 *
 *    int[] numbers = {45, 22, 89, 16, 90, 33};
 *
 * 2. Declare two variables:
 *
 *    One to keep track of the smallest number (initialize with the first element).
 *
 *    One to keep track of the largest number (also initialize with the first element).
 *
 * 3. Use a for-each loop to iterate over the array.
 *
 * 4. Update the smallest and largest variables as you compare each element.
 *
 * 5. Print both values using System.out.println() in this exact format:
 *
 *    Smallest: 16
 *    Largest: 90
 *
 *
 * Expected Output:
 *
 * Smallest: 16
 * Largest: 90
 */

public class Exercise {
    public static void main(String[] args) {
        int[] numbers = { 45, 22, 89, 16, 90, 33 };

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}