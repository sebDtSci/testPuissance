class Fibo{
	public static void main(String[] args){
		print(fibo(10));
	}

	public static int fibo(int n){
		if (n == 0 || n == 1){
			return  1;
		}else{
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	public static <T> void print(T s){
		System.out.println(s);
	}
}
