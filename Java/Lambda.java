// Lambda.java

import java.util.function.Function;

class Lambda {
    
    public static void main(String[] args) {
        
        System.out.println(
            ((Function<Integer,Integer>)(x -> x + 2)).apply(3)
          );
        
    }
}
