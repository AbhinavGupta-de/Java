package oops.entities;

import java.util.ArrayList;
import java.util.List;

public class Batch {

 protected String name;
 protected String startDate;
 protected String endDate;
 protected List<Student> students;
 protected Instructor instructor;

 public Batch(String name, String startDate, String endDate) {
  this.name = name;
  this.startDate = startDate;
  this.endDate = endDate;
 }

 public void setInstructor(Instructor instructor) {
  this.instructor = instructor;
 }

 public void addStudent(Student student) {
  this.students.add(student);
 }

 public void removeStudent(Student student) {
  this.students.remove(student);
 }

 public String getName() {
  return this.name;
 }

 public String getStartDate() {
  return this.startDate;
 }

 public String getEndDate() {
  return this.endDate;
 }

 public List<Student> getStudents() {
  return this.students;
 }

 public Instructor getInstructor() {
  return this.instructor;
 }

 // A deep copy constructor
 public Batch(Batch batch) {

  this.name = batch.name;
  this.startDate = batch.startDate;
  this.endDate = batch.endDate;
  this.students = new ArrayList<>(batch.students);
  this.instructor = new Instructor(batch.instructor);
 }
}
