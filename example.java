import java.time.Duration;

public class example {
    private int l,b;
    public example(){
        l=10; b=8;
        System.out.println(l +" "+ b);
    }
    public example(int l,int b){
        this.l=l;
        this.b=b;
        System.out.println(l +" "+ b);
    }
    public static void main(String[] args) {
       example e1=new example();
       example e2=new example(2,5);
    }
}