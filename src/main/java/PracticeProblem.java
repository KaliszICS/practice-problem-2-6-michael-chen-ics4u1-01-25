public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(insertionSort(new double[]{155.2, 155.1, 1, 5, 3, 2, 7})[0]);
	}

	public static int[] bubbleSort(double[] nums) {
		int[] si = new int[]{0, 0};
		boolean swapped;
		for (int i = 0; i < nums.length; i++) {
			swapped = false;
			// si[0]++;
			for (int j = 1; j < nums.length - i; j++) {
				si[1]++;
				if (nums[j] < nums[j - 1]) {
					double temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
					si[0] += 3;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return si;
	}

	public static int[] selectionSort(double[] nums) {
		int[] si = new int[]{0, 0};
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = i;
			// si[0]++;
			for (int j = i + 1; j < nums.length; j++) {
				si[1]++;
				if (nums[minIndex] > nums[j]) {
					minIndex = j;
					si[0]++;
				}
			}
			double temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
			si[0] += 3;
		}
		return si;
	}

	public static int[] insertionSort(double[] nums) {
		int[] si = new int[]{0, 0};
		for (int i = 1; i < nums.length; i++) {
			double key = nums[i];
			int index = i - 1;
			si[0]++;
			while (index >= 0 && nums[index] > key) {
				si[1]++;
				nums[index + 1] = nums[index];
				index--;
				si[0]++;
				for (double n : nums) {
					System.out.print(n + " ");
				}
				System.out.println(i);
			}
			nums[index + 1] = key;
			si[0]++;
		}
		for (double n : nums) {
			System.out.print(n + " ");
		}
		return si;
	}

	public static String leastSwaps(double[] nums) {
		int bubble = bubbleSort(nums.clone())[0];
		int selection = selectionSort(nums.clone())[0];
		int insertion = insertionSort(nums.clone())[0];
		if (bubble < selection && bubble < insertion) {
			return "Bubble";
		} else if (selection < bubble && selection < insertion) {
			return "Selection";
		} else if (insertion < bubble && insertion < selection) {
			return "Insertion";
		} else if (insertion == bubble || bubble == selection) {
			return "Bubble";
		} else if (insertion == selection) {
			return "Insertion";
		} else {
			return "Selection";
		}
	}

	public static String leastIterations(double[] nums) {
		int bubble = bubbleSort(nums.clone())[1];
		int selection = selectionSort(nums.clone())[1];
		int insertion = insertionSort(nums.clone())[1];
		if (bubble < selection && bubble < insertion) {
			return "Bubble";
		} else if (selection < bubble && selection < insertion) {
			return "Selection";
		} else if (insertion < bubble && insertion < selection) {
			return "Insertion";
		} else if (insertion == bubble || bubble == selection) {
			return "Bubble";
		} else if (insertion == selection) {
			return "Insertion";
		} else {
			return "Selection";
		}
	}
}
