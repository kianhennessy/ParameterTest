import java.util.Scanner;

public class ParameterTest{


	//First menu
	public static void menu1(){
		System.out.println("===================================");
		System.out.println("1 - Create a random integer array");
		System.out.println("2 - Exit");
		System.out.println("===================================");
	}

	//Second menu
	public static void menu2(){
			System.out.println("===================================");
			System.out.println("1 - Create a random integer array");
			System.out.println("2 - Print array");
			System.out.println("3 - Print max value");
			System.out.println("4 - Print min value");
			System.out.println("5 - Print array sum");
			System.out.println("6 - Exit");
			System.out.println("===================================");
	}

	//Create array from user input
	public static int[] createArray(int size, int upper, int lower){
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*(upper - lower)) + lower;
		}
		return array;
	}

	//Print array
	public static void printArray(int[] array){

		System.out.print("Array { ");
			for(int i = 0; i < array.length; i++){
				System.out.printf("%d ",array[i]);
			}
				System.out.printf("}. \n\n");
	}

	public static int maxValue(int[] array){
		int max;
		max = array[0];
		for(int j = 0; j < array.length; j++)
			if(array[j] > max){
				max = array[j];
			}
			return max;
	}

	public static int minValue(int[] array){
		int min;
		min = array[0];
		for(int k = 0; k < array.length; k++)
			if(array[k] < min){
				min = array[k];
			}
			return min;
	}

	public static int sum(int[] array){
		int sum = 0;
		for(int m = 0; m < array.length; m++)
			sum = sum + array[m];
		return sum;
	}




	public static void main(String[] args){

		System.out.printf("\nPlease select an option\n\n");

		menu1();

		Scanner in = new Scanner(System.in);
		int mainchoice = in.nextInt();


		while(mainchoice == 1){

				System.out.printf("Please select the size of the array: ");
				int size = in.nextInt();

				System.out.printf("please select the highest integer value: ");
				int upper = in.nextInt();

				System.out.printf("Please select the lowest integer value: ");
				int lower = in.nextInt();

				int[] numbers = createArray(size, upper, lower);

					System.out.printf("\nYour array has been created\n\n");

					menu2();

				int nextchoice = 0;

					while(nextchoice != 6){
						nextchoice = in.nextInt();
						if(nextchoice == 1){
							System.out.printf("Please select the size of the array: ");
							 size = in.nextInt();

							System.out.printf("please select the highest integer value: ");
							 upper = in.nextInt();

							System.out.printf("Please select the lowest integer value: ");
							 lower = in.nextInt();

							 numbers = createArray(size, upper, lower);

							System.out.printf("\nYour array has been created\n\n");

							menu2();
						}


						else if(nextchoice == 2){
							printArray(numbers);
							menu2();
						}

						else if(nextchoice == 3){

							System.out.println("Highest value in the array = " + maxValue(numbers));
							menu2();
						}

						else if(nextchoice == 4){

							System.out.println("Lowest value in the array = " + minValue(numbers));
							menu2();

						}

						else if(nextchoice == 5){

							System.out.println("The sum of the array is = " + sum(numbers));
							menu2();

						}




					}
					System.out.print("To exit array press 6 again: ");
					mainchoice = in.nextInt();

			}

	}
}