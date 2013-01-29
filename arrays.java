
class arrays {

	/**
	 * 		arrays
	 *
	 * 			Methods for dealing with arrays
	 *
	 * 		Matthew Price
	 */

	public static void main(String[] args) {
		int[] nums = {3, 6, 4, 3, 2, 1, 5, 6};

		System.out.println(avg(nums));
	}


	/**
	 *avg
	 *		Finds the mean of an array
	 *
	 * @param nums - the array
	 * @return the mean
	 */
	public static double avg(int[] nums) {
		return sum(nums)/nums.length;
	}

	/**
	 * sum
	 * 		Finds the sum of an array
	 *
	 * @param nums - the array
	 * @return the sum
	 */

	public static int sum(int[] nums) {
		int temp = 0;
		for(int i = 0; i < nums.length; i++) {
			temp += nums[i];
		}
		return temp;
	}
	
}