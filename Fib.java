
public class Fib
{	
	public int fibo(int n){
	int result = 0;
	if(n==0){
		result = 0;
	return result;
	}
	
	else if(n ==1){
		result =1;
		return result;
	}
	
	else{
		result = fibo(n-1)+fibo(n-2);
		return result;
	}
	}
	
	public static void main(String args[]){
	
	recFibonacci fibonacci =new recFibonacci();
	int n=6;

	for(int i =0;i<=n;i++)
			{
			int result = fibonacci.fibo(i);
			System.out.print( result + " ");
			}
			
	}
}