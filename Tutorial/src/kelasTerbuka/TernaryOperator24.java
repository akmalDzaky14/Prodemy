package kelasTerbuka;

import java.util.Scanner;

public class TernaryOperator24 {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=swDXko04U1E&list=PLZS-MHyEIRo51w0Hmqi0C8h2KWNzDfo6F&index=32&ab_channel=KelasTerbuka
		// ternary operator

		int input, x;

		try (Scanner inputUser = new Scanner(System.in)) {
			System.out.print("masukan nilai: ");
			input = inputUser.nextInt();
			// variable x = ekspresi ? statement_true : statement_false
		}

		x = (input == 10) ? (input * input) : (input / 2);

//        jika memakai if
//        if (input==10){
//            x = input*input;
//        }else{
//            x = input/2;
//        }

		System.out.println("hasilnya " + x);

	}

}
