
public class Binary_Search_Q4 {
	
	    public static int findRepeatedNumber(int[] nums) {
	        int slow = nums[0];
	        int fast = nums[0];

	        // Find the intersection point of the two pointers
	        do {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        } while (slow != fast);

	        // Move one pointer back to the start and keep the other at the intersection point
	        slow = nums[0];
	        while (slow != fast) {
	            slow = nums[slow];
	            fast = nums[fast];
	        }

	        return slow;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 2, 2};
	        int repeatedNumber = findRepeatedNumber(nums);
	        System.out.println("Repeated number: " + repeatedNumber);
	    }
	}

