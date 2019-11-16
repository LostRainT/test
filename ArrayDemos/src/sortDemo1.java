
public class sortDemo1 {
	public static void main(String[] args) {
		final int N = 50000000;
		int[] nums1 = new int[N];
		int[] nums2 = new int[N];
		int[] nums3 = new int[N];
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int)(Math.random() * 500000000);
			nums2[i] = nums1[i];
			nums3[i] = nums2[i];
		}
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < nums1.length - 1; i++) {
			for (int j = 0; j < nums1.length - i - 1; j++) {
				if(nums1[j] > nums1[j + 1]) {
					int temp = nums1[j];
					nums1[j] = nums1[j + 1];
					nums1[j + 1] = temp;
					
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("√∞≈›≈≈–Úπ≤∫ƒ ±£∫" + (endTime - startTime) + "∫¡√Î");
	}
	
	
}
