package coders.may9;

public class User {
    private String name;
    private String surname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name)  {
        if (name.length() > 3 && name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            try {
                throw new Exception("Ad 3 simvoldan kicik ve ya diger simvollardan istifade etmek olmaz");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() > 3 && surname.matches("[a-zA-Z]+")) {
            this.surname = surname;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("SALAM/");
    }
}
