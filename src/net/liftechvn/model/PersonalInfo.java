package net.liftechvn.model;

/**
 * This is a normal class with the name PersonalInfo.
 * This class has private properties and public methods
 * to hide the important information of the property
 * and can only change them through public methods.
 * <p>
 * when we instantiate an object, all the properties and methods will be Encapsulated in that object,
 * we can interact with the object through the public method
 */
public class PersonalInfo {
    private String name;
    private int age;
    private String address;
    private String phone;

    /**
     * this is default constructor to initialized object without parameter
     */
    public PersonalInfo() {
    }

    public PersonalInfo(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    /**
     * This is getter method using get fee of person
     *
     * @return name of person
     */

    public String getName() {
        return name;
    }

    /**
     * This is getter method using set name of person
     *
     * @param name of person
     */

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This is method to show personal information include name, age, address, phone
     * The method is written to show the difference in inheritance in the parent class and the child class.
     * See also this method in Student class to understand
     * */
    public String display() {
        return "Name: " + name+ "Age: " + age+ "Address: " + address + "Phone:" + phone;
    }
}
