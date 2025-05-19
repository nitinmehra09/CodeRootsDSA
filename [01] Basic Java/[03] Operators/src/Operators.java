public class Operators {
    public static void main(String[] args) {
        // unary operators
        int a = 10;
        int ans = ++a + a++ + a-- - a++;
                    // 11 +11  +   12   - 11 = 23
        System.out.println("ans = " + ans);
        System.out.println("a = " + a);
        // a =12
        
        //Not operator(!=)

        //(~)
        int val1 = 11;
        System.out.println(~val1);


        //Arithmatic operator
        int div = 9/5;
        System.out.println(div);

        //logical operator
        if (true && true ){
            System.out.println("this code is not run");
        }
         
        //Shif Operator
        int p = 2 ;
        p = p<<2;
        System.out.println(p);

        //instanceof {}
        // to check it is object of class or not 

        //ternary operator
        boolean f = a>val1;
        System.out.println(f);
    }
}
