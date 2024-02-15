package oops.entities;

public class Student {

 protected String name;
 protected String email;
 private String password;
 protected int psp;
 protected Mentor mentor;
 protected TeachingAssistant ta;

 public Student(String name, String email, String password, int psp) {
  this.name = name;
  this.email = email;
  this.password = password;
  this.psp = psp;
 }

 public void setMentor(Mentor mentor) {
  this.mentor = mentor;
 }

 public void setTa(TeachingAssistant ta) {
  this.ta = ta;
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

 public int getPsp() {
  return this.psp;
 }

 public Mentor getMentor() {
  return this.mentor;
 }

 public TeachingAssistant getTa() {
  return this.ta;
 }

 public void setPsp(int psp) {
  this.psp = psp;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public void setName(String name) {
  this.name = name;
 }

}
