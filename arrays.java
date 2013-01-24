
class arrays {

	public static void main(String[] args) {
		int[] nums = {3, 6, 4, 3, 2, 1, 5, 6};

		System.out.println(avg(nums));
	}

	public static double avg(int[] nums) {
		return sum(nums)/nums.length;
	}

	public static int dum(int[] nums) {
		double temp = 0;
		for(int i = 0; i < nums.length; i++) {
			temp += nums[i];
		}
		return temp;
	}
}