package src.com.practice;

public interface FourWheeler {

     void printMe();

     default void general(){
          System.out.println("in general method");
     }
}
