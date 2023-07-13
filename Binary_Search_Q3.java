
public class Binary_Search_Q3 {
	
	    public static int findMissingNumber(int[] nums) {
	        int n = nums.length;
	        int sum = (n * (n + 1)) / 2;

	        for (int num : nums) {
	            sum -= num;
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 0, 1};
	        int missingNumber = findMissingNumber(nums);
	        System.out.println("Missing number: " + missingNumber);
	    }
	}

