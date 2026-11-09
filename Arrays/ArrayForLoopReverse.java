class ArrayForLoopReverse{
	public static void main(String args[]){
	
		int[] y = {10, 20, 30, 40 , 50};
	
		for (int i = y.length - 1; i >= 0; i--) {
			System.out.println(y[i]);
		}
	}
}