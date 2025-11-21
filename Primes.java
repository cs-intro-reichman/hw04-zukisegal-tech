public class Primes
 {
    public static void main(String[] args)
    {
        int n= args.length;
        boolean[] isPrime= new boolean[n+1];
        for (int i = 2; i <= n; i++) 
        {
            isPrime[i] = true;
        }

        for(int j=2; j*j<=n; j++)
        {
             isPrime[j]=false;
             if(isPrime[j]==true)
            {
                for(int i=j*j; i<=n; i++)
                    isPrime[i]=false;
            }
        }
        for(int i=2; i<=n; i++)
        {
            int count=0;
            if(isPrime[i]==true)
            {
                count++;
                System.out.println(isPrime[i]);
            }
             System.out.println("There are " +  count + "primes between 2 and" + n );
        }
       

    }
}
