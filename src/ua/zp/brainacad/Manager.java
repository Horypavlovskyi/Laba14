package ua.zp.brainacad;

import java.util.Objects;

public class Manager extends Employee {
    private String Department;

    public Manager(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public String consult(){
       return " и консультирует";

    }
    public String talkDiscount(){
        return ", также рассказывает о дисконте";
    }
    public String advice(){
        return " и в конце даёт совет";
    }

        @Override
        public void work(){
            System.out.println("Менеджер предоставляет сервис" + consult() + talkDiscount() + advice());


        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(Department, manager.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Department='" + Department + '\'' +
                '}';
    }
}
