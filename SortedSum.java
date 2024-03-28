import java.util.Arrays;



public class SortedSum {

	

	

	public int[] twoSum(int[] numbers, int target) {

	    int left = 0;

	    int right = numbers.length - 1;

	    

	    while (left < right) {

	        int sum = numbers[left] + numbers[right];

	        if (sum == target) {

	            return new int[]{left + 1, right + 1}; // indices are 1-indexed

	        } else if (sum < target) {

	            left++;

	        } else {

	            right--;

	        }

	    }

	    

	    return new int[]{-1, -1};

	}



	public static void main(String[] args) {

		

		SortedSum sum = new SortedSum();

		int numbers[] = {2,7,11,15};

		int	target = 9;

		try {

			int[] result = sum.twoSum(numbers, target);

			System.out.println(Arrays.toString(result));

		} catch (Exception e) {

			System.out.println("Exception Occurred " + e.getMessage());

		}

		



	}



}