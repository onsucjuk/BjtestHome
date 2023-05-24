package PracticInterface.interfaceImple;

public class DogImple {
    public static void main(String[] args){

        Dog myPuppy = new Dog();

        //아래 세 명령은 Animal 인터페이스를 implements하는 Dog클래스에 오버라이드 선언된 메서드 명령어

        myPuppy.eat();
        myPuppy.move();
        myPuppy.bark();

    }
}
