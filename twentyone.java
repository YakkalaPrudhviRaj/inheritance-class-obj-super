class twentyone{
    public static void main(String[] args){

        Sample obj = new Sample();
        obj.sample("house1");
        obj.sample("house1","house2");
        obj.sample("house1","house2","house3");
        
    }

}
class Sample{
    String a, b,c;
 
    //Constructor
    void sample(String i){
        a=i;
        int cost=10000;
        System.out.print("For renting single house"+a+":");
        System.out.println(cost);
        System.out.print("For buying single house"+a+":");
        System.out.println(cost);

    }
    void sample(String i, String j)
    {
        a=i;
        b=j;
        int cost1=10000;
        int cost2=15000;
        int cost=cost1+cost2;
        System.out.print("For renting two houses "+a+" "+b+":");
        System.out.println(cost*1.10);
        System.out.print("For buying two houses "+a+" "+b+":");
        System.out.println(cost*0.9);
        
    }
    void sample(String i, String j,String k){
        a=i;
        b=j;
        c=k;
        int cost1=10000;
        int cost2=15000;
        int cost3=20000;
        int cost=cost1+cost2+cost3;
        System.out.print("For renting three houses "+a+" "+b+" "+c+":");
        System.out.println(cost*1.15);
        System.out.print("For buying three houses "+a+" "+b+" "+c+":");
        System.out.println(cost*.85);

    }
}