package enums;

enum Status {
 Running, Failed, Pending, Success;
}

public class Developers {

 public static void main(String[] args) {

  Status s = Status.Running;
  System.out.println(s);

  Status[] statuses = Status.values();

  for (Status status : statuses) {
   System.out.println(status + " : " + status.ordinal());
  }

  switch (s) {
   case Running:
    System.out.println("Running... All good");
    break;
   case Failed:
    System.out.println("Try again... Failed");
    break;
   case Pending:
    System.out.println("Pening... Please wait for sometime...");
    break;
   default:
    System.out.println("Done!");
    break;
  }

  if (s == Status.Failed) {
   System.out.println("Try again... Failed");
  } else if (s == Status.Pending) {
   System.out.println("Pening... Please wait for sometime...");
  } else if (s == Status.Running) {
   System.out.println("Running... All good");
  } else {
   System.out.println("Done!");
  }

 }

}