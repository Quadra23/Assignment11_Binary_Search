

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class Binary_Search_Q8 {
	    public static int[] intersect(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<>();
	        List<Integer> intersect = new ArrayList<>();

	        // Count the occurrences of each element in nums1
	        for (int num : nums1) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        // Find the intersecting elements in nums2 and decrement the count in the map
	        for (int num : nums2) {
	            if (map.containsKey(num) && map.get(num) > 0) {
	                intersect.add(num);
	                map.put(num, map.get(num) - 1);
	            }
	        }

	        // Convert the list to an array
	        int[] result = new int[intersect.size()];
	        for (int i = 0; i < intersect.size(); i++) {
	            result[i] = intersect.get(i);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 2, 1};
	        int[] nums2 = {2, 2};
	        int[] intersection = intersect(nums1, nums2);
	        System.out.print("Intersection: ");
	        for (int num : intersection) {
	            System.out.print(num + " ");
	        }
	    }
	}

