package Tasks;

public class Task6 {

	public static void main(String[] args) {
int num1=0, num2=1, sum;
		
		for(int i=0; i<10; i++) {
			System.out.println(num1+num2);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}

	}

}
