package Homework;
public class Ex_Inheritance {
        public static void main(String[] args) {

            Dog myDog1 = new Puppy("Happy","Maltese", 1);
            Puppy myDog2 = new Puppy("Lucky","Poodle", 2);
            Dog myDog3 = new Dog("Bbobby","Pomeranian",4);

            System.out.println("제 첫 번째 애견의 이름은 " + myDog1.getName() + "입니다.");
            System.out.println("견종은 " + myDog1.getKind() + "입니다. 나이는 " + myDog1.getAge() + "살 입니다.");
            System.out.println("아직 어려서 " + myDog1.bark()+"라고 울면서 저를 부릅니다.\n");

            System.out.println("제 두 번째 애견의 이름은 " + myDog2.getName() + "입니다.");
            System.out.println("견종은 " + myDog2.getKind() + "입니다. 나이는 " + myDog2.getAge() + "살 입니다.");
            System.out.println("아직 어려서 " + myDog2.bark() +"라고 울면서 저를 부릅니다.\n");

            System.out.println("제 세 번째 애견의 이름은 " + myDog3.getName() + "입니다.");
            System.out.println("견종은 " + myDog3.getKind() + "입니다. 나이는 " + myDog3.getAge() + "살 입니다.");
            System.out.println("늠름하게 " + myDog3.bark() +"라고 울면서 저를 부릅니다.\n");

    }
}
