package com.example.wrkspot.wrkspottask;

public class Student {
    private String name;
    private int age;
    private int registerNumber;
    private int batch;
    private int mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void studentDetails()
    {
        System.out.println("\n");
        System.out.println("   Student Name : "+name);
        System.out.println("    Student Age : "+age);
        System.out.println("  Mobile Number : "+mobileNumber);
        System.out.println("          Batch : "+batch);
        System.out.println("Register Number : "+registerNumber);
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        Student student1=new Student();
        student1.setName("Saran");
        student1.setAge(20);
        student1.setRegisterNumber(6080);
        student1.setBatch(1);
        student1.setMobileNumber(1234);
        student1.studentDetails();

        Student student2=new Student();
        student2.setName("Kevin");
        student2.setAge(21);
        student2.setRegisterNumber(6743);
        student2.setBatch(2);
        student2.setMobileNumber(6789);
        student2.studentDetails();

        Student student3=new Student();
        student3.setName("Kavin");
        student3.setAge(19);
        student3.setRegisterNumber(6038);
        student3.setBatch(3);
        student3.setMobileNumber(1432);
        student3.studentDetails();

    }
}
