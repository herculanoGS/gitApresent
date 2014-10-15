package gitFibo;

public class GitFibo {
	
		public static long fibo (int n){
			long a = 0;
			if(n< 2){
			 a=n;	
			}
			else
			 a= fibo(n - 1) + fibo(n - 2);	 
			return a;
			
		}public static void main(String[] args) {

		       for (int i = 0; i <= 30; i++) {
		         
		    	   System.out.print("F(" + i + "):" + GitFibo.fibo(i) + "\t");
		           System.out.print("oio");
		           System.out.print("teste");
		       }

			}

	}



