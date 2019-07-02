// Java program prints prime numbers smaller than n 
class Prime_Number
{ 
    public static void main(String[] args)
    { 
        int n=50;
        double fact = 1;
        int count=0;
	for(int i=2;i<n;i++)
        { 
            count++;
            fact = fact * (i - 1); 
            if ((fact + 1) % i == 0) 
			System.out.println(i); 
	} 
        System.out.println("\n"+count);
    }
} 

