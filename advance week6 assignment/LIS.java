public class LIS {
    static void Lis(int ar[])
    {
     int ar1[]=new int[ar.length];
     int max=0;
     for(int i=0;i<ar.length;i++)
         ar1[i]=1;
     for(int i=1;i<ar.length;i++)
     {
       for(int j=0;j<i;j++)
       {
         if(ar[i]>ar[j] && ar1[i]<ar1[j]+1)
             ar1[i]=ar1[j]+1;
       }
     }
     for(int i=0;i<ar.length;i++)
         if(max<ar1[i])
             max=ar1[i];
        System.out.println(max);
    }
     
    public static void main(String[] args) {
        
        int ar[]=new int[]{2,7,4,5,6,20,30};
        Lis(ar);
    }
}
