import java.util.Arrays;

public class sortDemo2 {
	public static void main(String[] args) {
		final int N = 50000000;
		int[] nums1 = new int[N];
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int)(Math.random() * 10000000);
		}
		long startTime = System.currentTimeMillis();
		Arrays.sort(nums1);
		long endTime = System.currentTimeMillis();
		System.out.println("¹²ºÄÊ±£º" + (endTime - startTime) + "ºÁÃë");
	}
}
