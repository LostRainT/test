package ArrayTests2;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] s1 = {"11","22","33","44","55","66"};
		String[] s2 = new String[(s1.length+5)];
		
		System.arraycopy(s1, 0, s2, 5, s1.length);
		
		
		//for each
		for(String x : s2){
			System.out.println(x);
		}
		//normal forever
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		
		
		
	}
}
