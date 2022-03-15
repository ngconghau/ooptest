package net.liftechvn.model;


public  class Teacher extends PersonalInfo{
    private  int salary;

    public Teacher(String name, int age, String address, String phone, int salary) {
        super(name, age, address, phone);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
