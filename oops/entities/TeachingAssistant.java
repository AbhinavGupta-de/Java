package oops.entities;

public class TeachingAssistant {

 protected String email;
 protected String name;
 private String password;
 private String company;

 public TeachingAssistant(String name, String email, String password, String company) {
  this.name = name;
  this.email = email;
  this.password = password;
  this.company = company;
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

 public String getCompany() {
  return this.company;
 }

}
