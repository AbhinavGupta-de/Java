package oops.entities;

enum Level {
 JUNIOR, INTERMEDIATE, LEAD, SENIOR
}

public class Instructor {

 protected String name;
 protected String email;
 private String password;
 protected Level level;

 public Instructor(String name, String email, String password, Level level) {
  this.name = name;
  this.email = email;
  this.password = password;
  this.level = level;
 }

 public Instructor(Instructor instructor) {
  this.name = instructor.name;
  this.email = instructor.email;
  this.password = instructor.password;
  this.level = instructor.level;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getPassword() {
  return this.password;
 }

 public String getName() {
  return this.name;
 }

 public String getEmail() {
  return this.email;
 }

 public Level getLevel() {
  return this.level;
 }

 // create a deepcopy constructor here

}
