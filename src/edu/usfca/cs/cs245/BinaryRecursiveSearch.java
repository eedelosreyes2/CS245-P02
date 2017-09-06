package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "BinaryRecursive";
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		if (arr[mid] == target) {
			return mid;
		} if (arr[mid] > target) {
			return search(arr, target);
		} else {
			return search(arr, target);
		}
	}

}
