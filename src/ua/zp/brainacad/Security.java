package ua.zp.brainacad;

public class Security extends Employee {
    public Security(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public String talkRadio() {
        return " и говорит по рации";

    }
    @Override
    public void work(){
        System.out.println("Охранник следит за клиентами" + talkRadio());

    }


}
