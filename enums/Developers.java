package enums;

enum Status {
  Running("Running... All good"),
  Failed("Try again... Failed"),
  Pending("Pending... Please wait for sometime..."),
  Success("Done!");

  private String message;

  private Status(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}

public class Developers {

  public static void main(String[] args) {

    Status s = Status.Running;
    System.out.println(s.getMessage());

    Status[] statuses = Status.values();

    for (Status status : statuses) {
      System.out.println(status + " : " + status.ordinal());
    }

    switch (s) {
      case Running:
        System.out.println(Status.Running.getMessage());
        break;
      case Failed:
        System.out.println(Status.Failed.getMessage());
        break;
      case Pending:
        System.out.println(Status.Pending.getMessage());
        break;
      default:
        System.out.println(Status.Success.getMessage());
        break;
    }

    if (s == Status.Failed) {
      System.out.println(Status.Failed.getMessage());
    } else if (s == Status.Pending) {
      System.out.println(Status.Pending.getMessage());
    } else if (s == Status.Running) {
      System.out.println(Status.Running.getMessage());
    } else {
      System.out.println(Status.Success.getMessage());
    }

  }

}