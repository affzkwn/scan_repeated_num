package com.quiz.scan_repeated_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ScanRepeatedNumApplication {

	public static void main(String[] args) {
		/**
		 * Write a program that reads an array of ints and an integer number n.

			The program must check how many times n occurs in the array.

			Input data format
			The first line contains the size of the input array.

			The second line contains elements of the array separated by spaces.

			The third line contains n.

			Output data format

			The result is only a single non-negative integer number.
		 */
		Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        int[] array = new int[index];
        
        for (int i = 0; i < index; i++) {
            array[i] = scan.nextInt();
        }
        
        int n = scan.nextInt();
        int repCount = 0;

        for (int j = 0; j < index; j++) {
            if(array[j] == n) {
                repCount++;
            } 
        }
        System.out.println(repCount);
		scan.close();
	}

}
