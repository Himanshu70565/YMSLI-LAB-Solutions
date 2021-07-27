package work.solution.lab1;

public class Array {
	
	//this method returns a copy of input array
	public static int[] copyOf(int[] array) {

		int size = array.length;
		int newArray[] = new int[size];

		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}

		return newArray;
	}
	
	public static void printArray(int array[]) {
		
		int size=array.length;
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int inputArray[]= {1,2,3,4};
		System.out.println("Input Array :");
		printArray(inputArray);
		
		int outputArray[]=copyOf(inputArray);
		System.out.println("Output Array :");
		printArray(outputArray);
		
	}
}
