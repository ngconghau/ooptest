package net.liftechvn.model;


/**
 * Class Student extends class PersonalInfo, so it inherits all the properties and methods of the parent class
 *
 * As you know the private keyword fields are not accessible outside the class
 * but I still put it in the PersonalInfo class and
 * I can still access it in the Student class. This is explained as follows:
 *    - Private field 'name'  in class PersonalInfo is kind of inherited to Student but Student can't access it directly.
 */
public class Student extends PersonalInfo {
    private int fee;

    /**
     * this is default constructor to initialized object without parameter
     */
    public Student() {
        super();
    }

    /**
     * this is overloading constructor with
     *
     * @param name    of student
     * @param age     of student
     * @param address of student
     * @param phone   of student
     * @param fee     of student
     */
    public Student(String name, int age, String address, String phone, int fee) {
        super(name, age, address, phone); /**The super keyword refers to superclass (parent) constructor.*/
        this.fee = fee;
    }

    /**
     * This is getter method using get fee of student
     *
     * @return fee of student
     */
    public int getFee() {
        return fee;
    }

    /**
     * This is setter method using set fee of student
     *
     * @param fee of student
     */
    public void setFee(int fee) {
        this.fee = fee;
    }

    /**
     * This is a method that overrides its parent method and is prefixed with @Override on top of the method
     * The purpose is to display all the required information of a student, which is not clearly shown in the parent class
     * */
    @Override
    public String display() {
        return "name= " + super.getName() + ", age= " + super.getAge() + ", address= "
                + super.getAddress() + ", phone= " + super.getPhone() + ", fee= " + fee;
        /**The super keyword refers to superclass (parent) method.*/
    }
}
