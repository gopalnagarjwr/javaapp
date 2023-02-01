public class App {
    public static void main(String[] args){
   //     int a=40;
   //   int b=20;
   //   int c=30;
   //   if(a>b && a>c){
   //      System.out.println("a is big");
   //   }
   //   else if(b>a && b>c){
   //      System.out.println("b is big ");
   //   }
   //   else {
   //           System.out.println("a b c is equal");
   //   }

    int a=15;
    int flag=0;
    for(int i=2; i<a; ++i){
        if(a%i==0){
            flag=1;
            break;
        }
    }
    if(flag==1){
        System.out.println("composite num");
    }
    else{
        System.out.println("primery num");
    }


    // double a=10.3;
    // double b=20.2;
    // a=a*b;
    // b=a/b;
    // a=a/b;
    // System.out.println("after swaping value of a =" + a);
    // System.out.println("after swaping value of b =" + b);

    }
}

