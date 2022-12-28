package week7.Wap;
// 16.person
// Write a class with the name Person. The class needs three fields (instance variables) with the names
//firstName, lastName of type String and age of type int.

public class Person {
    String firstname;
    String lastname;
    int age;

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is setto Smith
        System.out.println("fullName= " + person.getFullName());

    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge()
        {
            return age;
        }

        public void setFirstName (String firstname){
            this.firstname = firstname;
        }
        public void setLastName (String lastname)
        {
            this.lastname = lastname;
        }
        public void setAge ( int age) {
            if (age > 0 && age < 100) {
                this.age = age;
            } else {
                this.age = 0;
            }

        }
        public boolean isTeen () {

            if (age > 12 && age < 20) {
                return true;
            } else {
                return false; }
            }

            public String getFullName () {

                if (firstname.isEmpty()) {
                    return lastname;
                }
                if (lastname.isEmpty()) {
                    return firstname;
                } else {
                    return firstname + "" + lastname;
                }

            }


        }






