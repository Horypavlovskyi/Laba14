package ua.zp.brainacad;

import java.util.Objects;

public class Manager extends Employee {
    private String Department;


    public String consult(){
       return "Consult";

    }
    public String talkDiscount(){
        return "Talk about Discount";
    }
    public String advice(){
        return "Give Advice";
    }

        @Override
        public void work(){
            System.out.println("Service" + " + " + consult() + " + " + talkDiscount() + " + " + advice());


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
