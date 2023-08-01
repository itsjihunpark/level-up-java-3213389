package com.linkedin.javacodechallenges;

public class Person {
  /**
   * Should really put in a security measures to
   * prevent invalid ages and empty names
   * But we'll assume that if someone calls this
   * function, they'll pass in valid inputs
   */
  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  protected void setAge(int age) {
    if (age < this.age) {
      System.out.println("You can't make a person younger!");
    } else {
      this.age = age;
    }

  }

  protected int getAge() {
    return this.age;
  }

  protected String introduction() {
    return ("My name is " + this.firstName + " "
        + this.lastName + " and I am " + this.age + " years old");
  }
}
