
class TestClass {
    public static void main(String args[] ) throws Exception {
        int num=49;
        int count=0;
        boolean[] list=new boolean[num+1];
        
        for(int i=2; i*i<=num; i++)
        {
            if(!list[i])
            {
                for(int j=i*i; j<num; j += i)
                {
                    count++;
                    list[j]=true;
                }
            }
        }
        for(int i=2; i<num; i++)
        {
            if(!list[i])
                System.out.println(i);
        }
        System.out.println(count);
    }
}
