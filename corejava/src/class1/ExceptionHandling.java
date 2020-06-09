package class1;

public class ExceptionHandling {
//
	public static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dividebyzero();
	}

	public static void dividebyzero(){
		try{
		int n=10;
		int a[] ={2,4,6};
		System.out.println(i);

		System.out.println(n);
		System.out.println(a[3]);
		System.out.println(5/0);
		System.out.println(i);

		}catch(ArithmeticException e){
			System.out.println(e);
			
		}catch(Exception e){
			System.out.println(e);
			
		}
	}
}
