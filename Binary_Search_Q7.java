
public class Binary_Search_Q7 {
	
	    public static int[] searchRange(int[] nums, int target) {
	        int[] result = {-1, -1};

	        int leftIndex = findLeftIndex(nums, target);
	        if (leftIndex == -1) {
	            return result;
	        }

	        int rightIndex = findRightIndex(nums, target);

	        result[0] = leftIndex;
	        result[1] = rightIndex;

	        return result;
	    }

	    private static int findLeftIndex(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        int leftIndex = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] >= target) {
	                right = mid - 1;
	                if (nums[mid] == target) {
	                    leftIndex = mid;
	                }
	            } else {
	                left = mid + 1;
	            }
	        }

	        return leftIndex;
	    }

	    private static int findRightIndex(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        int rightIndex = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] <= target) {
	                left = mid + 1;
	                if (nums[mid] == target) {
	                    rightIndex = mid;
	                }
	            } else {
	                right = mid - 1;
	            }
	        }

	        return rightIndex;
	    }

	    public static void main(String[] args) {
	        int[] nums = {5, 7, 7, 8, 8, 10};
	        int target = 8;
	        int[] range = searchRange(nums, target);
	        System.out.println("Range: [" + range[0] + ", " + range[1] + "]");
	    }
	}

