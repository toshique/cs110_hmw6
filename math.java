public class math{

public static int factorial(int n){
	if (n == 0){
		return 1;
		}
		return n*factorial(n-1);
		}

public static int factoriall(int n){
		int l = 1;
        	for (int i = 1; i <= n; i = i + 1){
            	l = l * i;
    		}
        	return l;
}

}
