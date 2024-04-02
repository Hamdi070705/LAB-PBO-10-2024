package Praktikum2;
public class Tugas2No1 {
    public static void main(String[] args) {
        Person hamdi = new Person();
        hamdi.setName("Hamdi");
        hamdi.setAge(19);
        hamdi.setGender(true);

        System.out.println("Name: " + hamdi.getName());
        System.out.println("Age: " + hamdi.getAge());
        System.out.println("Gender: " + hamdi.getGender());
    }
}
class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale){
    this.isMale = isMale;
    }

    public String getGender() {
        if (isMale){
            return "Male";
        } else {
            return "Female";
        }
    }
}