package coders.iyun24;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TamEded {

}

class Main{
    @TamEded
    private int a;

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return this.a;
    }

    public static void main(String[] args) {
       Main main = new Main();
       main.setA(5555);
        System.out.println(main.getA());
    }
}
