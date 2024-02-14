package lambdaExpression;

@FunctionalInterface
interface Flying {
 void fly();
}

@FunctionalInterface
interface Kicking {
 void kick(int i);
}

public class Demo {
 public static void main(String[] args) {

  // Old way using anonymous object to get object of inteface
  Flying obj = new Flying() {
   public void fly() {
    System.out.println("fly!!");
   }
  };

  obj.fly();

  // new way using lambda expression
  Flying obj2 = () -> {
   System.out.println("damnnn");
  };

  obj2.fly();

  // even better

  Flying obj3 = () -> System.out.println("I am the king!");

  obj3.fly();

  // How to accept paramters
  // you don't need to mention the type of the paramter as you have already
  // defined that in the interface
  Kicking kicck = i -> System.out.println("Kick " + i + " times!!");

  kicck.kick(5);
 }

}
