class Fibonacci{
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1+" "+n2); //to print 0,1

        for(i=2;i<count;++i) //loop starts from 2 because 0,1 already print and 2 is lowest possible factor of composite
        { 
        n3=n1+n2;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;
        
     }
     
    }}