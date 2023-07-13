

	public class Binary_Search_Q6 {
	    public static int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            // Check if the array is already sorted
	            if (nums[left] < nums[right]) {
	                return nums[left];
	            }

	            int mid = left + (right - left) / 2;

	            if (nums[mid] >= nums[left]) {
	                // Minimum element is on the right side
	                left = mid + 1;
	            } else {
	                // Minimum element is on the left side, including mid
	                right = mid;
	            }
	        }

	        return nums[left];
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 4, 5, 1, 2};
	        int minElement = findMin(nums);
	        System.out.println("Minimum element: " + minElement);
	    }
	}


