package Tasks;

public class Task7 {

	public static void main(String[] args) {
		int small, big;
		int [] array = {1,2,3,4,5};
		small=big=array[0];
		
		for (int i=0; i<array.length; i++) {
			if(array[i]>big) {
				big = array[i];
				
			}
			else if (array[i]<small) {
				small=array[i];
			}
		}
		System.out.println(small);
		System.out.println(big);
		
		

	}

}
