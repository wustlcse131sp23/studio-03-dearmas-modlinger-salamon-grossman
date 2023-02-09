package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int temp = in.nextInt();

		int [] values = new int [temp];

		int count = 0;

		for (int i = 0; i<temp; i++) {

			values [i] = i+1;

			count = 0;

			for (int j = 0; j<=i; j++) {

				if (values[i]%values[j] == 0) {

					count++;

				}

			}
			
			if (count<3) {

				System.out.println (values[i]);
			}
		}	

	}

}


