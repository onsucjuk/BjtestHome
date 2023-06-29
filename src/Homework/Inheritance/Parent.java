package Homework.Inheritance;

public class Parent {
    public int cal(int a, int b){
        return a + b;
    }

    public class Child extends Parent {
        @Override
        public int cal(int a, int b){
            return a / b;
        }
        
        //Overload
        public int cal(int a, int b, int c){
            return a + b + c;
        }
    }
}


