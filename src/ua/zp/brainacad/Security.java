package ua.zp.brainacad;

public class Security extends Employee {
    public String talkRadio() {
        return "Talk on the radio";

    }
    @Override
    public void work(){
        System.out.println("Theft protection" + " + " + talkRadio());

    }


}
