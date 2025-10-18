
class Notes {
	public static void main(String[] args) {


		int[] numArray = {3, 8, 3, 4, 6, 9, 1, 2, 6, 55, 44, 33};

		for (int i = 1; i < numArray.length; i++) {
			//go through the array
			//set our number - get a copy of it
			int key = numArray[i];
			int index = i - 1;
			while (index >= 0 && numArray[index] > key) {
				numArray[index + 1] = numArray[index];
				index--;
			}
			numArray[index + 1] = key;
		}


		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
	}
}
