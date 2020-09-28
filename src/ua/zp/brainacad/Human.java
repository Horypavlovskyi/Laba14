package ua.zp.brainacad;

import java.util.Objects;

public class Human {
    private String fullName;
    private String dateBirth;
    private String telephone;

    public static void hello() {
        System.out.println("Hello");
    }
    public static void goodbye() {
        System.out.println("Goodbye");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(fullName, human.fullName) &&
                Objects.equals(dateBirth, human.dateBirth) &&
                Objects.equals(telephone, human.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dateBirth, telephone);
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public Human(String fullName, String telephone) {
        this.fullName = fullName;
        this.telephone = telephone;
    }
}
